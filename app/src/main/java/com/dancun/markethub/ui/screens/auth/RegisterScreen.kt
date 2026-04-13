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
import com.dancun.markethub.navigation.ROUT_LOGIN
import com.dancun.markethub.navigation.ROUT_REGISTER
import com.dancun.markethub.ui.theme.Pink40

@Composable
fun RegisterScreen(navController: NavController){
    Column(
        modifier = Modifier
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(
            painter = painterResource(com.dancun.markethub.R.drawable.register),
            contentDescription = "Product Image",
            modifier = Modifier.size(300.dp),
        )



        Text(
            text = "Join Us And Start Your Journey Today",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(start = 20.dp)

        )


        Spacer(modifier = Modifier.width(20.dp))

        //Variables
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }


        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
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
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label = { Text(text = "Enter Email") },
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
            )

        )

        Spacer(modifier = Modifier.width(20.dp))

        OutlinedTextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text(text = "Confirm Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Pink40,
                focusedTextColor = Color.Yellow
            ),
            visualTransformation = PasswordVisualTransformation()

        )



        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(330.dp)
        ){

            Text(text = "Register")

        }

        Spacer(modifier = Modifier.width(20.dp))

        TextButton(
            onClick = { navController.navigate(ROUT_LOGIN) },) {
            Text(text = "Already have an account? Login")


        }





    }




}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())







}
