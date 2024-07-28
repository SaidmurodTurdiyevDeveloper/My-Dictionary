package uz.smt.mydictionary.presenter.designs.items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.smt.mydictionary.data.models.WordData
import uz.smt.mydictionary.data.models.getEmptyWordData
import uz.smt.mydictionary.presenter.theme.Typography

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/18/2024  6:54 PM  Asus Rog
 */
@Composable
fun WordItem(
    modifier: Modifier = Modifier,
    item: WordData,
    engTextStyle: TextStyle = Typography.labelMedium,
    uzbTextStyle: TextStyle = Typography.labelMedium,
    ruTextStyle: TextStyle = Typography.labelMedium,
    descriptionStyle: TextStyle = Typography.labelSmall,
    onClick: () -> Unit
) {
    val text = buildAnnotatedString {
        withStyle(style = engTextStyle.toSpanStyle()) {
            append(item.eng)
        }
        append(" - ")
        withStyle(style = ruTextStyle.toSpanStyle()) {
            append(item.ru)
        }
        append(" - ")
        withStyle(style = uzbTextStyle.toSpanStyle()) {
            append(item.uzb)
        }
    }
    Surface(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = text)
            item.description?.let {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = item.description,
                    style = descriptionStyle
                )
            }
        }
    }
}

@Preview
@Composable
private fun WordItemPrev() {
    WordItem(
        item = getEmptyWordData(
            uzb = "Salom",
            eng = "Hello",
            description = "Hello guys"
        ),
        onClick = {}
    )
}