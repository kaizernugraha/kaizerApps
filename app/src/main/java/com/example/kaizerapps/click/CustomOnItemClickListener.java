package com.example.kaizerapps.click;

import android.view.View;

// 10116336 KAIZER NUGRAHA IF-8  8/14/2019
public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);

    }
    public interface OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
