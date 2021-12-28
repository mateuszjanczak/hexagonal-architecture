package com.mateuszjanczak.demo.application.configuration

import com.mateuszjanczak.demo.application.adapter.NoteServiceAdapter
import com.mateuszjanczak.demo.domain.spi.NotePersistencePort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun getNoteService(notePersistencePort: NotePersistencePort) = NoteServiceAdapter(notePersistencePort)
}