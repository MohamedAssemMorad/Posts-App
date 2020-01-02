package com.example.postsapp.presentation.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.postsapp.R
import com.example.postsapp.core.helpers.TransitionType
import com.example.postsapp.presentation.view.fragment.PostsFragment
import com.example.postsapp.core.utils.FragmentUtil

class PostsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)


        if (savedInstanceState == null) {
            FragmentUtil.replaceFragment(
                this,
                PostsFragment(), false, TransitionType.NONE, PostsFragment.TAG
            )
        }

    }
}