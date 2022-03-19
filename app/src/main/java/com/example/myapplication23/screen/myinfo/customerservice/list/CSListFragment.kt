package com.example.myapplication23.screen.myinfo.customerservice.list

import android.content.Intent
import android.content.res.loader.ResourcesProvider

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication23.databinding.FragmentCsListBinding

import com.example.myapplication23.model.customerservicelist.CSModel
import com.example.myapplication23.screen.base.BaseFragment
import com.example.myapplication23.screen.myinfo.customerservice.list.detail.CSDetailActivity
import com.example.myapplication23.widget.adapter.ModelRecyclerAdapter
import com.example.myapplication23.widget.adapter.listener.customerservice.CSModelListener
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * @author HeeTae Heo(main),
 * Geonwoo Kim, Doyeop Kim, Namjin Jeong, Eunho Bae (sub)
 * @since
 * @throws
 * @description
 */

class CSListFragment : BaseFragment< FragmentCsListBinding>() {




    override fun getViewBinding(): FragmentCsListBinding =
        FragmentCsListBinding.inflate(layoutInflater)


    private val resourcesProvider by inject<ResourcesProvider>()




    companion object {
        const val CS_CATEGORY_KEY = "CSCategoryKey"
        fun newInstance(csCategory: CSCategory): CSListFragment {
            val bundle = Bundle().apply {
                putSerializable(CS_CATEGORY_KEY, csCategory)
            }

            return CSListFragment().apply {
                arguments = bundle
            }
        }
    }

    override fun observeData() {

    }


}