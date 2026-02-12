package com.example.buy_it.ui.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.buy_it.R

@Composable
fun FondoBlanco(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.bgwhite))
    )

}

@Composable
@Preview()
fun FondoBlancoPreview(){
    FondoBlanco()
}