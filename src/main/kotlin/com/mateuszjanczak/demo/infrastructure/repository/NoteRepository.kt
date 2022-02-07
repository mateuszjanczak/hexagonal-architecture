package com.mateuszjanczak.demo.infrastructure.repository

import com.mateuszjanczak.demo.infrastructure.entity.NoteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepository : JpaRepository<NoteEntity, Long>