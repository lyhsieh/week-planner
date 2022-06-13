package com.example.weedplanter


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import com.example.weedplanter.databinding.FragmentMyGardenBinding
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.databinding.DayModeBinding

class MyGardenFragment : Fragment() {

    private var _binding: FragmentMyGardenBinding? = null
    private val viewModel = MyGardenViewModel()
    private val binding get() = _binding!!
    private val sharedViewModel : MyGardenViewModel by activityViewModels()
    //    private val viewModel = sharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyGardenBinding.inflate(inflater, container, false)
        return binding.root
//        val fragmentBinding = FragmentMyGardenBinding.inflate(inflater, container, false)
//        binding = fragmentBinding
//        return fragmentBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FragmentMyGardenBinding.inflate(layoutInflater)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding?.apply {
//            // Specify the fragment as the lifecycle owner
////            lifecycleOwner = viewLifecycleOwner
//
//            // Assign the view model to a property in the binding class
//            viewModel = sharedViewModel
//
//            // Assign the fragment
//            myGardenFragment = this@MyGardenFragment
//        }
        setView()
        binding?.button2?.setOnClickListener{back()}

    }


    private fun back(){
        findNavController().navigate(R.id.action_myGardenFragment_to_listFragment)
    }

    private fun setView(){
        if(viewModel.apples.value!! >= 1) binding.apple1.visibility = View.VISIBLE;
        if(viewModel.apples.value!! >= 2) binding.apple2.visibility = View.VISIBLE;
        if(viewModel.apples.value!! >= 3) binding.apple3.visibility = View.VISIBLE;
        if(viewModel.bananas.value!! >= 1) binding.banana1.visibility = View.VISIBLE;
        if(viewModel.bananas.value!! >= 2) binding.banana2.visibility = View.VISIBLE;
        if(viewModel.bananas.value!! >= 3) binding.banana3.visibility = View.VISIBLE;
        if(viewModel.grapes.value!! >= 1) binding.grape1.visibility = View.VISIBLE;
        if(viewModel.grapes.value!! >= 2) binding.grape2.visibility = View.VISIBLE;
        if(viewModel.grapes.value!! >= 3) binding.grape3.visibility = View.VISIBLE;
        if(viewModel.lemons.value!! >= 1) binding.lemon1.visibility = View.VISIBLE;
        if(viewModel.lemons.value!! >= 2) binding.lemon2.visibility = View.VISIBLE;
        if(viewModel.lemons.value!! >= 3) binding.lemon3.visibility = View.VISIBLE;
        if(viewModel.watermelons.value!! >= 1) binding.watermelon1.visibility = View.VISIBLE;
        if(viewModel.watermelons.value!! >= 2) binding.watermelon2.visibility = View.VISIBLE;
        if(viewModel.watermelons.value!! >= 3) binding.watermelon3.visibility = View.VISIBLE;
    }
//


}