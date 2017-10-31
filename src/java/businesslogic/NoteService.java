/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import dataaccess.NoteDB;
import dataaccess.NotesDBException;
import domainmodel.Note;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 677571
 */
public class NoteService {

    private NoteDB db;
    
    public NoteService(){
        db = new NoteDB();
    }
    
    public Note getNote(int noteId) throws NotesDBException{
        return db.getNote(noteId);
    }
    
    public List<Note> getNotes() throws NotesDBException{
        return db.getAll();
    }
    
    public int update(int noteId, String contents) throws NotesDBException{
       Note note = getNote(noteId);
       note.setContents(contents);
       return db.update(note);
    }
    
    public int delete(int noteId) throws NotesDBException{
        Note note = getNote(noteId);
        return db.delete(note);
    }
    
    public int insert(String contents) throws NotesDBException{
        Note note = new Note(new Date(), contents);
        return db.insert(note);
    }
}
