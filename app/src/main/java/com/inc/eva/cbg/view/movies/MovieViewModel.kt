package com.inc.eva.cbg.view.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inc.eva.cbg.network.entity.movies.Movies
import com.inc.eva.cbg.network.repository.RemoteRepository
import com.inc.eva.cbg.utils.launchIO
import com.inc.eva.cbg.utils.withMain
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MovieViewModel
    @Inject
    constructor(
        private val remoteRepository: RemoteRepository,
    ) : ViewModel() {
        val items = MutableLiveData<Movies>()

        fun getMovies(categories: Array<String>) {
            viewModelScope.launchIO(
                {
                    withMain { items.value = remoteRepository.getMoviesByCategory(categories) }
                },
                { Timber.e(it) },
            )
        }
    }
