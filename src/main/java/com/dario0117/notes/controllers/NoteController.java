package com.dario0117.notes.controllers;

import com.dario0117.notes.entities.Note;
import com.dario0117.notes.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note create(@RequestBody Note note) {
        return noteService.create(note);
    }

    @GetMapping
    public Iterable<Note> index() {
        return noteService.list();
    }

    @GetMapping(value = "{id}")
    public Note getById(@PathVariable Integer id) {
        return noteService.get(id);
    }
}
