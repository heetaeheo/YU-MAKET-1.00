package com.example.myapplication23.screen.myinfo.customerservice.personal

import android.content.Intent
import com.example.myapplication23.databinding.FragmentPersonalBinding
import com.example.myapplication23.screen.MainActivity
import com.example.myapplication23.screen.base.BaseFragment

class PersonalFragment : BaseFragment<FragmentPersonalBinding>() {



    override fun getViewBinding(): FragmentPersonalBinding =
        FragmentPersonalBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    override fun initViews() = with(binding) {
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
        const val TAG = "PersonalFragment"

        fun newInstance() : PersonalFragment {
            return PersonalFragment().apply {

            }
        }
    }
}