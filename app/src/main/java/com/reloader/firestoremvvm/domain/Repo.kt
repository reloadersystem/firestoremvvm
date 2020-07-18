package com.reloader.firestoremvvm.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.reloader.firestoremvvm.Usuario

class Repo {

    fun getUserData(): LiveData<MutableList<Usuario>> {
        val mutableData = MutableLiveData<MutableList<Usuario>>()
    }
}