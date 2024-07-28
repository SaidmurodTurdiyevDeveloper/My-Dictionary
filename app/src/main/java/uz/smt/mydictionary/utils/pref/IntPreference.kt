package uz.smt.mydictionary.utils.pref

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/25/2024  4:43 PM  Asus Rog
 */
class IntPreference(private val pref: SharedPreferences, private val defValue: Int = -1) : ReadWriteProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>): Int = pref.getInt(property.name, defValue)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        pref.edit {
            putInt(property.name, value)
            apply()
        }
    }

}