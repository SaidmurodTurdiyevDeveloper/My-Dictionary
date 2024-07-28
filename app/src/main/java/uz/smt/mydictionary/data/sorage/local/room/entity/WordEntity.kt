package uz.smt.mydictionary.data.sorage.local.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  2:22 PM  Asus Rog
 */
@Entity
data class WordEntity(
    @PrimaryKey
    val uId:Int=-1,
    val id: String,
    val eng: String,
    val ru: String,
    val uzb: String,
    val description: String?
)
