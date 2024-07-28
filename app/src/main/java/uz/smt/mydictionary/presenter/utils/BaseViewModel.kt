package uz.smt.mydictionary.presenter.utils

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.Objects

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  3:22 PM  Asus Rog
 */
abstract class BaseViewModel<T,K>(defUIState:T):ViewModel() {
    protected val _uiState= MutableStateFlow(defUIState)
    val uiState:StateFlow<T> =_uiState.asStateFlow()
    abstract fun onAction(intent:K)
}