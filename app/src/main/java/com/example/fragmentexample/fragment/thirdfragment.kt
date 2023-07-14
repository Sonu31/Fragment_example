package com.example.fragmentexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentexample.R
import com.example.fragmentexample.databinding.FragmentThirdfragmentBinding

class thirdfragment : Fragment() {


    private  lateinit var binding:FragmentThirdfragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdfragmentBinding.inflate(inflater,container,false)





        return  binding.root

    }

}