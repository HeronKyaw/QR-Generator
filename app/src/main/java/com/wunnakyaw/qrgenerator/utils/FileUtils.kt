package com.wunnakyaw.qrgenerator.utils

import android.content.Context
import android.graphics.Bitmap
import java.io.File
import java.io.FileOutputStream

object FileUtils {

    fun saveBitmapToFile(context: Context, bitmap: Bitmap, fileName: String): File? {
        val file = File(context.getExternalFilesDir(null), "$fileName.png")
        return try {
            val stream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
            stream.flush()
            stream.close()
            file
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
