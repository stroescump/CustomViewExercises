package com.stroescumarius.customviewexercises

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import com.stroescumarius.customviewexercises.databinding.FragmentPricesBinding

class PricesFragment : Fragment() {
    private lateinit var _binding: FragmentPricesBinding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPricesBinding.inflate(inflater)
        setListenersForTextViews()
        return binding.root
    }

    private fun setListenersForTextViews() {
        binding.textView.setOnClickListener {
            val action = PricesFragmentDirections.actionPricesFragmentToPurchaseFragment()
            val navHostFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            navController.navigate(action)

        }
    }

}