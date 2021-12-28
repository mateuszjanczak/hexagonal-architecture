package com.mateuszjanczak.demo.application.adapter

import com.mateuszjanczak.demo.application.api.NoteService
import com.mateuszjanczak.demo.domain.model.Note
import com.mateuszjanczak.demo.domain.spi.NotePersistencePort

class NoteServiceAdapter(
    private val persistencePort: NotePersistencePort
) : NoteService {

    override fun addNote(note: Note) = persistencePort.addNote(note)

    override fun removeNote(note: Note) = persistencePort.removeNote(note)

    override fun getNotes(): List<Note> = persistencePort.getNotes()

    override fun getNote(id: Long): Note = persistencePort.getNoteById(id)
}