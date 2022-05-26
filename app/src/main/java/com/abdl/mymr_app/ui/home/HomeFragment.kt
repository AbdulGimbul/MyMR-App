package com.abdl.mymr_app.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdl.mymr_app.*
import com.abdl.mymr_app.adapter.ListFeedAdapter
import com.abdl.mymr_app.adapter.ListShortVideoAdapter
import com.abdl.mymr_app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private val list = ArrayList<Feed>()
    private val listSV = ArrayList<ShortVideos>()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvFeed.setHasFixedSize(true)
        list.addAll(HeroesData.listData)
        binding.rvShortVideo.setHasFixedSize(true)
        listSV.addAll(ShortVideosData.listData)
        showRecyclerList()
        showRecyclerShortVideo()
    }

//    private val listFeeds: ArrayList<Feed>
//        get() {
//            val dataName = resources.getStringArray(R.array.data_name)
//            val dataStory = resources.getStringArray(R.array.data_story)
//            val listFeed = ArrayList<Feed>()
//            for (i in dataName.indices){
//                val feed = Feed(dataName[i], dataStory[i])
//                listFeed.add(feed)
//            }
//            return listFeed
//        }

    private fun showRecyclerList(){
        binding.rvFeed.layoutManager = LinearLayoutManager(activity)
        val listFeedAdapter = ListFeedAdapter(list)
        binding.rvFeed.adapter = listFeedAdapter
    }

    private fun showRecyclerShortVideo(){
        binding.rvShortVideo.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listSVAdapter = ListShortVideoAdapter(listSV)
        binding.rvShortVideo.adapter = listSVAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}