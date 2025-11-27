package com.example.thirtydays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ThirtyDaysTheme
import com.example.thirtydays.model.Day
import com.example.thirtydays.model.days

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirtyDaysTheme {

            }
        }
    }
}

@Composable
fun DayItem(modifier: Modifier = Modifier, day: Day) {
    Card(modifier = modifier) {
        Column(modifier = modifier){
            Text(stringResource(R.string.day)+": "+day.dayNumber)
            Text(stringResource(day.dayTitle))
            Image(painter = painterResource(day.dayImage), contentDescription = null)
            Text(stringResource(day.dayDescription))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun Preview() {
    ThirtyDaysTheme {
        DayItem(day=days.get(22))
    }
}