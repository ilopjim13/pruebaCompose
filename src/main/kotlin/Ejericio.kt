import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.net.CookieStore

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
fun Ejemplos(color: Color, fracion: Float, texto:String) {
    Box(
        modifier = Modifier.background(color).fillMaxHeight(fracion)
    ) {
        Text(texto)
    }
}

@Composable
@Preview
fun Ejercicio3() {
    Surface (
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {

            Ejemplos(Color.Red, 0.2f, "Ejemplo 1")
            Ejemplos(Color.Gray, 0.4f, "Ejemplo 2")
            Ejemplos(Color.Cyan, 0.6f, "Ejemplo 3")
            Ejemplos(Color.Green, 1f, "Ejemplo 4")

        }
    }
}

@Composable
@Preview
fun Ejercicio4() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxHeight()
                .padding(0.dp, 500.dp, 0.dp, 0.dp)
                .border(2.dp, Color.Red)
        ) { Text("Ejemplo 1") }
        Row(
            modifier = Modifier.fillMaxHeight()
                .padding(0.dp, 600.dp, 0.dp, 0.dp)
                .border(2.dp, Color.Blue)
        ) { Text("Ejemplo 2") }
        Row(
            modifier = Modifier.fillMaxHeight()
                .padding(0.dp, 700.dp, 0.dp, 0.dp)
                .border(2.dp, Color.Red)
        ) { Text("Ejemplo 3") }
        Row(
            modifier = Modifier.fillMaxHeight()
                .padding(0.dp, 800.dp, 0.dp, 0.dp)
                .border(2.dp, Color.Blue)
        ) { Text("Ejemplo 4") }
    }
}

@Composable
@Preview
fun Ejercicio5() {
    Column {
        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Cyan).height(150.dp),
            contentAlignment = Alignment.Center
        ) { Text("BOX 1", fontSize = 28.sp) }

        MySpacer(90.dp)

        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Gray).height(150.dp),
            contentAlignment = Alignment.Center
        ) { Text("BOX 2", fontSize = 28.sp) }

        MySpacer(180.dp)

        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Green).height(150.dp),
            contentAlignment = Alignment.Center
        ) { Text("BOX 3", fontSize = 28.sp) }

        MySpacer(60.dp)

        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Magenta).height(150.dp),
            contentAlignment = Alignment.Center
        ) { Text("BOX 4", fontSize = 28.sp) }
    }
}

@Composable
@Preview
fun Ejercicio6() {
    Column {
        Box(
            modifier = Modifier.fillMaxWidth().background(Color.Cyan).fillMaxHeight(0.33f),
            contentAlignment = Alignment.TopCenter
        ) { Text("Ejercicio 2",
            fontSize = 22.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier
                .padding(15.dp)
                .background(Color.Yellow)
                .border(2.dp, Color.Black)
                .padding(10.dp)) }

        Row {
            Box(
                contentAlignment = Alignment.BottomCenter,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(0.5f)
                    .background(Color.Blue)
            ) {
                Text("PMDM", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(1f)
                    .background(Color.Green)
            ) {
                Text("DAM 2", color = Color.Gray, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .fillMaxHeight(1f)
                .fillMaxWidth()
                .background(Color.Magenta)
        ) {
            Text("...Combinando Column y Box", color = Color.Yellow, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}


@Composable
@Preview
fun MySpacer(espacio: Dp) {
    Spacer(modifier = Modifier.height(espacio))
}




fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp, 900.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicios",
        state = windowState
    ) {
        Ejercicio3()
    }
}