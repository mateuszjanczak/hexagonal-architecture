package com.mateuszjanczak.demo.infrastructure.jpa.adapter

import com.mateuszjanczak.demo.domain.model.Note
import com.mateuszjanczak.demo.domain.ports.spi.NotePersistencePort
import com.mateuszjanczak.demo.infrastructure.jpa.mapper.NoteMapper
import com.mateuszjanczak.demo.infrastructure.jpa.repository.NoteRepository

class NoteAdapter(
    private val noteRepository: NoteRepository
) : NotePersistencePort {

    override fun addNote(note: Note) {
        noteRepository.save(NoteMapper.noteEntity(note))
    }

    override fun removeNote(note: Note) {
        noteRepository.delete(NoteMapper.noteEntity(note))
    }

    override fun getNotes(): List<Note> = noteRepository.findAll().map { NoteMapper.note(it) }

    override fun getNoteById(id: Long): Note = NoteMapper.note(noteRepository.getById(id))
}