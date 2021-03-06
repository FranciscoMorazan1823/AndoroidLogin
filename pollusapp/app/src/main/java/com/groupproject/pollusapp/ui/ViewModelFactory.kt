package com.dgasteazoro.dummydictionary.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.groupproject.pollusapp.repository.LoginRepository
import com.dgasteazoro.dummydictionary.ui.login.LoginViewModel
import kotlin.IllegalArgumentException

class ViewModelFactory<R>(private val repository: R) :
        ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository as LoginRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}