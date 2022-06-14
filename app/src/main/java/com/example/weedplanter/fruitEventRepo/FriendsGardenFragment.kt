package com.example.weedplanter.fruitEventRepo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.R
import com.example.weedplanter.fruitEventRepo.FruitEvent
import com.example.weedplanter.fruitEventRepo.FriendsGardenViewModel
import com.example.weedplanter.databinding.FragmentFriendsGardenBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.invoke
import kotlinx.coroutines.withContext

class FriendsGardenFragment: Fragment() {
    private var binding: FragmentFriendsGardenBinding? = null
    private val friendsGardenViewModel: FriendsGardenViewModel by activityViewModels()
    private var fruitEventList = mutableListOf<FruitEvent>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentFriendsGardenBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fruitEventList = friendsGardenViewModel.getFruitEvents()
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            FruitEventsRecycler.adapter = FruitEventsAdapter(fruitEventList)
            /*
            GetFruitEventsButton.setOnClickListener{
                fruitEventList = friendsGardenViewModel.getFruitEvents()
                for (i in 1..fruitEventList.size) {
                    Log.d("get", fruitEventList[i - 1].id)
                    Log.d("get", fruitEventList[i - 1].username)
                    Log.d("get", fruitEventList[i - 1].fruit)
                }
                val tmp = FruitEventsAdapter(fruitEventList)
                FruitEventsRecycler.swapAdapter(tmp, true)
            }
            */

            /*
            UploadFruitEventButton.setOnClickListener {
                friendsGardenViewModel.uploadFruitEvent("John", "Cena")
            }
            */
            BackToMyGarden.setOnClickListener {
                findNavController().navigate(R.id.action_friendsGardenFragment_to_myGardenFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}