/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainmodel;

import java.util.Date;

/**
 *
 * @author 677571
 */
public class Note {
    
    private int noteId;
    private Date dateCreated;
    private String contents;

    public Note(Date dateCreated, String contents) {
        this.dateCreated = dateCreated;
        this.contents = contents;
    }
    
    public Note(int noteId, Date dateCreated, String contents){
        this.noteId = noteId;
        this.dateCreated = dateCreated;
        this.contents = contents;
    }

    public int getNoteId() {
        return noteId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getContents() {
        return contents;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
    
    
}
