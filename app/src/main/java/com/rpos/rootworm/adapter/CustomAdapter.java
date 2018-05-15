package com.rpos.rootworm.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rpos.rootworm.entity.MyData;
import com.rpos.rootworm.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<MyData> my_data;

    public CustomAdapter(List<MyData> my_data) {
        this.my_data = my_data;
    }

    public void setMy_data(List<MyData> my_data) {
        this.my_data = my_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row_view,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.sender.setText(my_data.get(position).getSender());
        holder.text.setText(my_data.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView sender;
        public TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            sender = (TextView) itemView.findViewById(R.id.textViewSender);
            text = (TextView) itemView.findViewById(R.id.textViewMessage);
        }
    }
}
