package com.example.common

import android.util.Log

actual inline fun Logger.log(someLog: String) {
    Log.d("DEBUG-TAG", someLog)
}
