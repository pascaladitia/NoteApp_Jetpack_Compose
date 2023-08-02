package com.pascal.mynotecompose.domain.model

import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import com.pascal.mynotecompose.ui.theme.Orange
import com.pascal.mynotecompose.ui.theme.Pantone
import com.pascal.mynotecompose.ui.theme.Purple80

data class Note(
    val title: String,
    val content: String,
    val color: Int,
    val timestamp: Long,
    val id: Int? = null
){
    companion object{
        val noteColors = listOf(Purple80, Pantone, DarkGray, Orange, Black)
    }
}
