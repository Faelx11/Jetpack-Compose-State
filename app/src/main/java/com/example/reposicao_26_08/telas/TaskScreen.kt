package com.example.reposicao_26_08.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen() {
    var vlrDoTextField = remember {
        mutableStateOf("")
    }

    Column {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(19.dp))
        {
            Text("Escreva algo aqui:",
                fontSize = 20.sp)
            TextField(
                value =vlrDoTextField.value,
                onValueChange = {
                    vlrDoTextField.value = it
                    Log.i("### fun TaskScreen(){...", it)
                })
            Spacer(
                modifier = Modifier.width(20.dp)
            )
            Text(vlrDoTextField.value)
        }

    }
}