package com.example.socialmedia20.Data

import android.net.Uri

data class User(
    val uid: String ="",
    val displayName: String?="",
    val imageUrl: String ="",
    val phoneNo:String="",
    val emailId:String="",
    val save: ArrayList<String> = ArrayList(),
    val post: ArrayList<String> = ArrayList()
    )