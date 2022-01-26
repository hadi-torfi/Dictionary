package com.haditorfi.dictionary.feature.domain.repository

import com.haditorfi.dictionary.core.util.Resource
import com.haditorfi.dictionary.feature.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}