package com.example.vtetau.recyclerviewsnapfunkyness;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class TestAdapter extends RecyclerView.Adapter<TestViewHolder> {

    private static final int VIEWHOLDER_COUNT = 50;
    private static final String BASE_IMAGE_URL = "http://lorempixel.com/400/400/sports/";

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new TestViewHolder(inflater.inflate(R.layout.viewholder_test, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder viewHolder, int position) {
        viewHolder.setImageUrl(generateImageUrl(position));
    }

    @Override
    public int getItemCount() {
        return VIEWHOLDER_COUNT;
    }

    @NonNull
    private static String generateImageUrl(int position) {
        return BASE_IMAGE_URL + position;
    }

}
