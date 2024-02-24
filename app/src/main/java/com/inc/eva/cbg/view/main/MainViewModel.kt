package com.inc.eva.cbg.view.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inc.eva.cbg.network.entity.Category
import com.inc.eva.cbg.network.repository.RemoteRepository
import com.inc.eva.cbg.utils.launchIO
import com.inc.eva.cbg.utils.mvvm.SingleEventLiveData
import com.inc.eva.cbg.utils.withMain
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val remoteRepository: RemoteRepository,
) : ViewModel() {
    val items = SingleEventLiveData<MutableList<Category>>()

    init {
        getCategories()
    }

    private fun getCategories() {
        viewModelScope.launchIO(
            {
                val categories = remoteRepository.getCategories().toMutableList()
                withMain { items.value = categories }
            },
            { Timber.e(it) },
        )
    }
}
