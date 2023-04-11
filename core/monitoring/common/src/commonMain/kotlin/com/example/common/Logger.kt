package com.example.common

interface Logger

expect inline fun Logger.log(someLog: String)
