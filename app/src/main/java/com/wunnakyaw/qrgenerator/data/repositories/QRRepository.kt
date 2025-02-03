package com.wunnakyaw.qrgenerator.data.repositories

class QRRepository {
    fun getQRCodeList(): List<String> {
        return listOf(
            "QR Code 1",
            "QR Code 2",
            "QR Code 3",
            "QR Code 4",
            "QR Code 5"
        )
    }

    fun createQRCode(name: String): String {
        return "QR Code $name"
    }

    fun updateQRCode(name: String): String {
        return "QR Code $name"
    }

    fun deleteQRCode(name: String): String {
        return "QR Code $name"
    }
}