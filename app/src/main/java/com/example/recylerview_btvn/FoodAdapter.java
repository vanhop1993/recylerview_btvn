package com.example.recylerview_btvn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {

    private List<Food> mFood;
    public FoodAdapter(List<Food> mFood) {
        if(mFood != null) {
            this.mFood = mFood;
        }else {
            this.mFood =new ArrayList<>();
        }
    }


    @NonNull
    @Override
    public FoodAdapter.FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_food,parent,false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.FoodHolder holder, int position) {
        Food food = mFood.get(position);
        holder.txtNameFood.setText(food.getFoodName());
        holder.txtViewAddress.setText(food.getAddress());
        holder.txtViewDiscount.setText(food.getDiscount());
        holder.imgFood.setImageResource(food.getImage());
    }

    @Override
    public int getItemCount() {
        return mFood.size();
    }
    class FoodHolder extends RecyclerView.ViewHolder{
        ImageView imgFood;
        TextView txtNameFood,txtViewAddress,txtViewDiscount;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.imagFood);
            txtNameFood = itemView.findViewById(R.id.textviewNameFood);
            txtViewAddress = itemView.findViewById(R.id.txtViewAddress);
            txtViewDiscount = itemView.findViewById(R.id.txtViewDiscount);
        }
    }
}
