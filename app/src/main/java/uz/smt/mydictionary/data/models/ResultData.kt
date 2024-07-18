package uz.smt.mydictionary.data.models

/**
 *  This file is created by Saidmurod Turdiyev SMT for PlanningApp app
 *  7/16/2024  4:29 PM  Asus Rog
 */
sealed class ResultData<T> {
    data class Success<T>(var result: T) : ResultData<T>()
    data class Error<T>(
        override val message: String? = null,
        override val error: Throwable? = null,
        override val data: T?=null
    ) : UserError<T>(message = message, error = error, data = data)
}