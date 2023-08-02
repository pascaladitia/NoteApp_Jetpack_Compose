package com.pascal.mynotecompose.domain.user_case

import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}