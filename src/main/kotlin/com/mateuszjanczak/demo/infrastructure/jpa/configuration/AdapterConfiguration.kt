package com.mateuszjanczak.demo.infrastructure.jpa.configuration

import com.mateuszjanczak.demo.infrastructure.jpa.adapter.NoteAdapter
import com.mateuszjanczak.demo.infrastructure.jpa.mapper.NoteMapper
import com.mateuszjanczak.demo.infrastructure.jpa.repository.NoteRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AdapterConfiguration {

    @Bean
    fun getNotePersistencePort(noteRepository: NoteRepository, noteMapper: NoteMapper) = NoteAdapter(noteRepository, noteMapper)

    @Bean
    fun getNoteMapper() = NoteMapper()
}