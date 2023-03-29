package com.example.snakedetectionsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class HomeActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ListView mListView;

    String[] snakeNames = {"Cobra (නයා)", "NosedViper (පොලොන් තෙලිස්සා)", "Python (පිඹුරා)", "RatSnake (ගැරඬියා)", "Russell'sViper (තිත් පොලගා)"};
    int[] snakeImages = {
            R.drawable.cobra,
            R.drawable.nosed_viper,
            R.drawable.python,
            R.drawable.rat_snake,
            R.drawable.russell_viper};

    String[] snakeDetails = {
            "Cobras are a group of venomous snakes found in Sri Lanka, and several species are native to the country. All species of cobras in Sri Lanka are venomous and can be dangerous to humans. \n\nThe cobra bite can cause a range of symptoms, including pain and swelling at the bite site, nausea and vomiting, headache, dizziness and confusion, blurred vision, muscle weakness, difficulty swallowing, and respiratory distress. The severity and onset of symptoms can vary depending on the size of the snake, the location of the bite, and the amount of venom injected. \n\nIf someone is bitten by a cobra, it's crucial to seek medical attention immediately. In the meantime, follow these steps for first aid: immobilize the bite site, clean it with soap and water, remove tight clothing and jewelry, apply a firm bandage, and keep the affected limb elevated. Antivenom may be required to neutralize the venom, and other treatments such as breathing support, pain relief, and medications to manage symptoms may also be necessary in severe cases.",
            "The Nose-Horned Viper, also known as the nose-horned viper or the adder, is a venomous species of viper found in various parts of Europe and Asia, including Sri Lanka. They are small, stocky snakes that are characterized by the distinctive horn-like projections above their noses.\n\nBites from the Nose-Horned Viper can cause severe symptoms in Sri Lanka, including intense pain, swelling, and redness at the bite site, as well as nausea, vomiting, and muscle weakness. In severe cases, a bite from this viper can lead to more serious symptoms such as difficulty breathing, low blood pressure, and in some cases, even death if left untreated.\n\nIf someone is bitten by a Nose-Horned Viper, it's important to seek medical attention immediately. In the meantime, it's important to immobilize the affected limb and clean the bite site with soap and water. Remove any tight clothing or jewelry, and apply a firm bandage to help slow the spread of venom. It's important to keep the affected limb elevated, and to remain calm and still, as movement can increase the spread of venom. Antivenom may be necessary to neutralize the venom, and other treatments such as pain relief, breathing support, and medications to manage symptoms may also be required in severe cases.",
            "Python snakes are a species of non-venomous constrictors that are found in Sri Lanka. These snakes are known for their large size, with some individuals growing up to 30 feet in length. Pythons are typically found in forested areas and near water sources, where they hunt for prey such as birds and small mammals.\n\nIn Sri Lanka, pythons are considered to be an important part of the local ecosystem, playing a role in controlling the populations of small mammals and birds. Despite their importance, pythons are also considered to be a potential threat to human safety, as they can become aggressive if they feel threatened. For this reason, it is important to take precautions when hiking or camping in areas where pythons are known to live.\n\nIf you encounter a python in Sri Lanka, it is important to remain calm and avoid making any sudden movements. You should also avoid getting too close to the snake, as this can cause it to feel threatened and become aggressive. If you are bitten by a python, it is important to seek medical attention as soon as possible, even though their bites are generally not venomous. In the meantime, you should immobilize the affected limb and keep it elevated to slow down the spread of any venom that may have entered your bloodstream.",
            "Rat snakes, also known as colubrid snakes, are a species of non-venomous snakes found in Sri Lanka. They are commonly referred to as \"rat snakes\" due to their tendency to hunt and feed on rats, mice, and other small rodents. Rat snakes are typically found in agricultural and rural areas, where they help to control rodent populations.\n\nIn Sri Lanka, rat snakes can grow up to 6 feet in length, and they are known for their slender bodies and smooth scales. They are typically grey or brown in color, and they have a distinctive triangular head and narrow neck. Rat snakes are generally not considered to be dangerous to humans, as they are non-venomous and do not typically bite unless they feel threatened.\n\nIf you encounter a rat snake in Sri Lanka, it is important to remain calm and avoid making any sudden movements. You should also avoid getting too close to the snake, as this can cause it to feel threatened and become defensive. If you are bitten by a rat snake, it is important to seek medical attention as soon as possible, even though their bites are generally not venomous. In the meantime, you should clean the bite wound with soap and water, immobilize the affected limb, and seek medical attention to ensure that the bite does not become infected.",
            "Russell's viper, also known as Daboia russelii, is a venomous snake species found in Sri Lanka. These snakes are known for their distinctive appearance, which includes a triangular head, narrow neck, and thick, stocky body. Russell's vipers are usually brown or gray in color, and they have a pattern of diamond-shaped markings on their backs.\n\nIf a person is bitten by a Russell's viper, they may experience a range of symptoms, including severe pain, swelling, and bruising at the bite site. In some cases, the bite may also cause numbness, tingling, and difficulty breathing. If left untreated, a Russell's viper bite can be life-threatening, as the venom can cause internal bleeding, kidney failure, and other serious complications.\n\nIn the case of a Russell's viper bite, it is important to seek medical attention as soon as possible. In the meantime, you can take the following first aid measures: keep the affected limb immobilized and at or below the level of your heart, remove any tight clothing or jewelry from the bite site, and wash the bite wound with soap and water. It is also important to avoid moving the affected limb, as this can cause the venom to spread more quickly through your bloodstream. If you are in a remote area, it is important to try to reach medical assistance as soon as possible, as prompt treatment is essential for preventing serious complications."};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        return true;
                    case R.id.camera:
                        startActivity(new Intent(getApplicationContext(), CameraActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.d_list:
                        startActivity(new Intent(getApplicationContext(), DoctorListActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));

        mListView = (ListView) findViewById(R.id.listview);

        MyAdapter myAdapter = new MyAdapter(HomeActivity.this, snakeNames, snakeImages);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent mIntent = new Intent(HomeActivity.this, DetailActivity.class);
                mIntent.putExtra("snakeName", snakeNames[i]);
                mIntent.putExtra("snakeImage", snakeImages[i]);
                mIntent.putExtra("snakeDetail", snakeDetails[i]);
                startActivity(mIntent);

            }
        });
    }
}