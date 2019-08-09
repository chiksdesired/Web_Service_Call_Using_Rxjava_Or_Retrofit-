package com.example.chirag.rxandroid;

import com.example.chirag.rxandroid.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface APIService {

    //retrofit
    /*@POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);*/

    //rxjava
    @POST("/posts")
    @FormUrlEncoded
    Observable<Post> savePost(@Field("title") String title,
                              @Field("body") String body,
                              @Field("userId") long userId);

}
