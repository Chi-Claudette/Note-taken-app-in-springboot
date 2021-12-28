package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
