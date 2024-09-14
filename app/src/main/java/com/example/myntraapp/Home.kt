package com.example.myntraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

data class ImageItem(val resourceId: Int, val name: String)

val imagesList = listOf(
    ImageItem(R.drawable.bengaluru, "Karnataka"),
    ImageItem(R.drawable.rajasthan, "Rajasthan"),
    ImageItem(R.drawable.indiagate, "Delhi"),
    ImageItem(R.drawable.mumbai, "Mumbai"),
    ImageItem(R.drawable.punjab, "Punjab"),
    ImageItem(R.drawable.tajmahal, "Uttar Pradesh"),
    ImageItem(R.drawable.tamilnadu, "Tamil Nadu"),
    ImageItem(R.drawable.bengaluru, "Karnataka")
)


@Composable
fun ItemCard(item: ImageItem) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = item.resourceId),
            contentDescription = item.name,
            modifier = Modifier
                .width(70.dp)
                .aspectRatio(1f)
                .fillMaxWidth()
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = item.name,
            modifier = Modifier.padding(horizontal = 45.dp)
        )
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(bottomStart = 22.dp, bottomEnd = 22.dp))
                    .background(colorResource(id = R.color.blue))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Choose A City Guide To Explore",
                    style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
                    fontSize = 23.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Discover your city or next destination",
                    style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Light),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .padding(18.dp)
                    .weight(1f),
                contentPadding = PaddingValues(18.dp),
                verticalArrangement = Arrangement.spacedBy(28.dp),
                horizontalArrangement = Arrangement.spacedBy(28.dp)
            ) {
                items(imagesList) { item ->
                    ItemCard(item)
                }
            }
        }


        Button(
            onClick = { navController.navigate("thirdPage") },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 90.dp)
                .height(50.dp)
                .width(400.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(id = R.color.blue)

            ),
            elevation = ButtonDefaults.elevation(0.dp)

        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(text = "Confirm",
                    color = Color.White,
                    modifier = Modifier.width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp

                )

//                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = " Arrow",
//                    tint = colorResource(id = R.color.white),
//                    modifier = Modifier.size(20.dp)
//                    )
            }
        }
        Button(
            onClick = { navController.navigate("thirdPage") },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
                .height(50.dp)
                .width(400.dp)
                .border(2.dp, colorResource(id = R.color.blue), shape = RoundedCornerShape(8.dp)),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colorResource(id = R.color.white)
            ),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Text(text = "Show All",
                color = Color.Black)
        }
    }
}


