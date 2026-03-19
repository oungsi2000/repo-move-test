package com.daedan.festabook.presentation.news.lost

import com.daedan.festabook.presentation.news.lost.model.LostItemFilter
import com.daedan.festabook.presentation.news.lost.model.LostUiModel

sealed interface LostUiState {
    data object InitialLoading : LostUiState

    data class Refreshing(
        val oldLostItems: List<LostUiModel>,
        val activeFilter: LostItemFilter = LostItemFilter.ALL,
    ) : LostUiState

    data class Success(
        val lostItems: List<LostUiModel>,
        val activeFilter: LostItemFilter = LostItemFilter.ALL,
    ) : LostUiState

    data class Error(
        val throwable: Throwable,
    ) : LostUiState
}
