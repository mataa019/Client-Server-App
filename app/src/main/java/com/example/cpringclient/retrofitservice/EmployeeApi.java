package com.example.cpringclient.retrofitservice;

import java.util.List;

import retrofit2.http.GET;

public class EmployeeApi {
    @GET("/employee/get-all")
    Call<List<Employee>> getAllEmployee();

    @GET("/employee/save")
    Call<List<Employee>> SaveEmployee();
}
