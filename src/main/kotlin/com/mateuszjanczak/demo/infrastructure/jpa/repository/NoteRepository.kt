package com.mateuszjanczak.demo.infrastructure.jpa.repository

import com.mateuszjanczak.demo.infrastructure.jpa.entity.NoteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepository : JpaRepository<NoteEntity, Long>