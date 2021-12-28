package com.mateuszjanczak.demo.infrastructure.rest

import com.mateuszjanczak.demo.domain.model.Note
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

interface NoteController {

    @PostMapping("/notes")
    fun addNote(@RequestBody note: Note): ResponseEntity<Unit>

    @DeleteMapping("/notes")
    fun removeNote(@RequestBody note: Note): ResponseEntity<Unit>

    @GetMapping("/notes")
    fun getNotes(): ResponseEntity<List<Note>>

    @GetMapping("/notes/{id}")
    fun getNoteById(@PathVariable id: Long): ResponseEntity<Note>
}