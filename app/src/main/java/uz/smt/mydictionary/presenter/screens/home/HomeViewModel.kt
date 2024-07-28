package uz.smt.mydictionary.presenter.screens.home

import dagger.hilt.android.lifecycle.HiltViewModel
import uz.smt.mydictionary.presenter.utils.BaseViewModel
import uz.smt.planningapp.presenter.navigation.Navigation
import javax.inject.Inject

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/26/2024  3:21 PM  Asus Rog
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
//    private val navigator: Navigation
) : BaseViewModel<HomeUiState, HomeIntent>(HomeUiState()) {
    override fun onAction(intent: HomeIntent) {

    }

}