package com.sijkinc.abstractkim.retrofitpractice;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CoinCardRecyclerViewAdapter extends RecyclerView.Adapter<CoinCardViewHolder> {
    private final String TAG = "CCRecyclerViewAdapter";
    private List<CoinInfoForCardView> coinList;
    private ImageRequester imageRequester;

    CoinCardRecyclerViewAdapter(List<CoinInfoForCardView> coinList){
        this.coinList = coinList;
        imageRequester = ImageRequester.getInstance();
    }

    @NonNull
    @Override
    public CoinCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coin_card, parent, false);
        return new CoinCardViewHolder(layoutView);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull CoinCardViewHolder holder, int position) {
        if(coinList != null && position < coinList.size()){
            CoinInfoForCardView coinInfo = coinList.get(position);
            String coinName = coinInfo.getName();
            holder.coinName.setText(coinName);
            holder.coinFullName.setText(coinInfo.getFullName());
            holder.coinPrice.setText(coinInfo.getPrice());
            holder.coinChange24Hour.setText(coinInfo.getChange24hour());
            if(coinInfo.getGain() == CoinInfoForCardView.GAIN.LOSS)
                holder.coinChange24Hour.setBackground(CoinApplication.getDrawableFromApp(R.drawable.card_veiw_change_loss_rounded_corner));
            else
                holder.coinChange24Hour.setBackground(CoinApplication.getDrawableFromApp(R.drawable.card_view_change_gain_rounded_corner));

        }
    }

    @Override
    public int getItemCount() {
        return coinList.size();
    }
}
