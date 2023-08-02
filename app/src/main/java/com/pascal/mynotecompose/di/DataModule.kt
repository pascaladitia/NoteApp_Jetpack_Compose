package com.pascal.mynotecompose.di

import android.content.Context
import androidx.room.Room
import com.pascal.mynotecompose.data.data_storage.NoteDao
import com.pascal.mynotecompose.data.data_storage.NoteDatabase
import com.pascal.mynotecompose.data.repository.NoteRepositoryImpl
import com.pascal.mynotecompose.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Singleton
    @Binds
    fun bindNoteRepository(impl: NoteRepositoryImpl): NoteRepository

    companion object {
        @Singleton
        @Provides
        fun provideDatabase(@ApplicationContext context: Context): NoteDatabase {
            return Room
                .databaseBuilder(context, NoteDatabase::class.java, "note_db")
                .build()
        }

        @Singleton
        @Provides
        fun provideNoteDao(noteDb: NoteDatabase): NoteDao {
            return noteDb.noteDao()
        }
    }
}