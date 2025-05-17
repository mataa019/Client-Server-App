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
                .baseUrl("hppt://192.168.1.50:8080")
                .addConverterFactory(GsonConverterFactory(new Gson()))
  }
}
