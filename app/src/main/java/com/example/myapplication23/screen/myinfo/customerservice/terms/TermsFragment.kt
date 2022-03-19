package com.example.myapplication23.screen.myinfo.customerservice.terms

import android.content.Intent
import com.example.myapplication23.databinding.FragmentTermsBinding
import com.example.myapplication23.screen.MainActivity
import com.example.myapplication23.screen.base.BaseFragment

class TermsFragment : BaseFragment<CSViewModel,FragmentTermsBinding>() {


    override val viewModel by viewModel<CSViewModel>()

    override fun getViewBinding(): FragmentTermsBinding =
        FragmentTermsBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    override fun initViews() {
        super.initViews()
        binding.configurationLeft.setOnClickListener { back(MainActivity())  }
    }

    private fun back(activity: MainActivity){
        activity?.let {
            var intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

    }
    companion object{
        const val TAG = "TermsFragment"

        fun newInstance() : TermsFragment {
            return TermsFragment().apply {

            }
        }
    }
}