package com.example.weedplanter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.weedplanter.databinding.CongratsBinding
import kotlin.random.Random


class CongratsFragment : Fragment() {
    private var _binding: CongratsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val viewModel = MyGardenViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CongratsBinding.inflate(inflater, container, false)
        _binding!!.congratsFragment = this@CongratsFragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val randomValues = Random.nextInt(0, 100)
        _binding!!.congratsFragment = this@CongratsFragment

        if(randomValues < 20) {
            viewModel.rewardApple()
//            binding.imageView.setImageDrawable(R.drawable.apple)
            binding.imageView.setImageResource(R.drawable.apple)
            // fruit = R.drawable.apple
//            fruitImage!!.setImageResource(R.drawable.apple)
        }
        else if (randomValues < 40) {
            viewModel.rewardBanana()
            binding.imageView.setImageResource(R.drawable.banana)

            //fruit = R.drawable.apple
            //fruitImage!!.setImageResource(R.drawable.apple)
        }
        else if (randomValues < 60) {
            viewModel.rewardWatermelon()
            binding.imageView.setImageResource(R.drawable.watermelon)

            //fruit = R.drawable.apple
            //fruitImage!!.setImageResource(R.drawable.apple)
        }
        else if (randomValues < 80) {
            binding.imageView.setImageResource(R.drawable.grape)
            viewModel.rewardGrape()
            //fruit = R.drawable.apple
            //fruitImage!!.setImageResource(R.drawable.apple)
        }
        else  {
            binding.imageView.setImageResource(R.drawable.lemon)
            viewModel.rewardLemon()
            //fruit = R.drawable.apple
            //fruitImage!!.setImageResource(R.drawable.apple)
        }

    }

    fun myGarden() {
        findNavController().navigate(R.id.action_congratsFragment_to_myGardenFragment)
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