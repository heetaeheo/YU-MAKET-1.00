//package com.example.YUmarket.screen.myinfo.customerservice.list
//
//import com.example.YUmarket.util.provider.ResoucesProvider
//import android.os.Bundle
//import androidx.navigation.Navigation
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.YUmarket.R
//import com.example.YUmarket.databinding.FragmentCsListBinding
//import com.example.YUmarket.model.customerservicelist.CSModel
//import com.example.YUmarket.model.customerservicelist.ImageData
//import com.example.YUmarket.screen.base.BaseFragment
//import com.example.YUmarket.screen.myinfo.customerservice.CSFragmentArgs
//import com.example.YUmarket.widget.adapter.ModelRecyclerAdapter
//import com.example.YUmarket.widget.adapter.listener.customerservice.CSModelListener
//import org.koin.android.ext.android.inject
//import org.koin.android.viewmodel.ext.android.viewModel
//import org.koin.core.parameter.parametersOf
//
///**
// * @author HeeTae Heo(main),
// * Geonwoo Kim, Doyeop Kim, Namjin Jeong, Eunho Bae (sub)
// * @since
// * @throws
// * @description
// */
//
//class CSListFragment : BaseFragment<FragmentCsListBinding>() {
//
//
//    private val viewModel by viewModel<CSListViewModel> {
//        parametersOf(csCategory)
//    }
//    private val csCategory by lazy {
//        arguments?.getSerializable(CS_CATEGORY_KEY) as CSCategory
//    }
//
//    override fun getViewBinding(): FragmentCsListBinding =
//        FragmentCsListBinding.inflate(layoutInflater)
//
//    override fun observeData() = with(viewModel) {
//        csListData.observe(viewLifecycleOwner) {
//            adapter.submitList(it)
//        }
//    }
//
//    private val resourcesProvider by inject<ResoucesProvider>()
//
//
//    private val adapter by lazy {
//        ModelRecyclerAdapter<CSModel, CSListViewModel>(
//            listOf(), viewModel, resourcesProvider,
//            object : CSModelListener {
//                override fun onClickItem(listModel: CSModel) {
//                    val data = ImageData(listModel.csTitle, listModel.csContent, listModel.csAuthor)
//                    val bundle = Bundle()
//                    bundle.putParcelable("data", data)
//                    view?.let { it1 ->
//                        Navigation.findNavController(it1)
//                            .navigate(R.id.action_CSFragment_to_CSDetailFragment, bundle)
//                    }
//
//
////                        val intent = Intent(context, CSDetailFragment::class.java).apply {
////                           val data = ImageData(listModel.csTitle,listModel.csContent,listModel.csAuthor)
////                            putExtra(CS_CATEGORY_KEY,data)
////                            putExtra("CSTitle", listModel.csTitle)
////                            putExtra("CSContent", listModel.csContent)
////                            putExtra("CSAuthor", listModel.csAuthor)
////                            putExtra("CSid", listModel.id)
//                    //                       }
////                        startActivity(intent)
//                }
//            }
//        )
//
//    }
//
//    override fun initViews() = with(viewModel) {
//        super.initViews()
//        fetchData()
//        binding.csRecyclerView.adapter = adapter
//        binding.csRecyclerView.layoutManager = LinearLayoutManager(this@CSListFragment.context)
//
//
//    }
//
//    companion object {
//        const val CS_CATEGORY_KEY = "CSCategoryKey"
//        fun newInstance(csCategory: CSCategory): CSListFragment {
//            val bundle = Bundle().apply {
//                putSerializable(CS_CATEGORY_KEY, csCategory)
//            }
//
//            return CSListFragment().apply {
//                arguments = bundle
//            }
//        }
//    }
//
//    override fun backStack() {
//    }
//}
//
//package com.example.YUmarket.screen.myinfo.customerservice
//
///**
// * @author HeeTae Heo(main),
// * Geonwoo Kim, Doyeop Kim, Namjin Jeong, Eunho Bae (sub)
// * @since
// * @throws
// * @description
// */
//
//
//import android.os.Bundle
//import androidx.core.view.get
//import androidx.navigation.NavArgs
//import androidx.navigation.Navigation
//import androidx.navigation.fragment.navArgs
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.YUmarket.R
//import com.example.YUmarket.databinding.FragmentCsBinding
//import com.example.YUmarket.model.customerservicelist.ImageData
//import com.example.YUmarket.model.customerservicelist.CSModel
//import com.example.YUmarket.screen.base.BaseFragment
//import com.example.YUmarket.screen.myinfo.customerservice.list.CSCategory
//import com.example.YUmarket.screen.myinfo.customerservice.list.CSListFragment
//import com.example.YUmarket.screen.myinfo.customerservice.list.CSListViewModel
//import com.example.YUmarket.util.provider.ResoucesProvider
//import com.example.YUmarket.widget.adapter.HomeListFragmentPagerAdapter
//import com.example.YUmarket.widget.adapter.ModelRecyclerAdapter
//import com.example.YUmarket.widget.adapter.listener.customerservice.CSModelListener
//import org.koin.android.ext.android.inject
//import org.koin.android.viewmodel.ext.android.viewModel
//import org.koin.core.parameter.parametersOf
//
//
//class CSFragment : BaseFragment<FragmentCsBinding>() {
//
//    //private lateinit var viewAdapter : HomeListFragmentPagerAdapter
//
//
//
//    private val viewModel by viewModel<CSListViewModel> {
//        parametersOf(args.csCategory)
//    }
//
////    private val csCategory by lazy {
////        arguments?.getSerializable(CS_CATEGORY_KEY) as CSCategory
////    }
//
//    override fun getViewBinding(): FragmentCsBinding =
//        FragmentCsBinding.inflate(layoutInflater)
//
//    override fun observeData() = with(viewModel) {
//        csListData.observe(viewLifecycleOwner) {
//            adapter.submitList(it)
//        }
//    }
//
//    private val args by navArgs<CSFragmentArgs>()
//
//    private val resourcesProvider by inject<ResoucesProvider>()
//
//    private val adapter by lazy {
//        ModelRecyclerAdapter<CSModel, CSListViewModel>(
//            listOf(), viewModel, resourcesProvider,
//            object : CSModelListener {
//                override fun onClickItem(listModel: CSModel) {
//                    val data = ImageData(listModel.csTitle, listModel.csContent, listModel.csAuthor)
//                    val bundle = Bundle()
//                    bundle.putParcelable("data", data)
//                    view?.let { it1 ->
//                        Navigation.findNavController(it1)
//                            .navigate(R.id.action_CSFragment_to_CSDetailFragment, bundle)
//                    }
//
//
////                        val intent = Intent(context, CSDetailFragment::class.java).apply {
////                           val data = ImageData(listModel.csTitle,listModel.csContent,listModel.csAuthor)
////                            putExtra(CS_CATEGORY_KEY,data)
////                            putExtra("CSTitle", listModel.csTitle)
////                            putExtra("CSContent", listModel.csContent)
////                            putExtra("CSAuthor", listModel.csAuthor)
////                            putExtra("CSid", listModel.id)
//                    //                       }
////                        startActivity(intent)
//                }
//            }
//        )
//
//    }
//    override fun initViews() = with(binding) {
//        super.initViews()
//        viewModel.fetchData()
//
//
//        csRecyclerView.adapter = adapter
//        csRecyclerView.layoutManager = LinearLayoutManager(requireContext().applicationContext)
//        CSTextView.text = "고객센터"
//
////        if (::viewAdapter.isInitialized.not()) {
////            val csCategory = CSCategory.values()
////
////            val CSListfragmnet = csCategory.map {
////                CSListFragment.newInstance(it)
////            }
////
////            viewPagerCs.adapter = HomeListFragmentPagerAdapter(
////                this@CSFragment,
////                CSListfragmnet
////            )
////        }
////        viewPagerCs.offscreenPageLimit = 1
//
//
//
//        intentmyinfo.setOnClickListener {
//            intentMyinfo()
//            doubleBackStack()
//        }
//
//        editBtn.setOnClickListener {
//            view?.let { it1 ->
//                Navigation.findNavController(it1)
//                    .navigate(R.id.action_CSFragment_to_emailFragment)
//            }
//
//
//        }
//        csback.setOnClickListener {
//            backMove()
//        }
//    }
//
//    private fun intentMyinfo() {
//        view?.let { it1 ->
//            Navigation.findNavController(it1)
//                .navigate(R.id.action_CSFragment_to_myInfoFragment)
//
//        }
//    }
//
//    private fun doubleBackStack() {
//        view?.let { it1 ->
//            Navigation.findNavController(it1).popBackStack()
//        }
//        view?.let { it1 ->
//            Navigation.findNavController(it1).popBackStack()
//        }
//    }
//
//    private fun backMove() {
//        view?.let { it1 ->
//            Navigation.findNavController(it1)
//                .navigate(R.id.action_CSFragment_to_CSCenterFragment)
//        }
//    }
//
//    override fun backStack() {
//        view?.let { it1 ->
//            Navigation.findNavController(it1).popBackStack()
//        }
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
