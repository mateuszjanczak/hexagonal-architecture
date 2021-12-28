package com.mateuszjanczak.demo.application.api

import com.mateuszjanczak.demo.domain.model.Note

interface NoteService {

    fun addNote(note: Note)

    fun removeNote(note: Note)

    fun getNotes(): List<Note>

    fun getNote(id: Long): Note
}