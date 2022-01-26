package com.haditorfi.dictionary.feature.presentation

import com.haditorfi.dictionary.feature.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
