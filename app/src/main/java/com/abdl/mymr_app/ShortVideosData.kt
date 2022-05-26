package com.abdl.mymr_app

object ShortVideosData {

    private val heroesImages = intArrayOf(R.drawable.jurnalistik,
        R.drawable.kaderisasi,
        R.drawable.ldk,
        R.drawable.kemuslimahan,
        R.drawable.mai,
        R.drawable.pei,
        R.drawable.qurani,
        R.drawable.syida,
        R.drawable.tahfidz,
        R.drawable.uic)

    val listData: ArrayList<ShortVideos>
        get() {
            val list = arrayListOf<ShortVideos>()
            for (position in heroesImages.indices) {
                val hero = ShortVideos()
                hero.picture = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}