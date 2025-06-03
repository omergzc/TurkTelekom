package com.omergezici.turktelekom.ui.fragment

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.setFragmentResult
import com.omergezici.turktelekom.R
import com.omergezici.turktelekom.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {
 private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMainPageBinding.inflate(inflater,container,false)

        binding.textViewInternet.setOnClickListener {

           binding.textViewI.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.main_color))
            binding.textViewM.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
            binding.textViewS.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
        }
        binding.textViewMinute.setOnClickListener {
            binding.textViewM.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.main_color))
            binding.textViewI.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
            binding.textViewS.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
        }
        binding.textViewSMS.setOnClickListener {
            binding.textViewS.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.main_color))
            binding.textViewI.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
            binding.textViewM.setBackgroundColor(ContextCompat.getColor(requireContext(),R.color.gray))
        }




        return binding.root
    }

}