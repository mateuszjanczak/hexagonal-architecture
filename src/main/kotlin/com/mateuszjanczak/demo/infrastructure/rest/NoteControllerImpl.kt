package com.mateuszjanczak.demo.infrastructure.rest

import com.mateuszjanczak.demo.application.api.NoteService
import com.mateuszjanczak.demo.domain.model.Note
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class NoteControllerImpl(
    private val noteService: NoteService
) : NoteController {

    override fun addNote(note: Note): ResponseEntity<Unit> = ResponseEntity(noteService.addNote(note), HttpStatus.OK)

    override fun removeNote(note: Note): ResponseEntity<Unit> = ResponseEntity(noteService.removeNote(note), HttpStatus.OK)

    override fun getNotes(): ResponseEntity<List<Note>> = ResponseEntity(noteService.getNotes(), HttpStatus.OK)

    override fun getNoteById(id: Long): ResponseEntity<Note> = ResponseEntity(noteService.getNote(id), HttpStatus.OK)
}