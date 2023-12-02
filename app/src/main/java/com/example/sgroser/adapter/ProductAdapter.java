package com.example.sgroser.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sgroser.R;
import com.example.sgroser.databinding.ItemProductBinding;
import com.example.sgroser.models.ProductModel;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    Context context;
    ArrayList<ProductModel> arrProduct;

    public ProductAdapter(Context context, ArrayList<ProductModel> arrProduct) {
        this.context = context;
        this.arrProduct = arrProduct;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.item_product,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        ProductModel productPosition=arrProduct.get(position);
        Glide.with(context).load(productPosition.getImg()).into(holder.binding.productImg);
        holder.binding.productName.setText(productPosition.getName() );
        holder.binding.productPrice.setText("PKR: "+productPosition.getPrice());

    }

    @Override
    public int getItemCount() {
        return arrProduct.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ItemProductBinding binding;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemProductBinding.bind(itemView);
        }
    }
}
