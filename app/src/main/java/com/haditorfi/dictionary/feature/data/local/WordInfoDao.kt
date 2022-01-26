package com.haditorfi.dictionary.feature.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.haditorfi.dictionary.feature.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {
    @Insert(onConflict = REPLACE)
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE word IN(:words) ")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("SELECT * FROM wordinfoentity WHERE '%'|| :word || '%'")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>
}