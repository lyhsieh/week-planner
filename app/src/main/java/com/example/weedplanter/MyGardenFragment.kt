package com.example.weedplanter


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

import com.example.weedplanter.databinding.FragmentMyGardenBinding
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.databinding.AddNewEventBinding
import com.example.weedplanter.databinding.DayModeBinding

class MyGardenFragment : Fragment() {

    private var _binding: FragmentMyGardenBinding? = null
    //    private val viewModel = MyGardenViewModel()
    private val binding get() = _binding!!
    private val sharedViewModel : MyGardenViewModel by activityViewModels()
    //    private val viewModel = sharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        _binding = FragmentMyGardenBinding.inflate(inflater, container, false)
//        return binding.root
        _binding = FragmentMyGardenBinding.inflate(inflater, container, false)
        _binding!!.myGardenFragment = this@MyGardenFragment
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FragmentMyGardenBinding.inflate(layoutInflater)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            // Specify the fragment as the lifecycle owner


            // Assign the view model to a property in the binding class
            viewModel = sharedViewModel
            lifecycleOwner = viewLifecycleOwner
            // Assign the fragment
            myGardenFragment = this@MyGardenFragment

        }

//        Log.d("GardenFragmentApple", sharedViewModel.apples.value!!.toString())
//        Log.d("GardenFragmentBanana", sharedViewModel.bananas.value!!.toString())
//        Log.d("GardenFragmentLemon", sharedViewModel.lemons.value!!.toString())
//        Log.d("GardenFragmentGrape", sharedViewModel.grapes.value!!.toString())
//        Log.d("GardenFragmentWater", sharedViewModel.watermelons.value!!.toString())
        Log.d("GardenFragmentApple", sharedViewModel.apple.toString())
        Log.d("GardenFragmentBanana", sharedViewModel.banana.toString())
        Log.d("GardenFragmentLemon", sharedViewModel.lemon.toString())
        Log.d("GardenFragmentGrape", sharedViewModel.grape.toString())
        Log.d("GardenFragmentWater", sharedViewModel.watermelon.toString())
        setView()
        binding?.button2?.setOnClickListener{back()}

    }


    private fun back(){
        findNavController().navigate(R.id.action_myGardenFragment_to_listFragment)
    }

    private fun setView(){
//        if(sharedViewModel.apples.value!! >= 1) binding.apple1.visibility = View.VISIBLE;
//        if(sharedViewModel.apples.value!! >= 2) binding.apple2.visibility = View.VISIBLE;
//        if(sharedViewModel.apples.value!! >= 3) binding.apple3.visibility = View.VISIBLE;
//        if(sharedViewModel.bananas.value!! >= 1) binding.banana1.visibility = View.VISIBLE;
//        if(sharedViewModel.bananas.value!! >= 2) binding.banana2.visibility = View.VISIBLE;
//        if(sharedViewModel.bananas.value!! >= 3) binding.banana3.visibility = View.VISIBLE;
//        if(sharedViewModel.grapes.value!! >= 1) binding.grape1.visibility = View.VISIBLE;
//        if(sharedViewModel.grapes.value!! >= 2) binding.grape2.visibility = View.VISIBLE;
//        if(sharedViewModel.grapes.value!! >= 3) binding.grape3.visibility = View.VISIBLE;
//        if(sharedViewModel.lemons.value!! >= 1) binding.lemon1.visibility = View.VISIBLE;
//        if(sharedViewModel.lemons.value!! >= 2) binding.lemon2.visibility = View.VISIBLE;
//        if(sharedViewModel.lemons.value!! >= 3) binding.lemon3.visibility = View.VISIBLE;
//        if(sharedViewModel.watermelons.value!! >= 1) binding.watermelon1.visibility = View.VISIBLE;
//        if(sharedViewModel.watermelons.value!! >= 2) binding.watermelon2.visibility = View.VISIBLE;
//        if(sharedViewModel.watermelons.value!! >= 3) binding.watermelon3.visibility = View.VISIBLE;
        if(GlobalVariable.apple >= 1) binding.apple1.visibility = View.VISIBLE;
        if(GlobalVariable.apple >= 2) binding.apple2.visibility = View.VISIBLE;
        if(GlobalVariable.apple >= 3) binding.apple3.visibility = View.VISIBLE;
        if(GlobalVariable.banana >= 1) binding.banana1.visibility = View.VISIBLE;
        if(GlobalVariable.banana >= 2) binding.banana2.visibility = View.VISIBLE;
        if(GlobalVariable.banana >= 3) binding.banana3.visibility = View.VISIBLE;
        if(GlobalVariable.grape >= 1) binding.grape1.visibility = View.VISIBLE;
        if(GlobalVariable.grape >= 2) binding.grape2.visibility = View.VISIBLE;
        if(GlobalVariable.grape >= 3) binding.grape3.visibility = View.VISIBLE;
        if(GlobalVariable.lemon >= 1) binding.lemon1.visibility = View.VISIBLE;
        if(GlobalVariable.lemon >= 2) binding.lemon2.visibility = View.VISIBLE;
        if(GlobalVariable.lemon >= 3) binding.lemon3.visibility = View.VISIBLE;
        if(GlobalVariable.watermelon >= 1) binding.watermelon1.visibility = View.VISIBLE;
        if(GlobalVariable.watermelon >= 2) binding.watermelon2.visibility = View.VISIBLE;
        if(GlobalVariable.watermelon >= 3) binding.watermelon3.visibility = View.VISIBLE;
    }
//


}