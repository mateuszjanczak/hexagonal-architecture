package com.mateuszjanczak.demo.domain.ports.api

import com.mateuszjanczak.demo.domain.model.Note

interface NoteServicePort {

    fun addNote(note: Note)

    fun removeNote(note: Note)

    fun getNotes(): List<Note>

    fun getNote(id: Long): Note
}