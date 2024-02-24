package com.inc.eva.cbg.view.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inc.eva.cbg.network.entity.Category
import com.inc.eva.cbg.network.repository.RemoteRepository
import com.inc.eva.cbg.utils.launchIO
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel
    @Inject
    constructor(
        private val remoteRepository: RemoteRepository,
    ) : ViewModel() {
        val items = MutableLiveData<MutableList<Category>>()

        init {
            getCategories()
        }

        private fun getCategories() {
            viewModelScope.launchIO(
                { items.postValue(remoteRepository.getCategories().toMutableList()) },
                { Timber.e(it) },
            )
        }
    }
