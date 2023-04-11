package core.http.client

import com.example.common.Logger
import com.example.common.log
import core.http.HttpClient

class IOSClient(private val logger: Logger) : HttpClient {

    fun login() {
        logger.log("logging in")
    }
}
