package com.reloader.firestoremvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.reloader.firestoremvvm.Usuario
import com.reloader.firestoremvvm.domain.Repo

class MainViewModel : ViewModel() {

    val repo = Repo()
    fun fetchUserData(): LiveData<MutableList<Usuario>> {
        val mutableData = MutableLiveData<MutableList<Usuario>>()
        repo.getUserData().observeForever { userList ->
            mutableData.value = userList
        }
        return mutableData
    }
}