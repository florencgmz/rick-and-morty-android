package com.florgmz.rickandmorty_android.app.framework.source

import androidx.lifecycle.MutableLiveData
import com.florgmz.rickandmorty_android.app.framework.model.CharactersResponse
import com.florgmz.rickandmorty_android.app.framework.model.Resource
import com.florgmz.rickandmorty_android.app.framework.model.SingleCharacter

interface CharactersRemoteSource {
    suspend fun getCharactersList(): Resource<CharactersResponse>
    suspend fun getCharacterById(id: String): Resource<SingleCharacter>
}