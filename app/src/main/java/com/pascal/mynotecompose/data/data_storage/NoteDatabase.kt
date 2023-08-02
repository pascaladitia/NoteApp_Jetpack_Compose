package com.pascal.mynotecompose.data.data_storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pascal.mynotecompose.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao
}