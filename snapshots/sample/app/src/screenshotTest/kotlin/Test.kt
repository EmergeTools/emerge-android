import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.emergetools.snapshots.sample.ui.SampleShapeWithText
import com.emergetools.snapshots.sample.ui.theme.SnapshotsSampleTheme

@Preview(showBackground = true, device = Devices.PIXEL_5, showSystemUi = true)
@Composable
fun SampleShapeWithTextPreview() {
  SnapshotsSampleTheme {
    SampleShapeWithText()
  }
}
