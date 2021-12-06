package com.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GradientButton(
    text: String, // Text Content String
    textColor: Color, // Text Content Color
    gradient: Brush, // Brush.horizontal
    // borderColor: Color, Stroke Color
    onClick: () -> Unit, // OnClick
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Transparent,
            disabledBackgroundColor = Color.Transparent,
            disabledContentColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(4.dp),
        contentPadding = PaddingValues(),
        // border = BorderStroke(1.dp, borderColor), Stroke Color
        modifier = Modifier.padding(16.dp), // Outside Padding
        onClick = { onClick() })
    {
        Box(
            Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp), // Inside Padding
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = textColor,
                fontSize = 32.sp
                // NOTE !! DO NOT FORGET TO ADJUST YOUR PADDING ACCORDING TO THE FONT SIZE
            )
        }
    }
}