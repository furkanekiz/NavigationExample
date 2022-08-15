package com.furkanekiz.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.furkanekiz.navigationexample.databinding.FrHomeBinding

class FRHome : Fragment() {

    private lateinit var binding: FrHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_home, container, false)

        binding.btnTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_FRHome_to_FRTerms)
        }

        binding.btnSignUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_FRHome_to_FRName)
        }

        return binding.root
    }


}