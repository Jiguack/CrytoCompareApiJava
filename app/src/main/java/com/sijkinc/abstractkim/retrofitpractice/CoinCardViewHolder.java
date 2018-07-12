package com.sijkinc.abstractkim.retrofitpractice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class CoinCardViewHolder extends RecyclerView.ViewHolder {
    public NetworkImageView coinImange;
    public TextView coinName;
    public TextView coinFullName;
    public TextView coinPrice;
    public TextView coinChange24Hour;

    public CoinCardViewHolder(@NonNull View itemView) {
        super(itemView);
        coinName = itemView.findViewById(R.id.coin_name);
        coinFullName = itemView.findViewById(R.id.coin_fullname);
        coinPrice = itemView.findViewById(R.id.coin_price);
        coinChange24Hour = itemView.findViewById(R.id.coin_change);

    }
}
