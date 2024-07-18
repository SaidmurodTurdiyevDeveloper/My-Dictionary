package uz.smt.mydictionary.presenter.screens.home

/**
 *  This file is created by Saidmurod Turdiyev SMT for PlanningApp app
 *  7/16/2024  8:31 PM  Asus Rog
 */
sealed interface HomeIntent {
    data class OpenItem(val id:String): HomeIntent
}