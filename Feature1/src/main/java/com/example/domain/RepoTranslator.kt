package com.example.domain

import com.example.infrastructure.api.RepoResponse

internal class RepoTranslator {
    companion object {
        fun convert(repoResponse: RepoResponse): RepoModel {
            return RepoModel(
                id = repoResponse.id,
                name = repoResponse.name,
                private = repoResponse.private
            )
        }
    }
}