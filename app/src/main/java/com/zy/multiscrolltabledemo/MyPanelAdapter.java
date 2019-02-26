package com.zy.multiscrolltabledemo;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kelin.scrollablepanel.library.PanelAdapter;
import com.kelin.scrollablepanel.library.ScrollablePanel;

/**
 * Created by ZhaoYue on 2019/2/26.
 */
public class MyPanelAdapter extends PanelAdapter {
    private static final String TAG = "MyPanelAdapter";
    @Override
    public int getRowCount() {
        return 20;
    }

    @Override
    public int getColumnCount() {
        return 20;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int row, int column) {
        TitleViewHolder h = ((TitleViewHolder) holder);
        if (row == 0){
            h.titleTextView.setText(""+column);
            h.titleTextView.setTextColor(Color.RED);
        }else if (column == 0){
            h.titleTextView.setText(""+row);
            h.titleTextView.setTextColor(Color.BLUE);
        }else {
            h.titleTextView.setText(""+ row*column);
            h.titleTextView.setTextColor(Color.GRAY);
        }
        if (row>column && column >0){
            h.titleTextView.setText("-");
        }
        h.itemView.setOnClickListener((v)->{
            Log.i(TAG, "onBindViewHolder: "+h.titleTextView.getText());
        });
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TitleViewHolder(View.inflate(parent.getContext(),R.layout.item_table,null));
    }

    private static class TitleViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;

        public TitleViewHolder(View view) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(R.id.title);
        }
    }
}
