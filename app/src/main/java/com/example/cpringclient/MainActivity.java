package com.example.cpringclient;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

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

     ButtonSave.setOnClickListener(view -> {
         String name = String.valueOf(Name.getText());
         String branch = String.valueOf(Branch.getText());
         String location = String.valueOf(Location.getText());

     });
    }
}