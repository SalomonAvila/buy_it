package com.example.buy_it.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buy_it.R
import com.example.buy_it.ui.utils.Circle
import com.example.buy_it.ui.utils.GlassPanel


@Composable
fun Login(
    modifier : Modifier = Modifier
){
    Box(
        modifier = modifier
            .fillMaxSize()
    ){
        Circle(painter = painterResource(R.drawable.elipse1), modifier = Modifier.align(Alignment.TopStart).offset(x=-32.dp).size(270.dp))
        Circle(painter = painterResource(R.drawable.elipse2), modifier = Modifier.align(Alignment.TopEnd).offset(x = 135.dp,y=200.dp).size(287.dp))
        Circle(painter = painterResource(R.drawable.elipse3), modifier = Modifier.align(Alignment.TopStart).offset(x=-16.dp, y = 450.dp).size(270.dp))
        GlassPanel(modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
@Preview(showBackground = true)
fun LoginPreview(){
    Login()
}
