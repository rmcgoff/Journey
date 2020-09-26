package com.stealbox.journey;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TripsListAdaptor extends RecyclerView.Adapter<TripsListAdaptor.ViewHolder> {
    private Context mContext;
    private List<TripItem> tripItems;

    public TripsListAdaptor(Context context, ArrayList<TripItem> list) {
        this.mContext = context;
        tripItems = list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trip_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        TripItem trip = tripItems.get(position);
        holder.tripName.setText(trip.getTripName());
    }

    @Override
    public int getItemCount() {
        return tripItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tripName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tripName = itemView.findViewById(R.id.tripName);
            //set up other shit in here!!
        }
    }
}
