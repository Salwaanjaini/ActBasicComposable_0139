package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {


        Image(
            painter = painterResource(
                id = R.drawable.pink
            ),
            contentDescription = "Background Pink",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {


            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )


            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.White
            )

            Spacer(
                modifier = Modifier.height(25.dp)
            )


            Image(
                painter = painterResource(
                    id = R.drawable.wide_awake
                ),
                contentDescription = "Wide awake",
                modifier = Modifier.size(180.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Text(
                text = "Nama",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )


            Text(
                text = "Salwa Anjaini Futri Endsani",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )


            Text(
                text = "20240140139",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Image(
                painter = painterResource(
                    id = R.drawable.katy_perry
                ),
                contentDescription = "Katy perry",
                modifier = Modifier.size(180.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}