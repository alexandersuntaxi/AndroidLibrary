package com.app.mylibrarybase

class NativeLib {

    /**
     * A native method that is implemented by the 'mylibrarybase' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'mylibrarybase' library on application startup.
        init {
            System.loadLibrary("mylibrarybase")
        }
    }
}