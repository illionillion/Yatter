package com.dmm.bootcamp.yatter2023.ui.timeline

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * パブリックタイムラインのPageを実装
 */
@Composable
fun PublicTimelinePage(viewModel: PublicTimelineViewModel) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    PublicTimelineTemplate(
        myAccount = uiState.myAccount,
        statusList = uiState.statusList,
        isLoading = uiState.isLoading,
        isRefreshing = uiState.isRefreshing,
        onClickPost = viewModel::onClickPost,
        onRefresh = viewModel::onRefresh,
        onClickLogout = viewModel::onClickLogout,
        onClickProfile = viewModel::onClickProfile
    )

}