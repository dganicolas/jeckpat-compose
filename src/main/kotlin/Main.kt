import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Preview
@Composable
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

fun main() = application {
    val windowState= rememberWindowState(size = DpSize(1200.dp,800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Mi login",
        state = windowState
    ) {
        MainScreen()
    }
}
