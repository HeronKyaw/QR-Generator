package com.wunnakyaw.qrgenerator.presentation.qr_list

import android.graphics.Bitmap
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wunnakyaw.qrgenerator.data.models.QRItem
import com.wunnakyaw.qrgenerator.utils.ImageUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Date

class QRListViewModel : ViewModel() {
    // Holds the list of QR items
    private val _items = mutableStateOf<List<QRItem>>(emptyList())
    val items = _items

    init {
        // Simulate loading data with a delay.
        viewModelScope.launch {
            delay(1000)
            _items.value = dummyData()
        }
    }

    fun deleteItem(item: QRItem) {
        _items.value = _items.value.filterNot { it.id == item.id }
    }

    private fun dummyData(): List<QRItem> {
        // Create a dummy Bitmap (a simple colored square)
        val dummyBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888).apply {
            eraseColor(android.graphics.Color.RED)
        }
        // Convert the Bitmap to a ByteArray using your ImageUtils
        val dummyByteArray = ImageUtils.bitmapToByteArray(dummyBitmap)

        return listOf(
            QRItem(1, "QR Code 1", Date(), dummyByteArray),
            QRItem(2, "QR Code 2", Date(), dummyByteArray),
            QRItem(3, "QR Code 3", Date(), dummyByteArray)
        )
    }
}