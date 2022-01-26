package com.haditorfi.dictionary.feature.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.haditorfi.dictionary.feature.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
abstract class WordInfoDatabase : RoomDatabase() {
    abstract val dao: WordInfoDao
}