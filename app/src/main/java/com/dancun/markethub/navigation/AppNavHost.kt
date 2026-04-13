package com.glory.chezeabei.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dancun.markethub.navigation.ROUT_ABOUT
import com.dancun.markethub.navigation.ROUT_HOME
import com.dancun.markethub.navigation.ROUT_INTENT
import com.dancun.markethub.navigation.ROUT_LOGIN
import com.dancun.markethub.navigation.ROUT_ONBOARDING
import com.dancun.markethub.navigation.ROUT_PAYMENT
import com.dancun.markethub.navigation.ROUT_SERVICE
import com.dancun.markethub.ui.screens.auth.LoginScreen
import com.dancun.markethub.ui.screens.payment.PaymentScreen
import com.dancun.markethub.ui.screens.service.ServiceScreen
import com.kennedy.markethub.ui.screens.about.AboutScreen
import com.kennedy.markethub.ui.screens.home.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }




        }















    }

@Composable
fun IntentScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}


