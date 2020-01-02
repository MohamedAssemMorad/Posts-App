package com.example.postsapp.presentation.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.postsapp.R
import com.example.postsapp.core.helpers.TransitionType
import com.example.postsapp.data.source.remote.model.PostsResult
import com.example.postsapp.presentation.view.fragment.PostsDetailsFragment
import com.example.postsapp.core.utils.FragmentUtil

class PostsAdapter(
    val context: Context,
    val postsList: ArrayList<PostsResult>?,
    val onItemClicked: (item: PostsResult) -> Unit
) :
    RecyclerView.Adapter<PostsAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return postsList!!.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(postsList!![position])
    }

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: PostsResult?) {

            val postId: AppCompatTextView = itemView.findViewById(R.id.tvPostId)
            val postTitle: AppCompatTextView = itemView.findViewById(R.id.tvPostTitle)

            postId.text = item?.id.toString()
            postTitle.text = item?.title

            itemView.setOnClickListener {

                FragmentUtil.replaceFragment(
                    context as AppCompatActivity,
                    PostsDetailsFragment.newInstance(item),
                    true,
                    TransitionType.SLIDE_UP_DOWN,
                    PostsDetailsFragment.TAG
                )
            }

        }
    }

    companion object {
        @JvmField
        val TAG: String = PostsAdapter::class.java.simpleName

    }
}