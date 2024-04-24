import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import javax.swing.text.AbstractDocument.Content

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
            contentAlignment = Alignment.BottomCenter,
        ) {
            Text("HOLA ES UN EJEMPLO DL USO DE BOX")
        }
    }
}

@Composable
@Preview
fun MainScreen6543() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Surface(
                color = Color.Green,
                modifier = Modifier.size(60.dp)
            ) {}
            Surface(
                color = Color.Black,
                modifier = Modifier.size(60.dp)
            ) {}
        }
    }}

@Composable
@Preview
fun Ejercicio3() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.background(Color.Yellow).width(80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.background(Color.Red).weight(1f)
            ) {
                Text("EJEMPLO 1")
            }
            Box(
                modifier = Modifier.background(Color.Magenta).weight(1f)
            ) {
            Text("EJEMPLO 2")
        }
            Box(
                modifier = Modifier.background(Color.Gray).weight(1f)
            ) {
                Text("EJEMPLO 3")
            }
            Box(
                modifier = Modifier.background(Color.LightGray).weight(1f)
            ) {
                Text("EJEMPLO 4")
            }
        }

    }
}

@Composable
@Preview
fun Ejercicio4() {
        Row(
            verticalAlignment = Alignment.Bottom
        ){
            Row(
                modifier = Modifier
                    .border(2.dp, Color.Red),
                verticalAlignment = Alignment.Bottom,

            ) { Text("Ejemplo 1") }
            Row(
                modifier = Modifier
                    .border(2.dp, Color.Blue)
            ) { Text("Ejemplo 2") }
            Row(
                modifier = Modifier
                    .border(2.dp, Color.Red)
            ) { Text("Ejemplo 3") }
            Row(
                modifier = Modifier
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
    }
}
