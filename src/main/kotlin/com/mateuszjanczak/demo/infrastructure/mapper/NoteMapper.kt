package com.mateuszjanczak.demo.infrastructure.mapper

import com.mateuszjanczak.demo.domain.model.Note
import com.mateuszjanczak.demo.infrastructure.entity.NoteEntity
import org.springframework.beans.BeanUtils

class NoteMapper {

    companion object {
        fun noteEntity(note: Note): NoteEntity {
            val noteEntity = NoteEntity()
            BeanUtils.copyProperties(note, noteEntity)
            return noteEntity
        }

        fun note(noteEntity: NoteEntity): Note {
            val note = Note()
            BeanUtils.copyProperties(noteEntity, note)
            return note
        }
    }
}