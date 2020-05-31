package com.example.materialdesignapp.ui.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignapp.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<String> list;

    public RecyclerViewAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_for_recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
//        return list.size();
        return Integer.MAX_VALUE;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(int position) {
            textView.setText(list.get(position % list.size()));
//            textView.setText(list.get(position));
            switch (position % 6) {
                case 0:
                    imageView.setImageResource(R.drawable.monster1);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.monster2);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.monster3);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.monster4);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.monster5);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.monster6);
                    break;
            }

        }
    }
}
