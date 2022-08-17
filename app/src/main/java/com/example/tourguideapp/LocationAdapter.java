package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new {@link LocationAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param object is the list of {@link Location}s to be displayed.
     */
    public LocationAdapter(Context context, ArrayList<Location> object) {
        super(context, 0, object);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Location object located at this position in the list
        Location currentPlace = (Location) getItem(position);

        // Find the TextView in the list_item.xml and set to it the place name from Location object
        TextView placeTextView = convertView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentPlace.getLocation());

        // Find the ImageView in the list_item.xml and display the provided photo from Location object
        ImageView itemImageView = convertView.findViewById(R.id.item_image);
        itemImageView.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}