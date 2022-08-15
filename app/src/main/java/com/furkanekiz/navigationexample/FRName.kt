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
import com.furkanekiz.navigationexample.databinding.FrNameBinding

class FRName : Fragment() {

    private lateinit var binding: FrNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_name, container, false)

        binding.btnNext.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etName.text.toString())) {
                val bundleName: Bundle = bundleOf("user_name" to binding.etName.text.toString())
                it.findNavController().navigate(R.id.action_FRName_to_FREmail, bundleName)
            } else {
                Toast.makeText(activity, "Please insert your name", Toast.LENGTH_LONG).show()
            }

        }

        return binding.root
    }

}