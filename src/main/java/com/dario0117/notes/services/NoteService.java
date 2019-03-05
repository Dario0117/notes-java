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
    /*private List<Note> noteList = Arrays.asList(
            new Note(1, "Title 1", "Content 1"),
            new Note(2, "Title 2", "Content 2"),
            new Note(3, "Title 3", "Content 3"),
            new Note(4, "Title 4", "Content 4"),
            new Note(5, "Title 5", "Content 5")
    );*/

    public Note save(Note note) {
        return noteRepository.save(note);
        //return note;
    }

    public Iterable<Note> findAll() {
        return noteRepository.findAll();
        //return noteList;
    }

    public Note findOne(Integer id) {
        return noteRepository.findOne(id);
        //return noteList.stream().filter(n -> n.getId() == id).findFirst().get();
    }
}
