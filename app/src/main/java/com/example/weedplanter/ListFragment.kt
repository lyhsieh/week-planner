package com.example.weedplanter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.weedplanter.data.ToDoData
import com.example.weedplanter.data.ToDoViewModel
import com.example.weedplanter.databinding.DayModeBinding


class ListFragment : Fragment() {

    private var _binding: DayModeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val mToDoViewModel: ToDoViewModel by activityViewModels()

    private val adapter: EventAdapter by lazy { EventAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DayModeBinding.inflate(inflater, container, false)
        _binding!!.listFragment = this@ListFragment
        setupRecyclerview()
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            listFragment = this@ListFragment
        }
    }
    private fun setupRecyclerview() {
        val recyclerView = binding.recycleView
        recyclerView.adapter = adapter
        recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mToDoViewModel.sortByTime.observe(
            viewLifecycleOwner
        ) {
            adapter.setData(it)
        }
    }


    fun addNewEvent() {
        findNavController().navigate(R.id.action_listFragment_to_addNewEventFragment)
    }
    fun reset() {
        mToDoViewModel.deleteAll()
    }
    fun detail(Id: Int) {
        Log.e("E","hello")
        val action = ListFragmentDirections.actionListFragmentToEventDetailFragment(Id)
        findNavController().navigate(action)
    }
    fun detail0() {
        Log.e("E","hello")
        findNavController().navigate(R.id.action_listFragment_to_eventDetailFragment)
    }
    fun myGarden() {
        findNavController().navigate(R.id.action_listFragment_to_myGardenFragment)
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