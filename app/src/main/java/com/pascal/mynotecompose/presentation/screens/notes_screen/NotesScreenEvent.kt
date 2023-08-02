package com.pascal.mynotecompose.presentation.screens.notes_screen

import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.domain.utils.NoteOrder

sealed interface NotesScreenEvent{

    data class Order(val noteOrder: NoteOrder): NotesScreenEvent

    data class DeleteNote(val note: Note): NotesScreenEvent

    object ToggleOrderSection: NotesScreenEvent

    object RestoreNote: NotesScreenEvent


}