package uz.smt.mydictionary.data.models

/**
 *  This file is created by Saidmurod Turdiyev SMT for PlanningApp app
 *  7/16/2024  3:49 PM  Asus Rog
 */
sealed class UserError(open val message: String? = null, open val error: Throwable? = null) {
    data object NetworkConnectionError : UserError()
    data class DataNotFindError(override val message: String?) : UserError(message = message)
}
