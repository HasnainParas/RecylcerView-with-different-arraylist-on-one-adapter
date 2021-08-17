package com.hasnain.recylcerviewdifferentarraylist.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.hasnain.recylcerviewdifferentarraylist.MainActivity2;
import com.hasnain.recylcerviewdifferentarraylist.Models.FirstModel;
import com.hasnain.recylcerviewdifferentarraylist.R;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.viewHolder> {

    ArrayList<FirstModel> list;
    Context context;

    public FirstAdapter(ArrayList<FirstModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.first_sample_layout,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        FirstModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position "+position +" Clicked", Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        Intent intent = new Intent(holder.itemView.getContext(), MainActivity2.class);
                        intent.putExtra("key1",position);
                        holder.itemView.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(holder.itemView.getContext(),MainActivity2.class);
                        intent1.putExtra("key1",position);
                        holder.itemView.getContext().startActivity(intent1);
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.txtView);

        }
    }

}
