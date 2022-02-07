package com.mateuszjanczak.demo.application

import com.mateuszjanczak.demo.domain.ports.api.NoteServicePort
import com.mateuszjanczak.demo.domain.model.Note
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NoteController(
    private val noteServicePort: NoteServicePort
) {

    @PostMapping("/notes")
    fun addNote(note: Note): ResponseEntity<Unit> = ResponseEntity(noteServicePort.addNote(note), HttpStatus.OK)

    @DeleteMapping("/notes")
    fun removeNote(note: Note): ResponseEntity<Unit> = ResponseEntity(noteServicePort.removeNote(note), HttpStatus.OK)

    @GetMapping("/notes")
    fun getNotes(): ResponseEntity<List<Note>> = ResponseEntity(noteServicePort.getNotes(), HttpStatus.OK)

    @GetMapping("/notes/{id}")
    fun getNoteById(@PathVariable id: Long): ResponseEntity<Note> = ResponseEntity(noteServicePort.getNote(id), HttpStatus.OK)
}