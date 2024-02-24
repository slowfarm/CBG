package com.inc.eva.cbg.view.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.inc.eva.cbg.databinding.FragmentMainBinding
import com.inc.eva.cbg.utils.hideFabOnScrollDown
import com.inc.eva.cbg.view.base.BaseFragment
import com.inc.eva.cbg.view.main.MainFragmentDirections.Companion.mainToMovies
import com.inc.eva.cbg.view.main.adapter.CategoryAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding =
        FragmentMainBinding::inflate

    private val viewModel: MainViewModel by viewModels()

    private val adapter by lazy { CategoryAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            rvCategories.adapter = adapter
            rvCategories.hideFabOnScrollDown(fab)
            fab.setOnClickListener {
                findNavController().navigate(mainToMovies(adapter.getCheckedCategories()))
            }
        }

        viewModel.items.observe(viewLifecycleOwner) { adapter.items = it }
    }
}
