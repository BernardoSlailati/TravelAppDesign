package com.slailati.android.travelappdesign.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.slailati.android.travelappdesign.databinding.FragmentHomeBinding
import com.slailati.android.travelappdesign.ui.adapter.CategoryAdapter
import com.slailati.android.travelappdesign.ui.adapter.NearbyResidenceAdapter
import com.slailati.android.travelappdesign.ui.adapter.PopularPlaceAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run {
            requireContext().apply {
                rvCategory.adapter = CategoryAdapter(this)
                rvPopularPlace.adapter = PopularPlaceAdapter(this)
                rvNearbyResidence.adapter = NearbyResidenceAdapter(this)
            }
        }
    }

}