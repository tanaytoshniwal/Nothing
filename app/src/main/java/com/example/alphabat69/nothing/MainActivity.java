package com.example.alphabat69.nothing;

import android.content.Intent;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    Bundle temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        temp=savedInstanceState;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        layout=(ConstraintLayout)findViewById(R.id.layout);
    }

    @Override
    public void onBackPressed() {}

    @Override
    protected void onPause() {
        super.onPause();
        Intent myIntent=new Intent(this,MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setAction(Intent.ACTION_MAIN);
        startActivity(myIntent);
        finish();
    }
}
