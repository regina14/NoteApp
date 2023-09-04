package com.example.noteapp.screen

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.noteapp.data.NoteDataSource
import com.example.noteapp.model.Note

class NoteViewModel: ViewModel() {
    private var noteList = mutableStateListOf<Note>()

    init{
        noteList.addAll(NoteDataSource().loadNotes())
    }
    fun addNote(note: Note){
        noteList.add(note)
    }

    fun removeNote(note:Note) {
        Log.i("", "remove here: ${note.title}")
        Log.i("", "pre list: ${noteList.size}")
        noteList.remove(note)
        Log.i("", "after list: ${noteList.size}")
    }

    fun getAllNotes(): List<Note>{
        return noteList
    }
}