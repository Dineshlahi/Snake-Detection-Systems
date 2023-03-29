package com.example.snakedetectionsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mImageView;
    TextView mTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        mImageView =(ImageView) findViewById(R.id.imageView2);
        mTextView =(TextView) findViewById(R.id.textView);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle != null){
            mToolbar.setTitle(mBundle.getString("snakeName"));
            mImageView.setImageResource(mBundle.getInt("snakeImage"));
            mTextView.setText(mBundle.getString("snakeDetail"));
   }

}

}
