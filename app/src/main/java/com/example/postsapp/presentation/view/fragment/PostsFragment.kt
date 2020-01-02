package com.example.postsapp.presentation.view.fragment

import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.Observer
import com.example.postsapp.BaseFragment
import com.example.postsapp.R
import com.example.postsapp.data.source.remote.model.PostsResult
import com.example.postsapp.presentation.view.adapter.PostsAdapter
import com.example.postsapp.presentation.viewmodel.PostsViewModel
import kotlinx.android.synthetic.main.fragment_posts.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class PostsFragment : BaseFragment() {

    private var postsList: ArrayList<PostsResult>? = null

    private val postsViewModel: PostsViewModel by viewModel()
    private var postsAdapter: PostsAdapter? = null

    lateinit var tvPostsOffline: AppCompatTextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val parentView = super.onCreateView(inflater, container, savedInstanceState)
        inflater.inflate(R.layout.fragment_posts, contentContainer, true)
        return parentView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getPosts()

        tvPostsOffline = view.findViewById(R.id.tvOfflinePosts)
        tvPostsOffline.setOnClickListener {
            postsList?.clear()
            postsViewModel.callGetPostsLocally().observe(this, Observer {
                pbLoader.visibility = View.GONE

                if (it != null) {
                    postsList = it as ArrayList<PostsResult>?
                    adapterProcess()
                } else {
                    tvError.visibility = View.VISIBLE
                    adapterProcess()
                }
            })
        }
    }

    private fun adapterProcess() {
        postsAdapter = PostsAdapter(
            activity!!,
            postsList,
            onItemClicked = {
            })
        recPosts.adapter = postsAdapter
    }

    private fun getPosts() {
        postsList?.clear()
        pbLoader.visibility = View.VISIBLE
        postsViewModel.callGetPosts()
            .observe(this, Observer {
                pbLoader.visibility = View.GONE

                if (it != null) {
                    postsList = it
                    AsyncTask.execute {
                        Runnable {
                            postsViewModel.callDeletePostsLocally()
                            postsViewModel.savePosts(postsList!!)
                        }
                    }
                    adapterProcess()
                } else {
                    tvError.visibility = View.VISIBLE
                }
            })
    }

    companion object {
        val TAG: String = PostsFragment::class.java.simpleName

        val Object: String = "OBJECT"
    }
}
