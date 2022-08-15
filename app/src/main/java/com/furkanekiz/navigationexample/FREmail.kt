package com.furkanekiz.navigationexample

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.furkanekiz.navigationexample.databinding.FrEmailBinding

class FREmail : Fragment() {

    private lateinit var binding: FrEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_email, container, false)

        val inputName = requireArguments().getString("user_name")

        binding.btnSubmit.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etEmail.text.toString())) {
                val bundle: Bundle = bundleOf(
                    "user_email" to binding.etEmail.text.toString(),
                    "user_name" to inputName
                )
                it.findNavController().navigate(R.id.action_FREmail_to_FRWelcome, bundle)
            } else {
                Toast.makeText(activity, "Please insert your email", Toast.LENGTH_LONG).show()
            }

        }

        return binding.root
    }


}