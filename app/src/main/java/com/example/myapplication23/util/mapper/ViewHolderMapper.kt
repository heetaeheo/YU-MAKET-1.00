package com.example.myapplication23.util.mapper

import com.example.myapplication23.util.provider.ResoucesProvider
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication23.databinding.*
import com.example.myapplication23.model.CellType
import com.example.myapplication23.model.Model
import com.example.myapplication23.screen.base.BaseViewModel
import com.example.myapplication23.widget.adapter.viewholder.ModelViewHolder

import com.example.myapplication23.widget.adapter.viewholder.cs.CSViewHolder
import com.example.myapplication23.widget.adapter.viewholder.restaurant.RestaurantViewHolder

object ViewHolderMapper {
    @Suppress("UNCHECKED_CAST")
    fun <M : Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResoucesProvider
    ): ModelViewHolder<M> {

        val inflater = LayoutInflater.from(parent.context)

        return when (type) {
            CellType.HOME_ITEM_CELL -> {
                RestaurantViewHolder(
                    ViewholderRestaurantBinding.inflate(inflater),
                    viewModel,
                    resourcesProvider

                )
            }

            CellType.HOME_TOWN_MARKET_CELL -> {
                RestaurantViewHolder(
                    ViewholderRestaurantBinding.inflate(inflater),
                    viewModel,
                    resourcesProvider

                    )
            }

            CellType.HOME_CELL -> {
                RestaurantViewHolder(
                    ViewholderRestaurantBinding.inflate(inflater),
                    viewModel,
                    resourcesProvider
                )
            }

            CellType.CUSTOMER_SERVICE_CELL -> {
                CSViewHolder(
                    ViewholderCsItemBinding.inflate(inflater),
                    viewModel,
                    resourcesProvider
                    )
            }



        } as ModelViewHolder<M>

    }



}