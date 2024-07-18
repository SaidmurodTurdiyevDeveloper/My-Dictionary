package uz.smt.mydictionary.data.models

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/18/2024  5:02 PM  Asus Rog
 */
data class DictionaryData(
    val id: String,
    val name: String,
    val description: String
)

fun getEmptyDictionaryData(
    id: String?=null,
    name: String?=null,
    description: String?=null
):DictionaryData{
    return DictionaryData(
        id = id?:"",
        name = name?:"",
        description = description?:""
    )
}
