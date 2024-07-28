package uz.smt.mydictionary.data.sorage.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  2:10 PM  Asus Rog
 */
@Entity
data class DictionaryEntity(
    @PrimaryKey(autoGenerate = true)
    val uId: Int = -1,
    val id: String,
    val name: String,
    val description: String
)
