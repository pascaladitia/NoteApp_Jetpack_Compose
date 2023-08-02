package com.pascal.mynotecompose.domain.user_case

import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(
    private val repository: NoteRepository
) {

    operator fun invoke(id: Int): Flow<Note?> {
        return repository.getNote(id)
    }
}