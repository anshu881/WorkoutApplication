package com.example.myntraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun CategoriesScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),  // Add some padding to prevent clipping

            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Logo on the left
                Image(
                    painter = painterResource(id = R.drawable.black),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(80.dp)
                        .width(120.dp)
                )

                // Icons on the right
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Account",
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Shopping Cart",
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp)) // Add some space between the logo and the image

            Image(
                painter = painterResource(id = R.drawable.head),
                contentDescription = "helo",
                modifier = Modifier
                    .width(400.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Spacer(modifier = Modifier.height(16.dp)) // Add space between image and text

            Text(
                text = "Trusted Reviews",
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp)) // Add space between text and row of images

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pink),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxSize()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Women's")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.accessories),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .fillMaxSize()
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Accessories")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.beauty),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxSize()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Beauty")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.apartment),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxSize()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Apartment")
                }
            }
            Spacer(modifier = Modifier.height(16.dp)) // Add space between image and text

            Text(
                text = "City Guides",
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp)) // Add space between text and row of images

            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bengaluru),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxSize()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Bangalore")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mumbai),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxSize()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Mumbai")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.delhi),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxWidth()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Delhi")
                }
                Column(
                    modifier = Modifier.padding(top = 5.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kolkata),
                        contentDescription = "help",
                        modifier = Modifier
                            .width(70.dp)
                            .aspectRatio(1f)
                            .fillMaxWidth()
                            .border(1.dp, androidx.compose.ui.graphics.Color.Cyan, CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "Kolkata")
                }
            }

            Spacer(modifier = Modifier.height(50.dp))


            Text(
                text = "Explore More",
                modifier = Modifier
                    .padding(bottom = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(id = R.drawable.brand),
                contentDescription = null,
                modifier = Modifier.fillMaxSize().padding(20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.apartment), contentDescription = null,
                modifier= Modifier.fillMaxSize().padding(20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.beauty), contentDescription = null,
                modifier= Modifier.fillMaxSize().padding(20.dp)
            )

        }
    }
}