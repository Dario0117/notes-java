package com.dario0117.notes.controllers;

import com.dario0117.notes.entities.Note;
import com.dario0117.notes.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note create(Note note) {
        return noteService.save(note);
    }

    @GetMapping
    public Iterable<Note> index() {
        return noteService.findAll();
    }

    @GetMapping(value = "{id}")
    public Note getById(@PathVariable Integer id) {
        return noteService.findOne(id);
    }
}