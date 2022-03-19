package com.example.myapplication23.screen.myinfo.customerservice.list.detail

import com.example.myapplication23.data.repository.myinfo.CSRepository
import kotlinx.coroutines.Job

class CSDetailViewModel(
    private val csRepository: CSRepository
) : BaseViewModel() {

    override fun fetchData(): Job = viewModelScope.launch {


    }
}