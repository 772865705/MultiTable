package com.zy.multiscrolltabledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toScrollPanel(View view){
        startActivity(new Intent(this,ScrollPanelAty.class));
    }

    public void toMyPanel(View view){

    }
}
