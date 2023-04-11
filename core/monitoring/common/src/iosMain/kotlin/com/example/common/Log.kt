package com.example.common

import platform.Foundation.NSLog

actual inline fun Logger.log(someLog: String) {
    NSLog("DEBUG-TAG: %s", someLog)
}
