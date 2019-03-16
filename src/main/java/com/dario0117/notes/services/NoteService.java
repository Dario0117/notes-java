package com.dario0117.notes.services;

import com.dario0117.notes.entities.Note;
import com.dario0117.notes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public Note create(Note note) {
        return noteRepository.save(note);
    }

    public Iterable<Note> list() {
        return noteRepository.findAll();
    }

    public Note get(Integer id) {
        return noteRepository.findOne(id);
    }
}
