
package com.example.springbootbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.springbootbackend.model.Note;
import com.example.springbootbackend.repository.NoteRepository;


@Service
public class NoteService{
	
	@Autowired
	private NoteRepository noteRepository;

	
	public Note saveNote(Note note) {
		return noteRepository.save(note);
	}


	public List<Note> getAllNote() {
		return noteRepository.findAll();
	}
	
	
	public Note getNoteById(long id)
	{
		return noteRepository.findById(id).orElse(null);
	}
	
	
	public String deleteNote(long id)
	{
		noteRepository.deleteById(id);
		return "note has been deleted successfully";
	}
	
	
	public Note updateNote(long id, Note note)
	{
		Note existingNote= noteRepository.findById(id).orElse(null);
		existingNote.setTitle(note.getTitle());
		existingNote.setContent(note.getContent());
		return noteRepository.save(existingNote);
	}


}

