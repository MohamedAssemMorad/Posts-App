package com.example.postsapp.network

import androidx.lifecycle.MutableLiveData
import com.example.postsapp.network.posts.PostsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PostsAPIController {

    fun callGetPosts(): MutableLiveData<PostsResponse> {

        val data = MutableLiveData<PostsResponse>()

        if (getAppService() != null) {
            getAppService()?.callGetUserPosts()?.enqueue(object : Callback<PostsResponse?> {
                override fun onResponse(
                    call: Call<PostsResponse?>,
                    response: Response<PostsResponse?>
                ) {
                    if (response.isSuccessful && response.body() != null)
                        data.value = response.body()
                    else
                        data.value = null
                }

                override fun onFailure(call: Call<PostsResponse?>, t: Throwable) {
                    data.value = null
                }


            })
        }

        return data
    }

    private fun getAppService(): RetrofitService? {
        return RetrofitHelper.getInstance()
    }
}