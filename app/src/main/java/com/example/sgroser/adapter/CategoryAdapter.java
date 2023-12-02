package com.example.sgroser.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sgroser.R;
import com.example.sgroser.databinding.ItemCategoriesBinding;
import com.example.sgroser.models.CategoryModel;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    Context context;
    ArrayList<CategoryModel> arrCategory;

    public CategoryAdapter(Context context, ArrayList<CategoryModel> arrCategory) {
        this.context = context;
        this.arrCategory = arrCategory;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_categories,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModel categoryPosition=arrCategory.get(position);
        holder.binding.categoryText.setText(categoryPosition.getName());
        Glide.with(context).load(categoryPosition.getIcon())
                .into(holder.binding.CategoryImg);

        holder.binding.CategoryImg.setBackgroundColor(Color.parseColor(categoryPosition.getColor()));
    }

    @Override
    public int getItemCount() {
        return arrCategory.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        ItemCategoriesBinding binding;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemCategoriesBinding.bind(itemView);
        }
    }
}
