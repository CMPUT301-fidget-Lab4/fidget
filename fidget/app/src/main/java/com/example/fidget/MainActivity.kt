package com.example.fidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fidget.ui.theme.FidgetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FidgetTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

abstract class Shape(x: Int, y: Int, val color: String = "orange") {

}

class Circle(x: Int, y:Int, val radius: Int, color: String = "blue"):Shape(x,y,color) {

}

class Nonagon(side : Int): Shape(x,y){

}

class Diamond: Shape() {

}

class Circle(Radius: Int, Center: Int) : Shape(Radius, Center) {
    
}

//
class Cross(Height:Int, CrossLength: Int ,Colour: String ) : Shape(Height,CrossLength, Colour )
{

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FidgetTheme {
        Greeting("Android")
    }
}
package com.example.fidget

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fidget.ui.theme.FidgetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FidgetTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
abstract class Shape(x: Int, y: Int, val color: String = "$PUT_YOUR_CHOICE_OF_COLOR") {

}

class Circle(x: Int, y:Int, val radius: Int):Shape(x,y) {

}




@Composable
class Nonagon(side : Int): Shape(x,y){

}

class Diamond: Shape() {

}

class Circle(Radius: Int, Center: Int) : Shape(Radius, Center) {
    
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FidgetTheme {
        Greeting("Android")
    }
}
