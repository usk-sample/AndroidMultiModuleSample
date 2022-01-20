package com.example.androidmultimodulesample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.domain.Feature1Logic
import com.example.domain.RepoModel

class MainViewModel(
    private val feature1Logic: Feature1Logic = Feature1Logic()
): ViewModel() {

    val repos: LiveData<List<RepoModel>> = feature1Logic.listRepos().asLiveData()

    //TODO: userを指定して実行するためにはどのようにするか

}