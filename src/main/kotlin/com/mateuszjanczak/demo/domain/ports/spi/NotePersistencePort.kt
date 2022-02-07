package com.mateuszjanczak.demo.domain.ports.spi

import com.mateuszjanczak.demo.domain.model.Note

interface NotePersistencePort {

    fun addNote(note: Note)

    fun removeNote(note: Note)

    fun getNotes(): List<Note>

    fun getNoteById(id: Long): Note
}