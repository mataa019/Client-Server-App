package com.example.cpringclient.retrofitservice;

import com.example.cpringclient.model.EmployeeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EmployeeApi {
    @GET("/employee/get-all")
    Call<List<EmployeeModel>>GetAllEmployee();

    @POST("/employee/save")
    Call<EmployeeModel> SaveEmployee(@Body EmployeeModel employee);
}
