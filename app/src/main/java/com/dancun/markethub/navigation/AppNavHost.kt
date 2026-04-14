package com.glory.chezeabei.navigation

import androidx.compose.material3.Scaffold
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
import com.dancun.markethub.navigation.ROUT_PAYMENT
import com.dancun.markethub.navigation.ROUT_SCAFFOLD
import com.dancun.markethub.navigation.ROUT_SERVICE
import com.dancun.markethub.navigation.ROUT_SPLASH
import com.dancun.markethub.ui.screens.auth.LoginScreen
import com.dancun.markethub.ui.screens.payment.PaymentScreen
import com.dancun.markethub.ui.screens.scaffold.ScaffoldScreen
import com.dancun.markethub.ui.screens.service.ServiceScreen
import com.dancun.markethub.ui.screens.splash.SplashScreen
import com.kennedy.markethub.ui.screens.about.AboutScreen
import com.kennedy.markethub.ui.screens.home.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
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
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }



        }















    }

@Composable
fun IntentScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}


