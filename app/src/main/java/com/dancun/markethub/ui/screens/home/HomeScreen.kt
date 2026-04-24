package com.dancun.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dancun.markethub.R
import com.dancun.markethub.navigation.ROUT_INTENT
import com.dancun.markethub.ui.theme.Pink40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // --- TopAppBar ---
        TopAppBar(
            title = { Text(text = "MarketHub") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notifications")
                }
                IconButton(onClick = { navController.navigate(ROUT_INTENT) }) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "Next")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Pink40,
                navigationIconContentColor = Color.White,
                titleContentColor = Color.White,
                actionIconContentColor = Color.White,
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        // --- Searchbar ---
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
            placeholder = { Text(text = "Search Products, Category...") },
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // --- Product Categories Section ---
        SectionHeader(title = "Product Categories")

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            CategoryItem(R.drawable.electronics, "Electronics")
            Spacer(modifier = Modifier.width(12.dp))
            CategoryItem(R.drawable.clothes, "Fashion")
            Spacer(modifier = Modifier.width(12.dp))
            // Added Beauty Category
            CategoryItem(R.drawable.jot, "Beauty")
            Spacer(modifier = Modifier.width(12.dp))
            // Added Furniture Category
            CategoryItem(R.drawable.furniture, "Furniture")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // --- Top Selling Products Section ---
        SectionHeader(title = "Top Selling Products")

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            ProductItem(R.drawable.groceries, "Fresh Groceries")
            Spacer(modifier = Modifier.width(12.dp))
            ProductItem(R.drawable.keen, "Sport Shoes")
            Spacer(modifier = Modifier.width(12.dp))
            // Added Watch Product
            ProductItem(R.drawable.watch, "Smart Watch")
            Spacer(modifier = Modifier.width(12.dp))
            // Added Laptop Product
            ProductItem(R.drawable.laptop, "Gaming Laptop")
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 16.dp, bottom = 12.dp)
    )
}

@Composable
fun CategoryItem(imageRes: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = label,
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = label, fontWeight = FontWeight.Medium)
    }
}

@Composable
fun ProductItem(imageRes: Int, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = label,
            modifier = Modifier
                .size(180.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = label, fontWeight = FontWeight.SemiBold)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}
