package com.example.myntraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FavouriteScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),


            ) {
            Image(painter = painterResource(id = R.drawable.first), contentDescription = "hello"
           ,  modifier= Modifier.fillMaxSize(),
                Alignment.TopEnd
            )
        }
        Spacer(modifier = Modifier.height(10.dp))

        androidx.compose.material.Text(
            text = "Spotlight",
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
    Spacer(modifier = Modifier.height(20.dp))

    Column (
        modifier = Modifier.padding(top = 350.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),


            ){
            Image(painter = painterResource(id = R.drawable.new1), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Image(painter = painterResource(id = R.drawable.new2), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Image(painter = painterResource(id = R.drawable.new3), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Image(painter = painterResource(id = R.drawable.new4), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Image(painter = painterResource(id = R.drawable.new5), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

            Image(painter = painterResource(id = R.drawable.new6), contentDescription = "hello",
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(25.dp))
            )

        }
    }
    Spacer(modifier = Modifier.height(20.dp))
    Column (
        modifier = Modifier.padding(top = 800.dp).padding(20.dp)
    ){

        androidx.compose.material.Text(text = "Steal Deals",
            modifier = Modifier,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
}