package com.example.myapplication23.screen.myinfo.customerservice.configuration

import android.content.Intent
import com.example.YUmarket.BuildConfig
import com.example.myapplication23.databinding.FragmentConfigurationBinding
import com.example.myapplication23.screen.MainActivity
import com.example.myapplication23.screen.base.BaseFragment


class ConfigurationFragment : BaseFragment<FragmentConfigurationBinding>() {

    val versionNumber = BuildConfig.VERSION_NAME



    override fun getViewBinding(): FragmentConfigurationBinding =
        FragmentConfigurationBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    override fun initViews() = with(binding){
        binding.versionCode.text = versionNumber
        binding.configurationLeft.setOnClickListener { back(MainActivity()) }
    }

    private fun back(activity: MainActivity){
        activity?.let {
            var intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }

    }

    companion object{
        const val TAG = "ConfigurationFragment"

        fun newInstance() : ConfigurationFragment {
            return ConfigurationFragment().apply {

            }
        }
    }
}