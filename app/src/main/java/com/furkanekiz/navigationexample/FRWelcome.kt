package com.furkanekiz.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.furkanekiz.navigationexample.databinding.FrWelcomeBinding


class FRWelcome : Fragment() {

    private lateinit var binding: FrWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_welcome, container, false)

        val inputName = requireArguments().getString("user_name")
        val inputEmail = requireArguments().getString("user_email")

        binding.tvFRWelcomeName.text = inputName
        binding.tvFRWelcomeEmail.text = inputEmail

        binding.btnViewTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_FRWelcome_to_FRTerms)
        }
        return binding.root
    }

}