package com.pascal.mynotecompose.presentation.screens.notes_screen

import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.domain.utils.NoteOrder
import com.pascal.mynotecompose.domain.utils.OrderType

data class NotesScreenState(
    val notes: List<Note>,
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)