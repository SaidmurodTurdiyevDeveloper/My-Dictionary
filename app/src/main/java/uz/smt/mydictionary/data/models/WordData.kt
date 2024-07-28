package uz.smt.mydictionary.data.models

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/18/2024  5:03 PM  Asus Rog
 */
data class WordData(
    val id: String,
    val eng: String,
    val ru: String,
    val uzb: String,
    val ruExample: List<String>,
    val uzExample: List<String>,
    val engExample: List<String>,
    val description: String?
)

fun getEmptyWordData(
    id: String? = null,
    eng: String? = null,
    ru: String? = null,
    uzb: String? = null,
    ruExamples: List<String>? = null,
    uzExamples: List<String>? = null,
    engExamples: List<String>? = null,
    description: String? = null
): WordData {
    return WordData(
        id = id ?: "",
        eng = eng ?: "",
        ru = ru ?: "",
        uzb = uzb ?: "",
        ruExample = ruExamples ?: emptyList(),
        engExample = engExamples?: emptyList(),
        uzExample = uzExamples?: emptyList(),
        description = description
    )
}