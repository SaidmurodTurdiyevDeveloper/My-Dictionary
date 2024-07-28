package uz.smt.mydictionary.presenter.designs.views.toolbars

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import uz.smt.mydictionary.presenter.theme.Typography

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  3:33 PM  Asus Rog
 */
@Composable
fun MenuToolBar(
    modifier: Modifier = Modifier,
    title: String,
    titleTextStyle: TextStyle = Typography.titleMedium,
    icon: ImageVector = Icons.Default.Menu
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(56.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(32.dp))
        Text(text = title, style = titleTextStyle)
    }
}