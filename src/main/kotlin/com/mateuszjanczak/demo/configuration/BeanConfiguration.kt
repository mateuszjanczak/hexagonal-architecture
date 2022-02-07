package com.mateuszjanczak.demo.configuration

import com.mateuszjanczak.demo.domain.service.NoteService
import com.mateuszjanczak.demo.domain.ports.spi.NotePersistencePort
import com.mateuszjanczak.demo.infrastructure.adapter.NoteAdapter
import com.mateuszjanczak.demo.infrastructure.repository.NoteRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {

    @Bean
    fun notePersistencePort(noteRepository: NoteRepository) = NoteAdapter(noteRepository)

    @Bean
    fun noteServicePort(notePersistencePort: NotePersistencePort) = NoteService(notePersistencePort)

}