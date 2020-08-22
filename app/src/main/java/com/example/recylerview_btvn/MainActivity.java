package com.example.recylerview_btvn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerViewRes1,mRecyclerViewRes2;
    FoodAdapter mFoodAdapter,mFoodAdapter2;
    ArrayList<Food> mArrayFoodslist,mArrayFoodslist2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayFoodslist = new ArrayList<>();
        mArrayFoodslist2 = new ArrayList<>();

        mRecyclerViewRes1       = findViewById(R.id.recyclerViewRes1);
        mRecyclerViewRes2       = findViewById(R.id.recyclerViewRes2);

        mFoodAdapter = new FoodAdapter(mArrayFoodslist);
        mFoodAdapter2 = new FoodAdapter(mArrayFoodslist2);
        mRecyclerViewRes1.setAdapter(mFoodAdapter);
        mRecyclerViewRes2.setAdapter(mFoodAdapter2);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        mRecyclerViewRes1.setLayoutManager(layoutManager1);
        mRecyclerViewRes2.setLayoutManager(layoutManager2);

        //food list 1
        mArrayFoodslist.add(new Food(R.drawable.banh_cuon,"bánh cuốn","đường thảo điền","giam 35%","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist.add(new Food(R.drawable.banh_mi,"Bánh mì","Hồ Xuân Hương","giam 30%","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist.add(new Food(R.drawable.bun_haisan,"Bún hải sản","quận hoàn kiếm","giam 30%","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist.add(new Food(R.drawable.che,"trà sữa","quận hai bà trưng","giam 30%","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist.add(new Food(R.drawable.com_ga,"Cơm gà","hoàng hoa thám","giam 30%","Xem thêm 1 ưu đãi khác"));

        //food list 2
        mArrayFoodslist2.add(new Food(R.drawable.jisoo,"jisoo","Hai Bà Trưng","giam 15","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist2.add(new Food(R.drawable.lacay_shop,"bánh gối","Hai Bà Trưng","giam 15","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist2.add(new Food(R.drawable.ngan_tron,"ngan trộn","Hai Bà Trưng","giam 15","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist2.add(new Food(R.drawable.tra_sua,"trà sữa","Hai Bà Trưng","giam 15","Xem thêm 1 ưu đãi khác"));
        mArrayFoodslist2.add(new Food(R.drawable.vit_zozo,"vịt quay","Hai Bà Trưng","giam 15","Xem thêm 1 ưu đãi khác"));


    }



}