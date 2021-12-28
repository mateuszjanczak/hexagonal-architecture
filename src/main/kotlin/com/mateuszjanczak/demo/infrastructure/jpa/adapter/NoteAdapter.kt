package com.mateuszjanczak.demo.infrastructure.jpa.adapter

import com.mateuszjanczak.demo.domain.model.Note
import com.mateuszjanczak.demo.domain.spi.NotePersistencePort
import com.mateuszjanczak.demo.infrastructure.jpa.mapper.NoteMapper
import com.mateuszjanczak.demo.infrastructure.jpa.repository.NoteRepository

class NoteAdapter(
    private val noteRepository: NoteRepository,
    private val noteMapper: NoteMapper
) : NotePersistencePort {

    override fun addNote(note: Note) {
        noteRepository.save(noteMapper.noteEntity(note))
    }

    override fun removeNote(note: Note) {
        noteRepository.delete(noteMapper.noteEntity(note))
    }

    override fun getNotes(): List<Note> = noteRepository.findAll().map { noteMapper.note(it) }

    override fun getNoteById(id: Long): Note = noteMapper.note(noteRepository.getById(id))
}