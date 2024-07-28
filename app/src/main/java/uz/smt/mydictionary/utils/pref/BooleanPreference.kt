package uz.smt.mydictionary.utils.pref

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/25/2024  2:41 PM  Asus Rog
 */
class BooleanPreference(
    private val pref:SharedPreferences,
    private val defaultValue:Boolean=false
):ReadWriteProperty<Any,Boolean> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Boolean =pref.getBoolean(property.name,defaultValue)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        pref.edit {
            putBoolean(property.name,value)
            apply()
        }
    }
}