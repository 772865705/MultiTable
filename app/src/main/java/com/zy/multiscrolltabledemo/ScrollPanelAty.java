package com.zy.multiscrolltabledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kelin.scrollablepanel.library.ScrollablePanel;

public class ScrollPanelAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_panel_aty);

        ScrollablePanel sp = findViewById(R.id.sp);
        sp.setPanelAdapter(new MyPanelAdapter());
    }
}
