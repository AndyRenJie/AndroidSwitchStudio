package com.rocky.activityswitch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author Created by Andy.Ren on 2017/12/7.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    private Context mContext;
    private ArrayList<String> mList;
    private LayoutInflater mInflater;

    public MainAdapter(Context context,ArrayList<String>list){
        this.mContext = context;
        this.mList = list;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, final int position) {
        holder.itemTV.setText(mList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SecondActivity.class);
                mContext.startActivity(intent);
                switch (position) {
                    case 0:
                        ((Activity)mContext).overridePendingTransition(R.anim.fade, R.anim.hold);
                        break;
                    case 1:
                        ((Activity)mContext).overridePendingTransition(R.anim.my_scale_action,
                                R.anim.my_alpha_action);
                        break;
                    case 2:
                        ((Activity)mContext).overridePendingTransition(R.anim.scale_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 3:
                        ((Activity)mContext).overridePendingTransition(R.anim.scale_translate_rotate,
                                R.anim.my_alpha_action);
                        break;
                    case 4:
                        ((Activity)mContext).overridePendingTransition(R.anim.scale_translate,
                                R.anim.my_alpha_action);
                        break;
                    case 5:
                        ((Activity)mContext).overridePendingTransition(R.anim.hyperspace_in,
                                R.anim.hyperspace_out);
                        break;
                    case 6:
                        ((Activity)mContext).overridePendingTransition(R.anim.push_left_in,
                                R.anim.push_left_out);
                        break;
                    case 7:
                        ((Activity)mContext).overridePendingTransition(R.anim.push_up_in,
                                R.anim.push_up_out);
                        break;
                    case 8:
                        ((Activity)mContext).overridePendingTransition(R.anim.slide_left,
                                R.anim.slide_right);
                        break;
                    case 9:
                        ((Activity)mContext).overridePendingTransition(R.anim.wave_scale,
                                R.anim.my_alpha_action);
                        break;
                    case 10:
                        ((Activity)mContext).overridePendingTransition(R.anim.zoom_enter,
                                R.anim.zoom_exit);
                        break;
                    case 11:
                        ((Activity)mContext).overridePendingTransition(R.anim.slide_up_in,
                                R.anim.slide_down_out);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{

        TextView itemTV;

        public MainViewHolder(View itemView) {
            super(itemView);
            itemTV = (TextView) itemView.findViewById(R.id.item_tv);
        }
    }
}
