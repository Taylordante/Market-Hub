
package com.dancun.markethub.ui.screens.onboarding

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dancun.markethub.R
import com.dancun.markethub.ui.theme.Pink40
import com.dancun.markethub.ui.theme.Pink80

@Composable
fun OnBoardingScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){

            Image(
                painter = painterResource(R.drawable.detective),
                contentDescription = "Product Image",
                modifier = Modifier.size(128.dp),
            )
Text(
            text = "WELCOME TO MARKETHUB",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif

        )
Text(
    text = "Shop Smarter,",
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    color = Color.Black
)
        Spacer(modifier = Modifier.height(5.dp))

Text(
    text = "everywhere you go",
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold
)
        Spacer(modifier = Modifier.height(5.dp))

Text(
    text = "This is an online platform that allows businesses to sell products or services directly to consumers , other businesses or via marketplaces",
    fontSize = 15.sp,
    textAlign = TextAlign.Center
)
        Spacer(modifier = Modifier.height(5.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(330.dp)
        ){
            Text(text = "Get Started")

        }





    }





}

@Preview(showBackground =true )
@Composable
fun OnBoardingScreenPreview(){
    OnBoardingScreen()





}