package com.yigitkarakurt.e_commerce_compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yigitkarakurt.e_commerce_compose.ui.home.HomeScreen
import com.yigitkarakurt.e_commerce_compose.ui.home.HomeViewModel
import com.yigitkarakurt.e_commerce_compose.ui.detail.DetailScreen
import com.yigitkarakurt.e_commerce_compose.ui.detail.DetailViewModel

@Composable
fun NavigationGraph(
    navController: NavHostController,
    startDestination: String,
    modifier: Modifier = Modifier,
) {
    NavHost(
        modifier = Modifier.then(modifier),
        navController = navController,
        startDestination = startDestination,
    ) {
        composable("Home") {
            val viewModel: HomeViewModel = hiltViewModel()
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            val uiEffect = viewModel.uiEffect
            HomeScreen(
                uiState = uiState,
                uiEffect = uiEffect,
                onAction = viewModel::onAction
            )
        }
        composable("Detail") {
            val viewModel: DetailViewModel = hiltViewModel()
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            val uiEffect = viewModel.uiEffect
            DetailScreen(
                uiState = uiState,
                uiEffect = uiEffect,
                onAction = viewModel::onAction
            )
        }

    }
}