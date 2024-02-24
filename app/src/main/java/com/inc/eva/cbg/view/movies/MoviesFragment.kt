package com.inc.eva.cbg.view.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.inc.eva.cbg.databinding.FragmentMoviesBinding
import com.inc.eva.cbg.view.base.BaseFragment
import com.inc.eva.cbg.view.movies.adapter.MovieAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoviesFragment : BaseFragment<FragmentMoviesBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMoviesBinding =
        FragmentMoviesBinding::inflate

    private val viewModel: MovieViewModel by viewModels()

    private val adapter by lazy { MovieAdapter() }

    private val args by navArgs<MoviesFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMovies.adapter = adapter

        viewModel.items.observe(viewLifecycleOwner) { adapter.setItems(it.docs) }

        viewModel.getMovies(args.categories)
    }
}