package com.wunnakyaw.qrgenerator.data.models

import java.util.Date

data class QRItem(
    val id: Int,
    val title: String,
    val modifiedDate: Date,
    val qrImageByteArray: ByteArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as QRItem

        if (id != other.id) return false
        if (title != other.title) return false
        if (modifiedDate != other.modifiedDate) return false
        if (!qrImageByteArray.contentEquals(other.qrImageByteArray)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + title.hashCode()
        result = 31 * result + modifiedDate.hashCode()
        result = 31 * result + qrImageByteArray.contentHashCode()
        return result
    }
}
