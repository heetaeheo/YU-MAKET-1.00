package com.example.myapplication23.screen.home.homelist

import androidx.lifecycle.MutableLiveData
import com.example.myapplication23.data.repository.restaurant.HomeRepository
import com.example.myapplication23.model.homelist.HomeItemModel

import kotlinx.coroutines.Job

class HomeListViewModel(
    private val homeCategory: HomeCategory,
    private val homeRepository: HomeRepository
) : BaseViewModel() {
    val homeListData = MutableLiveData<List<HomeItemModel>>()

    override fun fetchData(): Job = viewModelScope.launch {
        // TODO stub
        homeListData.value = homeRepository.getList(homeCategory)
    }
}