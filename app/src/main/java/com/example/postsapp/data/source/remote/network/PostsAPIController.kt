package com.example.postsapp.data.source.remote.network

import androidx.lifecycle.MutableLiveData
import com.example.postsapp.data.source.remote.model.PostsResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PostsAPIController {

    fun callGetPosts(): MutableLiveData<ArrayList<PostsResult>> {

        val data = MutableLiveData<ArrayList<PostsResult>>()

        if (getAppService() != null) {
            getAppService()?.callGetUserPosts()
                ?.enqueue(object : Callback<ArrayList<PostsResult>?> {
                    override fun onResponse(
                        call: Call<ArrayList<PostsResult>?>,
                        response: Response<ArrayList<PostsResult>?>
                    ) {
                        if (response.isSuccessful && response.body() != null)
                            data.value = response.body()
                        else
                            data.value = null
                    }

                    override fun onFailure(call: Call<ArrayList<PostsResult>?>, t: Throwable) {
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