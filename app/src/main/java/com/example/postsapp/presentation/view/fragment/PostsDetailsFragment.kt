package com.example.postsapp.presentation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.postsapp.BaseFragment
import com.example.postsapp.R
import com.example.postsapp.data.source.remote.model.PostsResult
import kotlinx.android.synthetic.main.fragment_posts_details.*

class PostsDetailsFragment : BaseFragment() {

    private var postResponse: PostsResult? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val parentView = super.onCreateView(inflater, container, savedInstanceState)
        inflater.inflate(R.layout.fragment_posts_details, contentContainer, true)
        return parentView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        fetchBundle(arguments)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (postResponse != null)
            setData()
    }

    private fun fetchBundle(arguments: Bundle?) {
        if (arguments != null) {
            postResponse = arguments.getParcelable(PostsFragment.Object)
        }
    }

    private fun setData() {
        tvIdDetails.text = postResponse?.id.toString()
        tvTitleDetails.text = postResponse?.title.toString()
        tvBodyDetails.text = postResponse?.body.toString()
    }

    companion object {
        @JvmField
        val TAG: String = PostsDetailsFragment::class.java.simpleName

        fun newInstance(request: PostsResult?) = run {
            val fragment =
                PostsDetailsFragment()
            fragment.arguments = bundleOf(
                PostsFragment.Object to request
            )
            return@run fragment
        }
    }

}