package com.example.weedplanter

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.data.ToDoData
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.AddNewEventBinding

class AddNewEventFragment : Fragment() {
    private var _binding: AddNewEventBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val mToDoViewModel: ToDoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AddNewEventBinding.inflate(inflater, container, false)
        _binding!!.addNewEventFragment = this@AddNewEventFragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            addNewEventFragment = this@AddNewEventFragment
        }
    }
    fun deleteNewEvent() {
        findNavController().navigate(R.id.action_addNewEventFragment_to_listFragment)
    }


    fun saveNewEvent() {
        val nTitle = binding.nameTextInput.text.toString()
        val nTime = binding.timeTextInput.text.toString()
        val nDescription = binding.descriptionTextInput.text.toString()

        val validation = !(nTitle.isEmpty() || nTime.isEmpty())
        if (validation) {
            // Insert data to Database
            val newData = ToDoData(
                title = nTitle,
                time = nTime,
                description = nDescription
            )
            mToDoViewModel.insertData(newData)
            Toast.makeText(requireContext(), "Successfully added", Toast.LENGTH_SHORT).show()
            // Navigate back
            findNavController().navigate(R.id.action_addNewEventFragment_to_listFragment)
        } else {
            Toast.makeText(requireContext(), "Please, fill out title and time fields.", Toast.LENGTH_SHORT)
                .show()
        }

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