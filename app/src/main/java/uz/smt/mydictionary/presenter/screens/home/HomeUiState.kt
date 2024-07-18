package uz.smt.mydictionary.presenter.screens.home

import uz.smt.mydictionary.data.models.DictionaryData
import uz.smt.mydictionary.data.models.UserError

/**
 *  This file is created by Saidmurod Turdiyev SMT for PlanningApp app
 *  7/16/2024  3:47 PM  Asus Rog
 */
data class HomeUiState(
    val isLoading: Boolean = true,
    val error: UserError? = null,
    val list: List<DictionaryData> = emptyList()
)
