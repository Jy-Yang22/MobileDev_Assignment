package com.example.guardian_of_the_water

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class StaterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stater, container, false)
        //val mainView = inflater.inflate(R.layout.activity_main, container, false)

        val nextBtn = view.findViewById<Button>(R.id.nextPageBtn)
        nextBtn.setOnClickListener()
        {
            Navigation.findNavController(it).navigate(R.id.action_staterFragment_to_eventPage1Fragment)
        }

        return view
    }


}