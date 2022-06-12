package com.example.weedplanter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.DayModeBinding


class ListFragment : Fragment() {

    private var _binding: DayModeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val sharedViewModel: ToDoViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DayModeBinding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }

    fun addNewEvent() {
        // TODO: Navigate to the CheckoutFragment
        findNavController().navigate(R.id.action_listFragment_to_addNewEventFragment)
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}