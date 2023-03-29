package com.example.snakedetectionsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telecom.Call;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class DoctorListActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.d_list);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.camera:
                        startActivity(new Intent(getApplicationContext(), CameraActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.d_list:
                        return true;

                }
                return false;
            }
        });

        listView = findViewById(R.id.listview);

        // Create data

        ArrayList<Doctor> arrayList = new ArrayList<>();
        arrayList.add(new Doctor(R.drawable.person,"Dr.B.P.K.Pethangoda","Homagama","0764134565"));
        arrayList.add(new Doctor(R.drawable.person,"Dr.B.D.A.Perera","Matara","0719875657"));
        arrayList.add(new Doctor(R.drawable.person,"Dr.H.K.S.Kularatne","Galle","0712134660"));
        arrayList.add(new Doctor(R.drawable.person," Dr.W.A.S.De Silva","Colombo","0712213312"));
        arrayList.add(new Doctor(R.drawable.person,"Dr.M. Gunawardena","Homagama","0772215661"));
        arrayList.add(new Doctor(R.drawable.person,"Dr R.A.De S Kulasiri","Colombo","0717896656"));
        arrayList.add(new Doctor(R.drawable.person,"Dr.K.A.S.Jayathilake","Piliyandala","0770675192"));
        arrayList.add(new Doctor(R.drawable.person,"Dr R.W.Hemantha","Galle","0764198997"));
        arrayList.add(new Doctor(R.drawable.person,"Dr P.K.C.Ranatunaga","Matara","0712345545"));


        //We make adapter
        DoctorAdapter doctorAdapter = new DoctorAdapter(this, R.layout.list_row, arrayList);

        listView.setAdapter(doctorAdapter);



    }
}