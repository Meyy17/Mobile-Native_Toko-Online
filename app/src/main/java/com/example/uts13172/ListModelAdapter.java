package com.example.uts13172;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListModelAdapter extends RecyclerView.Adapter<ListModelAdapter.ListViewHolder>{
    private ArrayList<BarangModel> listModel;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListModelAdapter(ArrayList<BarangModel> list){
        this.listModel = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        BarangModel barangModel = listModel.get(position);
        Glide.with(holder.itemView.getContext()).load(barangModel.getGambar()).apply(new RequestOptions()).override(80,80).into(holder.imgbarang);
        holder.tvname.setText(barangModel.getNama());
        holder.tvprice.setText(barangModel.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listModel.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgbarang;
        TextView tvname, tvprice;
        public ListViewHolder(View itemview) {
            super(itemview);
            imgbarang = itemview.findViewById(R.id.img_item);
            tvname = itemview.findViewById(R.id.tv_itemname);
            tvprice = itemview.findViewById(R.id.tv_itemprice);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(BarangModel data);
    }
}
