package uz.smt.planningapp.presenter.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.Navigator
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject
import javax.inject.Singleton

/**
 *  This file is created by Saidmurod Turdiyev SMT for PlanningApp app
 *  7/16/2024  8:35 PM  Asus Rog
 */
@Singleton
class Navigation @Inject constructor() {
    companion object {
        val dispatcher = MutableSharedFlow<navigationListener>()
    }

    suspend fun navigate(screen: Screen) = dispatcher.emit {
        push(screen)
    }

    suspend fun navigate(screens: List<Screen>)= dispatcher.emit {
        push(screens)
    }

    suspend fun back() = dispatcher.emit {
        pop()
    }

    suspend fun <T : Screen> backUntil(screen: Class<T>) = dispatcher.emit {
        val itemScreen = items.find {
            screen.isInstance(it)
        }
        if (itemScreen != null) {
            popUntil {
                screen.isInstance(it)
            }
        }
    }

}

@Composable
private fun Example() {
    Navigator(screen = S()) { navigator ->
        LaunchedEffect(key1 = navigator) {
            Navigation.dispatcher.onEach { nvListener ->
                nvListener.invoke(navigator)
            }.launchIn(this)
        }
    }
}

class S : Screen {
    @Composable
    override fun Content() {

    }

}