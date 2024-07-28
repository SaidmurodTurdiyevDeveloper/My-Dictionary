package uz.smt.mydictionary.presenter.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import uz.smt.mydictionary.R
import uz.smt.mydictionary.presenter.designs.items.DictionaryItem
import uz.smt.mydictionary.presenter.designs.views.toolbars.MenuToolBar

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  3:20 PM  Asus Rog
 */
class HomeScreen : Screen {
    @Composable
    override fun Content() {
        val viewModel = getViewModel<HomeViewModel>()
        HomeScreenContent(viewModel = viewModel)
    }
}

@Composable
private fun HomeScreenContent(
    viewModel: HomeViewModel
) {
    val uiState by viewModel.uiState.collectAsState()
    Screen(uiState = uiState, onAction = viewModel::onAction)
    Dialogs(uiState = uiState, onAction = viewModel::onAction)
}

@Composable
private fun Dialogs(
    uiState: HomeUiState,
    onAction: (intent: HomeIntent) -> Unit
) {

}

@Composable
private fun Screen(
    uiState: HomeUiState,
    onAction: (intent: HomeIntent) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            MenuToolBar(title = stringResource(id = R.string.home))
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add icon floating"
                )
            }
        }
    ) { scaffoldPAdding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(scaffoldPAdding)
        ) {
            itemsIndexed(
                items = uiState.list,
                key = { index, dictionaryItem ->
                    dictionaryItem.id + index
                }
            ) { _, dictionaryItem ->
                DictionaryItem(item = dictionaryItem) {
                    onAction(HomeIntent.OpenItem(id = dictionaryItem.id))
                }
            }
        }
    }
}

@Preview
@Composable
private fun ScreenPrev() {
    Screen(HomeUiState()) {}
}