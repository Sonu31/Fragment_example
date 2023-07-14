package com.example.fragmentexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.R
import com.example.fragmentexample.databinding.FragmentSecfragmentBinding

class secfragment : Fragment() {

    private  lateinit var binding:FragmentSecfragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecfragmentBinding.inflate(inflater,container,false)

     binding.btn3.setOnClickListener {

     }


        return binding.root
    }

}