package uz.smt.mydictionary.data.sorage.local.shared

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import uz.smt.mydictionary.utils.pref.BooleanPreference
import javax.inject.Inject
import javax.inject.Singleton

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/24/2024  12:38 PM  Asus Rog
 */
private const val MySharedPreferenceDatabase = "dictionary_storage_pref"

@Singleton
class SharedLocalStorage @Inject constructor(
    @ApplicationContext
    private val context: Context
) {
    private val pref = context.getSharedPreferences(MySharedPreferenceDatabase, Context.MODE_PRIVATE)
    var isEnterBefore by BooleanPreference(pref = pref)
}
