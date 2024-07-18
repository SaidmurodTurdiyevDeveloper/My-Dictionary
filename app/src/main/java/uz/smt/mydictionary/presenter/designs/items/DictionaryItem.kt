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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.smt.mydictionary.data.models.DictionaryData
import uz.smt.mydictionary.data.models.getEmptyDictionaryData
import uz.smt.mydictionary.presenter.theme.Typography

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/18/2024  5:14 PM  Asus Rog
 */
@Composable
fun DictionaryItem(
    modifier: Modifier = Modifier,
    item: DictionaryData,
    titleStyle: TextStyle = Typography.titleLarge,
    descriptionStyle: TextStyle = Typography.labelSmall,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = item.name, style = titleStyle)
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = item.description, style = descriptionStyle)
        }
    }
}

@Preview
@Composable
private fun DictionaryItemPrev() {
    DictionaryItem(item = getEmptyDictionaryData(), onClick = {})
}