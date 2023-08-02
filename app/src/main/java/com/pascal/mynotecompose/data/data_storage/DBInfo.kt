package com.pascal.mynotecompose.data.data_storage

object DBInfo {

    const val NOTE_TABLE_NAME = "notes"

    object NoteTable{
        const val ID_COLUMN = "id"
        const val TITLE_COLUMN = "column"
        const val CONTENT_COLUMN = "content"
        const val COLOR_COLUMN = "color"
        const val TIMESTAMP_COLUMN = "timestamp"
    }
}