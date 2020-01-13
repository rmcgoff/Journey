package com.stealbox.journey;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TripsListAdaptor extends ArrayAdapter<TripItem> {
    private Context mContext;
    private List<TripItem> tripItems = new ArrayList<>();

    public TripsListAdaptor(Context context, ArrayList<TripItem> list) {
        super(context, 0, list);
        tripItems = list;
    }

    @Override
    public View getView(int position, View tripListItem, @NonNull ViewGroup parent) {

        if(tripListItem == null){
            tripListItem = LayoutInflater.from(mContext).inflate(R.layout.trip_list_item,parent,false);
        }

        TextView tripName = tripListItem.findViewById(R.id.tripName);

        tripName.setText(tripItems.get(position).getTripName());
        return tripListItem;
    }
}
