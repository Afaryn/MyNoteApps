package com.example.mynoteapps.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.mynoteapps.db.Note
import com.example.mynoteapps.respository.NoteRespository

class NoteAddUpdateViewModel(application: Application):ViewModel() {
    private val mNoteRespository: NoteRespository = NoteRespository(application)

    fun insert (note: Note){
        mNoteRespository.insert(note)
    }

    fun update(note:Note){
        mNoteRespository.update(note)
    }

    fun delete(note:Note){
        mNoteRespository.delete(note)
    }
}