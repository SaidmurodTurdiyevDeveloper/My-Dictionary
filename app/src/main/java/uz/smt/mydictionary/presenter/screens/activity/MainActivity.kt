package uz.smt.mydictionary.presenter.screens.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.onEach
import uz.smt.mydictionary.presenter.screens.home.HomeScreen
import uz.smt.mydictionary.presenter.theme.MyDictionaryTheme
import uz.smt.planningapp.presenter.navigation.Navigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyDictionaryTheme {
                Navigator(screen = HomeScreen()){navigator->
                    LaunchedEffect(key1 = navigator) {
                        Navigation.dispatcher.onEach {navigateListener->
                            navigateListener.invoke(navigator)
                        }
                    }
                }
            }
        }
    }
}
