import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun Ejercicio1() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.background(Color.Cyan).size(20.dp)
        )
    }
}

@Composable
@Preview
fun Ejercicio2() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.background(Color.Cyan).width(300.dp).height(200.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text("Esto es un texto...")
        }
    }
}

@Composable
@Preview
fun Ejercicio3() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.background(Color.Cyan).width(300.dp).height(200.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text("Esto es un texto...")
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Mi login",
        state = windowState
    ) {
        //App()
        MainScreen()
    }
}