package com.daedan.festabook.presentation.news.lost.model

enum class LostItemFilter(
    val displayName: String,
) {
    ALL("전체"),
    PENDING("보관중"),
    COMPLETED("수령완료"),
}

fun LostItemFilter.matches(item: LostUiModel.Item): Boolean =
    when (this) {
        LostItemFilter.ALL -> true
        LostItemFilter.PENDING -> item.status == LostItemUiStatus.PENDING
        LostItemFilter.COMPLETED -> item.status == LostItemUiStatus.COMPLETED
    }