package com.example.cpringclient.retrofitservice;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private Retrofit retrofit;

    public  RetrofitService(){
       initializedRetrofit();
    }
  public  void initializedRetrofit(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.50:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
  }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
