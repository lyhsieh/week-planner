package com.example.weedplanter

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.AddNewEventBinding
import com.example.weedplanter.databinding.CongratsBinding

class AddNewEventFragment : Fragment() {
    private var _binding: AddNewEventBinding? = null
    private val mToDoViewModel: ToDoViewModel by viewModels()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = AddNewEventBinding.inflate(inflater, container, false)
        val view = binding.root

        // Set Menu
        setHasOptionsMenu(true)

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}