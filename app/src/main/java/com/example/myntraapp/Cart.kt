 package com.example.myntraapp


 import androidx.compose.foundation.Image
 import androidx.compose.foundation.background
 import androidx.compose.foundation.layout.*
 import androidx.compose.foundation.rememberScrollState
 import androidx.compose.foundation.shape.RoundedCornerShape
 import androidx.compose.foundation.verticalScroll
 import androidx.compose.material.Text
 import androidx.compose.runtime.Composable
 import androidx.compose.ui.Alignment
 import androidx.compose.ui.Modifier
 import androidx.compose.ui.res.painterResource
 import androidx.compose.ui.unit.dp
 import androidx.compose.ui.draw.clip
 import androidx.compose.ui.graphics.Color
 import androidx.compose.ui.layout.ContentScale
 import androidx.compose.ui.res.colorResource
 import androidx.compose.ui.unit.sp
 import androidx.compose.ui.text.font.FontWeight
 import androidx.compose.ui.text.style.TextAlign
 import androidx.navigation.NavController


 @Composable
 fun CartScreen() {
     Column(
         modifier = Modifier
             .fillMaxSize()
             .verticalScroll(rememberScrollState())
     ) {
         Image(
             painter = painterResource(id = R.drawable.brand),
             contentDescription = "offer",
             modifier= Modifier.fillMaxSize()

         )
         Row(
             modifier = Modifier
                 .fillMaxWidth()

         ) {
             Box(
                 modifier = Modifier
                     .size(50.dp) // Set the size of the box
                     .clip(RoundedCornerShape(10.dp)) // Rounded corners with a radius of 10.dp
                     .background(Color.Black) // Set the background color
                     .align(Alignment.CenterVertically), // Center vertically in the parent layout
                 contentAlignment = Alignment.Center // Center the content (Text) inside the Box
             ) {
                 Text(
                     text = "18",
                     fontSize = 25.sp,
                     fontWeight = FontWeight.Bold,
                     color = Color.White
                 )
             }
             Spacer(modifier = Modifier.width(10.dp))

             Column(
                 modifier = Modifier
                     .padding(top = 5.dp)
             ) {
                 Text(
                     text = "LATEST STORIES",
                     modifier = Modifier,
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold,

                     )
                 Text(
                     text = "Every Weekend",
                     modifier = Modifier,
                     fontSize = 14.sp,
                 )
             }
         }

         Spacer(modifier = Modifier.height(16.dp)) // Add space between image and text
         Column(
             modifier = Modifier
                 .fillMaxSize()
                 // Add some padding to prevent clipping
         ) {
             Image(
                 painter = painterResource(id = R.drawable.first),
                 contentDescription = "offer",
                 modifier = Modifier.fillMaxSize()

             )
             Spacer(modifier = Modifier.height(16.dp))

             Text(
                 text = "Win This Hair Curly for Quick Hair Styling Every Morning",
                 modifier = Modifier,
                 fontSize = 28.sp,
                 fontWeight = FontWeight.Bold
             )
             Text(
                 text = "Find More Deals",
                 modifier = Modifier
                     .padding(top = 12.dp),
                 fontWeight = FontWeight.Medium,
                 fontSize = 14.sp
             )
         }
         Spacer(modifier = Modifier.height(16.dp)) // Add space between image and text
         Column(
             modifier = Modifier
                 .fillMaxWidth()

         ) {
             Image(
                 painter = painterResource(id = R.drawable.second),
                 contentDescription = "offer",
                 contentScale = ContentScale.Fit,
                 modifier= Modifier.fillMaxSize()
             )
             Spacer(modifier = Modifier.height(10.dp))
             Image(
                 painter = painterResource(id = R.drawable.third),
                 contentDescription = "offer",
                 contentScale = ContentScale.Fit,
                 modifier= Modifier.fillMaxSize()
             )
             Spacer(modifier = Modifier.height(10.dp))
             Image(
                 painter = painterResource(id = R.drawable.four),
                 contentDescription = "offer",
                 contentScale = ContentScale.Fit
                 , modifier= Modifier.fillMaxSize()
             )
             Spacer(modifier = Modifier.height(10.dp))
             Image(
                 painter = painterResource(id = R.drawable.fifth),
                 contentDescription = "offer", modifier= Modifier.fillMaxSize()
             )
         }

         Spacer(modifier = Modifier.height(20.dp))

         Image(painter = painterResource(id = R.drawable.beauty), contentDescription = null, modifier= Modifier.fillMaxSize() )
         Spacer(modifier = Modifier.height(20.dp))
         Image(painter = painterResource(id = R.drawable.beauty), contentDescription = null, modifier= Modifier.fillMaxSize() )
         Spacer(modifier = Modifier.height(20.dp))
         Image(painter = painterResource(id = R.drawable.beauty), contentDescription = null, modifier= Modifier.fillMaxSize() )

     }
 }