package com.example.vtetau.recyclerviewsnapfunkyness;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.imageview)
    ImageView imageView;

    public TestViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setImageUrl(@NonNull String url) {
        Picasso.with(this.itemView.getContext())
                .load(url)
                .centerCrop()
                .fit()
                .into(this.imageView);
    }
}
