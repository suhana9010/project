package com.sharu.session4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;

import com.sharu.session4.R;
import java.util.ArrayList;
public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.FeedbackViewHolder> {
    ArrayList<GDGFeedbak> gdgFeedbackList;
    Context context;

    public FeedbackAdapter(Context context,ArrayList<GDGFeedbak>feedbackList){
        gdgFeedbackList=feedbackList;
        this.context=context;
        GDGFeedbak g = new GDGFeedbak("nadm","db",4,"dgd","hgdn",7,true);
        gdgFeedbackList.add(g);
    }
    class FeedbackViewHolder extends RecyclerView.ViewHolder{
        TextView name,occupation,qualification,rating;
        public FeedbackViewHolder(@NonNull View itemView){
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.nameTV);
            occupation=(TextView)itemView.findViewById(R.id.occupationTV);
            qualification=(TextView)itemView.findViewById(R.id.qualificationTV);
            rating=(TextView)itemView.findViewById(R.id.ratingTV);




        }
    }
    @NonNull
    @Override
    public FeedbackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FeedbackViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull FeedbackViewHolder holder, int position) {
        GDGFeedbak gf=gdgFeedbackList.get(position);
        holder.rating.setText(gf.rating);
        holder.qualification.setText(gf.qualification);
        holder.occupation.setText(gf.occupation);
        holder.name.setText(gf.name+","+gf.age);


    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
