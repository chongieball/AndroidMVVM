package my.project.chongieball.mvvmkotlin.data.network

class ErrorData(message: String = "", errorCode: String = "", throwable: Throwable? = null) {
    var message: String = message
    var errorCode: String = errorCode
    var throwable: Throwable? = throwable
}