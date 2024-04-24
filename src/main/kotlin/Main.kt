import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun MainScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.size(60.dp).background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {}
    }
}

@Preview
@Composable
fun Ejercicio2() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier.background(Color.Yellow).width(300.dp).height(200.dp),
            contentAlignment = Alignment.Center,
            propagateMinConstraints = Propagate
        ) {
            Text("HOLA ES UN EJEMPLO DL USO DE BOX")
        }
    }
}

@Composable
@Preview
fun Ejercicio4() {
    Row(
        modifier = Modifier.fillMaxHeight()
            .padding(40.dp, 500.dp, 0.dp, 0.dp)
            .border(2.dp, Color.Red)
    ) { Text("Ejemplo 1") }
    Row(
        modifier = Modifier.fillMaxHeight()
            .padding(150.dp, 600.dp, 0.dp, 0.dp)
            .border(2.dp, Color.Blue)
    ) { Text("Ejemplo 2") }
    Row(
        modifier = Modifier.fillMaxHeight()
            .padding(250.dp, 700.dp, 0.dp, 0.dp)
            .border(2.dp, Color.Red)
    ) { Text("Ejemplo 3") }
    Row(
        modifier = Modifier.fillMaxHeight()
            .padding(350.dp, 800.dp, 0.dp, 0.dp)
            .border(2.dp, Color.Blue)
    ) { Text("Ejemplo 4") }
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

        Row(

        ) {
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
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
