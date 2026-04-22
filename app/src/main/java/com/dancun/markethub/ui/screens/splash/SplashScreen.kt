package com.dancun.markethub.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dancun.markethub.R
import com.dancun.markethub.navigation.ROUT_ONBOARDING
import com.dancun.markethub.ui.theme.Pink40
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    // Proper way to handle timed navigation in Compose
    LaunchedEffect(Unit) {
        delay(2000) // Give them enough time to see the branding
        navController.navigate(ROUT_ONBOARDING) {
            // Clears the backstack so the user can't "go back" to the splash
            popUpTo("splash") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 1. The Main Image
        Image(
            painter = painterResource(R.drawable.onboarding),
            contentDescription = "MarketHub Logo",
            modifier = Modifier.size(180.dp),
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 2. The App Name
        Text(
            text = "MarketHub",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 3. The Tagline (adds a nice professional touch)
        Text(
            text = "Your daily shopping partner",
            fontSize = 16.sp,
            color = Color.White.copy(alpha = 0.8f),
            fontWeight = FontWeight.Light
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}