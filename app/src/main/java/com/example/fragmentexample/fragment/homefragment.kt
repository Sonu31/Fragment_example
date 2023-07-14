package com.example.fragmentexample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentexample.R
import com.example.fragmentexample.databinding.FragmentHomefragmentBinding

class homefragment : Fragment() {

    private  lateinit var binding: FragmentHomefragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomefragmentBinding.inflate(inflater,container,false)


        binding.btn1.setOnClickListener {
            it.findNavController().navigate(R.id.action_homefragment_to_secfragment)

        }

        binding.btn2.setOnClickListener {
            it.findNavController().navigate(R.id.action_homefragment_to_thirdfragment)

        }



        return  binding.root

        // Inflate the layout for this fragment
    }

}