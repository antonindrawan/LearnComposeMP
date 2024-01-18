package components

// This is a copy paste from https://github.com/android/snippets/blob/main/compose/snippets/src/main/java/com/example/compose/snippets/components/Button.kt
// The license belongs to The Android Open Source Project

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExamples() {
    Column(
        modifier = Modifier
            .padding(48.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Text("Filled button:")
            FilledButtonExample(onClick = {})
            Text("Filled tonal button:")
            FilledTonalButtonExample(onClick = {})
            Text("Elevated button:")
            ElevatedButtonExample(onClick = {})
            Text("Outlined button:")
            OutlinedButtonExample(onClick = {})
            Text("Text button")
            TextButtonExample(onClick = {})
    }
}

// [START android_compose_components_filledbutton]
@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Filled")
    }
}
// [END android_compose_components_filledbutton]

// [START android_compose_components_filledtonalbutton]
@Composable
fun FilledTonalButtonExample(onClick: () -> Unit) {
    FilledTonalButton(onClick = { onClick() }) {
        Text("Tonal")
    }
}
// [END android_compose_components_filledtonalbutton]

// [START android_compose_components_elevatedbutton]
@Composable
fun ElevatedButtonExample(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text("Elevated")
    }
}
// [END android_compose_components_elevatedbutton]

// [START android_compose_components_outlinedbutton]
@Composable
fun OutlinedButtonExample(onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }) {
        Text("Outlined")
    }
}
// [END android_compose_components_outlinedbutton]

// [START android_compose_components_textbutton]
@Composable
fun TextButtonExample(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick() }
    ) {
        Text("Text Button")
    }
}
// [END android_compose_components_textbutton]