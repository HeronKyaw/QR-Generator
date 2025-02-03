package com.wunnakyaw.qrgenerator.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.wunnakyaw.qrgenerator.presentation.qr_detail.QRDetailScreen
import com.wunnakyaw.qrgenerator.presentation.qr_list.QRListScreen

object Routes {
    const val QR_LIST_SCREEN = "QR_LIST_SCREEN"
    const val QR_DETAIL_SCREEN = "QR_DETAIL_SCREEN"
}

/**
 * This composable encapsulates the navigation graph.
 *
 * @param startDestination The start destination route.
 * @param navController The [NavHostController] to manage app navigation.
 */
@Composable
fun AppRoutes(
    startDestination: String,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Routes.QR_LIST_SCREEN) {
            QRListScreen(
                navigateNext = { route ->
                    navController.navigate(route)
                }
            )
        }

        composable(Routes.QR_DETAIL_SCREEN) {
            QRDetailScreen()
        }
    }
}
