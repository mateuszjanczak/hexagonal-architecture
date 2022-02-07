package com.mateuszjanczak.demo.domain.service

import com.mateuszjanczak.demo.domain.model.Note
import com.mateuszjanczak.demo.domain.ports.api.NoteServicePort
import com.mateuszjanczak.demo.domain.ports.spi.NotePersistencePort

class NoteService(
    private val persistencePort: NotePersistencePort
) : NoteServicePort {

    override fun addNote(note: Note) = persistencePort.addNote(note)

    override fun removeNote(note: Note) = persistencePort.removeNote(note)

    override fun getNotes(): List<Note> = persistencePort.getNotes()

    override fun getNote(id: Long): Note = persistencePort.getNoteById(id)
}