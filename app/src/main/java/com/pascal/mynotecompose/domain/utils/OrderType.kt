package com.pascal.mynotecompose.domain.utils

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
