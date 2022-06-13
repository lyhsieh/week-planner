package com.example.weedplanter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.weedplanter.data.ToDoData
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.EventDetailBinding
import kotlin.random.Random

class EventDetailFragment : Fragment() {

    private val navigationArgs: EventDetailFragmentArgs by navArgs()
    private var _binding: EventDetailBinding? = null

    lateinit var  data: LiveData<ToDoData>
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val viewModel = MyGardenViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = EventDetailBinding.inflate(inflater, container, false)

        _binding!!.eventDetailFragment = this@EventDetailFragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            eventDetailFragment = this@EventDetailFragment
        }
    }
    fun deleteNewEvent() {
        findNavController().navigate(R.id.action_addNewEventFragment_to_listFragment)
    }
    fun finish() {


        findNavController().navigate(R.id.action_eventDetailFragment_to_congratsFragment)
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