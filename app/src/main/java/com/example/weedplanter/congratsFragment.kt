package com.example.weedplanter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.data.ToDoData
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.AddNewEventBinding
import com.example.weedplanter.databinding.CongratsBinding
import com.example.weedplanter.databinding.FragmentMyGardenBinding
import kotlin.random.Random

class CongratsFragment : Fragment() {
    private var _binding: CongratsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val ViewModel: ToDoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CongratsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = CongratsBinding.inflate(layoutInflater)
    }


    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    val randomValues = List(1) { Random.nextInt(0, 100) }
}