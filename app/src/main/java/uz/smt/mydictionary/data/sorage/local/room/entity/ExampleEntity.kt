package uz.smt.mydictionary.data.sorage.local.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.smt.mydictionary.utils.Language

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  2:25 PM  Asus Rog
 */
@Entity
data class ExampleEntity(
    @PrimaryKey
    val uId:Int=-1,
    val wordId:Int,
    val text:String,
    val language:Language
)
