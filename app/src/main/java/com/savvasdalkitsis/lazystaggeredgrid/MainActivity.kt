package com.savvasdalkitsis.lazystaggeredgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.savvasdalkitsis.lazystaggeredgrid.ui.theme.LazyStaggeredGridTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val random = Random(System.currentTimeMillis())
        setContent {
            LazyStaggeredGridTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LazyStaggeredGrid(columnCount = 2) {
                        (0..100).forEach { _ ->
                            item {
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .aspectRatio(ratio = random.nextDouble(0.2, 1.8).toFloat())
                                    .background(Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)))
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun ALazyGrid() {
    val random = Random(System.currentTimeMillis())
    LazyStaggeredGrid(columnCount = 2) {
        (0..100).forEach { _ ->
            item {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(ratio = random.nextDouble(0.2, 1.8).toFloat())
                    .background(Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)))
                )
            }
        }
    }
}