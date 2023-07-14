package com.example.fragmentexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.R
import com.example.fragmentexample.databinding.FragmentFivefragmentBinding


class fivefragment : Fragment() {

    private  lateinit var binding:FragmentFivefragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFivefragmentBinding.inflate(inflater,container,false)






        return  binding.root
    }

}