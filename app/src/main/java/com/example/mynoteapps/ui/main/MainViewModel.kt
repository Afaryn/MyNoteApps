package com.example.mynoteapps.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mynoteapps.db.Note
import com.example.mynoteapps.respository.NoteRespository

class MainViewModel(application: Application):ViewModel() {
    private val mNoteRespository:NoteRespository = NoteRespository(application)

    fun getAllNotes():LiveData<List<Note>> = mNoteRespository.getAllNotes()
}