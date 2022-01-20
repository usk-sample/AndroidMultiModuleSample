package com.example.androidmultimodulesample

import androidx.lifecycle.*
import com.example.domain.Feature1Logic
import com.example.domain.RepoModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel(
    private val feature1Logic: Feature1Logic = Feature1Logic()
): ViewModel() {

    private val _repos: MutableLiveData<List<RepoModel>> = MutableLiveData()
    val repos: LiveData<List<RepoModel>> = _repos

    fun listRepo(user: String) {
        viewModelScope.launch {
            feature1Logic.listRepos()
                .collect {
                    _repos.postValue(it)
                }
        }
    }
    
}