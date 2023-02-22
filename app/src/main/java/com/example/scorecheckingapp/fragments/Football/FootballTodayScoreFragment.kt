package com.example.scorecheckingapp.fragments.Football

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.scorecheckingapp.activity.MainActivity
import com.example.scorecheckingapp.adapter.FootballAdapterScore
import com.example.scorecheckingapp.adapter.FootballLeagueAdapter
import com.example.scorecheckingapp.databinding.FragmentFootballTodayScoreBinding

class FootballTodayScoreFragment : Fragment() {

    lateinit var binding: FragmentFootballTodayScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFootballTodayScoreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.footballScoreRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.footballScoreRecyclerView.adapter = FootballLeagueAdapter((activity as MainActivity).globalList, requireContext())


    }

}




















        /*
            displayArray,
            requireContext(),
            object : FootballScoreAdapter.onSingleItemClick{
                override fun clicked(footballScoreDataClass: FootballScoreDataClass) {
                    (context as MainActivity).supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, FootballMatchDetailsFragment(footballScoreDataClass))
                        addToBackStack(null)
                        commit()
                    }
                }

            }*/
//        )





/*
        val displayArray = ArrayList<FootballScoreDataClass>()
        for (i in 0..10) {
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.fc_barcelona,
                    R.drawable.real_madrid,
                    "FC Barcelona",
                    "Real Madrid",
                    5,
                    2
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "FT",
                    R.drawable.arsenal,
                    R.drawable.manchester_city,
                    "Arsenal",
                    "Manchester City",
                    4,
                    3
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.villarreal,
                    R.drawable.juventus,
                    "Villarreal",
                    "Juventus",
                    0,
                    1
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.napoli,
                    R.drawable.olympique_lyonnais,
                    "Napoli",
                    "Lyon",
                    3,
                    2
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.paris_saint_germain,
                    R.drawable.bayern_munchen,
                    "Paris Saint German",
                    "Bayern Munich",
                    5,
                    1
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.roman,
                    R.drawable.napoli,
                    "Roma",
                    "Napoli",
                    3,
                    5
                )
            )
            displayArray.add(
                FootballScoreDataClass(
                    "Live",
                    R.drawable.liverpool,
                    R.drawable.manchester_united,
                    "Liverpool",
                    "Manchester United",
                    5,
                    1
                )
            )
        }*/