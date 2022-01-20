package com.example.domain

import com.example.infrastructure.api.Api
import com.example.infrastructure.store.DataStore

class Feature1Logic(
    private val api: Api = Api(),
    private val store: DataStore = DataStore()
) {

}