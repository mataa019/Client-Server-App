package com.example.cpringclient.retrofitservice;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EmployeeApi {
    @GET("/employee/get-all");
    Call<List<Employee>>GetAllEmployee();

    @POST("/employee/save");
    Call<Employee> SaveEmployee(@Body Employee employee);
}
