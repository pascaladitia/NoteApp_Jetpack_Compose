package com.pascal.mynotecompose.presentation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pascal.mynotecompose.domain.model.Note
import com.pascal.mynotecompose.presentation.screens.edit_note_screen.EditNoteScreen
import com.pascal.mynotecompose.presentation.screens.notes_screen.NotesScreen
import com.pascal.mynotecompose.presentation.utils.Screen

@Composable
fun NoteNavHost(
    navController: NavHostController = rememberNavController(),
    onNavigateToEditNoteScreen: (Note?) -> Unit,
    onNavigateBackFromEditScreen: () -> Unit
) {
    NavHost(navController = navController, startDestination = Screen.Notes.destination) {
        composable(route = Screen.Notes.destination) {
            NotesScreen(viewModel = hiltViewModel()) {
                onNavigateToEditNoteScreen(it)
            }
        }
        composable(
            route = Screen.EditNote.destination,
            arguments = listOf(
                navArgument(Screen.EditNote.NOTE_ID_KEY) {
                    type = NavType.IntType
                    defaultValue = -1
                }
            )
        ) {
            EditNoteScreen(viewModel = hiltViewModel()) {
                onNavigateBackFromEditScreen()
            }
        }
    }
}