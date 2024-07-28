package uz.smt.mydictionary.utils.pref

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/25/2024  4:46 PM  Asus Rog
 */
class StringPreference(private val pref: SharedPreferences, private val defValue: String = "") : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String = pref.getString(property.name, defValue) ?: defValue

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        pref.edit {
            putString(property.name, value)
            apply()
        }
    }
}