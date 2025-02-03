// QRListScreen.kt
package com.wunnakyaw.qrgenerator.presentation.qr_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wunnakyaw.qrgenerator.data.models.QRItem
import com.wunnakyaw.qrgenerator.presentation.components.QRListItem
import com.wunnakyaw.qrgenerator.utils.ImageUtils
import com.wunnakyaw.qrgenerator.utils.Routes

@Composable
fun QRListScreen(
    navigateNext: (String) -> Unit,
    viewModel: QRListViewModel = viewModel()
) {
    // Observe the list of items from the ViewModel.
    val items by remember { viewModel.items }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(items) { item ->
            QRListItem(
                item = item,
                onClick = {
                    // Normally, navigation to the detail page would occur here.
                     navigateNext(Routes.QR_DETAIL_SCREEN)
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QRListScreenPreview() {
    QRListScreen(navigateNext = {})
}