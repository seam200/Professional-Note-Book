package com.example.professionalnoteapps.model
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Notes(
    @PrimaryKey
    val id : Int,
    val noteTitle:String,
    val noteBody:String,
):Parcelable