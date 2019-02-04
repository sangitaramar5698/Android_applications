package com.example.recyclerview3rdtrial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

public class newAdapterforRecyclerview extends RecyclerView.Adapter {
    String[] itemlist;

    public newAdapterforRecyclerview(String[] itemlist) {
        this.itemlist = itemlist;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View row= inflater.inflate(R.layout.rowlistofrecyclerview,viewGroup,false);


        return new itemholdingclass(row);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((itemholdingclass)viewHolder).txtview.setText(itemlist[i]);
    }

    @Override
    public int getItemCount() {
        return itemlist.length;

    }
    public class itemholdingclass extends RecyclerView.ViewHolder{
        TextView txtview;

        public itemholdingclass(@NonNull View itemView) {
            super(itemView);
            txtview=(TextView)itemView.findViewById(R.id.textid);

        }
    }
}
