package com.example.myapplication23.screen.myinfo.customerservice.configuration


import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication23.R
import com.example.myapplication23.databinding.ActivityCsBinding
import com.example.myapplication23.screen.base.BaseActivity


/**
 * @author HeeTae Heo(main),
 * Geonwoo Kim, Doyeop Kim, Namjin Jeong, Eunho Bae (sub)
 * @since
 * @throws
 * @description
 */

class ConfigurationActivity : BaseActivity< ActivityCsBinding>() {

    override fun getViewBinding(): ActivityCsBinding
    = ActivityCsBinding.inflate(layoutInflater)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun observeData() = with(binding) {
        initViews()
    }



    override fun initViews()  {
        showCSFragment(ConfigurationFragment.newInstance(),ConfigurationFragment.TAG)

    }

        private fun showCSFragment(fragment: Fragment, tag: String) {
                supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment, tag).commit()
        }




}



