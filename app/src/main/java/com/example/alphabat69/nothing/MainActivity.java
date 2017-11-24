package com.example.alphabat69.nothing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        //nothing
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return false;
    }

    @Override
    protected void onPause() {
        Intent myIntent=new Intent(this,MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setAction(Intent.ACTION_MAIN);
        startActivity(myIntent);
        super.onPause();
    }

    @Override
    protected void onStop() {
        Intent myIntent=new Intent(this,MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setAction(Intent.ACTION_MAIN);
        startActivity(myIntent);
        super.onStop();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Intent myIntent=new Intent(this,MainActivity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        myIntent.setAction(Intent.ACTION_MAIN);
        startActivity(myIntent);
        super.onWindowFocusChanged(true);
    }
}
