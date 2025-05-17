package com.example.cpringclient;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cpringclient.model.EmployeeModel;
import com.example.cpringclient.retrofitservice.EmployeeApi;
import com.example.cpringclient.retrofitservice.RetrofitService;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    TextInputEditText Name;
    TextInputEditText Branch;
    TextInputEditText Location;

    Button ButtonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Name = findViewById()
    }
    private void Components(){
        Name = findViewById(R.id.Name);
        Branch = findViewById(R.id.Branch);
        Location = findViewById(R.id.location);
        ButtonSave= findViewById(R.id.submit);
        RetrofitService retrofitService = new RetrofitService();
        EmployeeApi employeeApi = retrofitService.getRetrofit().create(EmployeeApi.class);

        ButtonSave.setOnClickListener(view -> {
         String name = String.valueOf(Name.getText());
         String branch = String.valueOf(Branch.getText());
         String location = String.valueOf(Location.getText());

         EmployeeModel employeeModel = new EmployeeModel();
         employeeModel.setName(name);
         employeeModel.setBranch(branch);
         employeeModel.setLocation(location);

         employeeApi.SaveEmployee(employeeModel)
                 .enqueue(new Callback<EmployeeModel>() {
                     @Override
                     public void onResponse(Call<EmployeeModel> call, Response<EmployeeModel> response) {
                         Toast.makeText(MainActivity.this, "Save Successfull", Toast.LENGTH_SHORT).show();
                     }

                     @Override
                     public void onFailure(Call<EmployeeModel> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Save Failed", Toast.LENGTH_SHORT).show();
                     }
                 });
     });
    }
}