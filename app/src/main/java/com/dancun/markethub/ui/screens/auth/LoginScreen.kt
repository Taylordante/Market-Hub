package com.dancun.markethub.ui.screens.auth
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dancun.markethub.R
import com.dancun.markethub.navigation.ROUT_HOME
import com.dancun.markethub.navigation.ROUT_REGISTER
import com.dancun.markethub.ui.theme.Pink40

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(com.dancun.markethub.R.drawable.login),
            contentDescription = "Product Image",
            modifier = Modifier.size(128.dp),
        )



        Text(
            text = "Welcome Back!",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)

        )

        Spacer(modifier = Modifier.width(20.dp))

        //Variables
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label = { Text(text = "Enter Username") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Pink40,
                focusedTextColor = Color.Yellow
            )

        )

        Spacer(modifier = Modifier.width(20.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text(text = "Enter Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Pink40,
                focusedTextColor = Color.Yellow
            ),
            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.width(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(330.dp)
        ){

            Text(
                text = "Login Now")

        }

        Spacer(modifier = Modifier.width(20.dp))

        TextButton(
            onClick = { navController.navigate(ROUT_REGISTER) },) {
            Text(text = "Don't have an account? Login")

        }
        TextButton(
            onClick = { navController.navigate(ROUT_HOME) },) {
            Text(text = "Go to Home")

        }








    }




}

@Preview(showBackground =true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}