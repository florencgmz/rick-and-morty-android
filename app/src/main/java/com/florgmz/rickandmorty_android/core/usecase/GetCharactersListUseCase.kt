package com.florgmz.rickandmorty_android.core.usecase

import com.florgmz.rickandmorty_android.app.framework.model.CharactersResponse
import com.florgmz.rickandmorty_android.core.data.repository.CharactersRepository

interface GetCharactersListUseCase {
    suspend fun call(): CharactersResponse
}

class GetCharactersListUseCaseImpl(private val repository: CharactersRepository): GetCharactersListUseCase {
    override suspend fun call(): CharactersResponse {
        return repository.getCharactersList()
    }
}