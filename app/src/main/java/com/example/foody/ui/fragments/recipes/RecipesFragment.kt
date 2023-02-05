package com.example.foody.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foody.databinding.ActivityMainBinding
import com.example.foody.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {
    private lateinit var binding: FragmentRecipesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRecipesBinding.inflate(layoutInflater)
        val view = binding.root
        binding.recyclerView.showShimmer()
        return view
    }
}
