package com.example.grupobecm8.drawer.lista.presenters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.grupobecm8.drawer.R;

import java.util.List;

/**
 * Created by Grupo BECM 8 on 20/02/2017.
 */

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.ViewHolder> {

    private List<String> names;
    private ItemClickListener itemClickListener;

    public NameAdapter(List<String> names, ItemClickListener itemClickListener) {
        this.names = names;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(names.get(position));
        final int place = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(place);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }

    public interface ItemClickListener {
        void onItemClick(int position);
    }

}
