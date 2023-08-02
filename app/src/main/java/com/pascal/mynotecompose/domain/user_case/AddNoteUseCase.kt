package com.pascal.mynotecompose.domain.user_case

import com.example.noteapp.domain.utils.FieldsNotFieldException
import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val repository: NoteRepository
){

    suspend operator fun invoke(note: Note) {
        if (note.content.isEmpty() || note.title.isEmpty()) throw FieldsNotFieldException()
        repository.insertNote(note)
    }
}