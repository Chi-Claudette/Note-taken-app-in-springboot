 package com.example.springbootbackend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.dto.SuccessResponse;
import com.example.springbootbackend.model.Note;
import com.example.springbootbackend.service.NoteService;

@CrossOrigin
@RestController

public class NoteController {
	
	@Autowired
	private NoteService noteService;
	
	//create note REST API
	@PostMapping("/api/note")
	public Note saveNote(@RequestBody Note note)
	{

		return noteService.saveNote(note);
	}
	
	//get all notes REST API
	@GetMapping("/api/getNotes")
	public List<Note> getAllNotes()
	{
		return noteService.getAllNote();																																																																																																																																																																																																																		
	}
	
	//get note by id
	@GetMapping("/api/getNote/{id}")
	public Note getNoteById(@PathVariable int id)
	{
		return noteService.getNoteById(id);
	}
	
	//edit note
	@PutMapping("/api/updateNote/{id}")
	public Note updateNote(@PathVariable int id, @RequestBody Note note)
	{
		return noteService.updateNote(id, note);
	}
	
	//delete note by id
	@DeleteMapping("/api/deleteNote/{id}")
	public ResponseEntity<SuccessResponse> deleteNote(@PathVariable int id)
	{
		String message = noteService.deleteNote(id);
		return new ResponseEntity<SuccessResponse>(new SuccessResponse(message, id), HttpStatus.OK);
				
	}
	

}
