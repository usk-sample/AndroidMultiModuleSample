package com.example.domain

import android.util.Log
import com.example.infrastructure.api.Api
import com.example.infrastructure.store.DataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

class Feature1Logic(
    private val api: Api = Api(),
    private val store: DataStore = DataStore()
) {

    fun listRepos(user: String): Flow<List<RepoModel>> {
        return flow {
            try {
                emit(api.service.listRepos(user).execute().body()!!.map { RepoTranslator.convert(it) })
            } catch (e: Exception) {
                Log.e("Feature1Logic", e.toString())
                emit(listOf())
            }
        }.flowOn(Dispatchers.IO)
    }

}