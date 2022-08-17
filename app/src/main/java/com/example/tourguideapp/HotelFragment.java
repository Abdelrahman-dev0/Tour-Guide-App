package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelFragment extends Fragment {

    View view;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HotelFragment() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HotelFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HotelFragment newInstance(String param1, String param2) {
        HotelFragment fragment = new HotelFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.grand_pyramids_hotel), R.drawable.grandpyramids_hotel));
        locations.add(new Location(getString(R.string.four_seasons_hotel), R.drawable.fourseasons_hotel));
        locations.add(new Location(getString(R.string.marriott_mena_house_hotel), R.drawable.marriottmenahouse_hotel));
        locations.add(new Location(getString(R.string.pyramids_view_hotel), R.drawable.pyramidsview_hotel));
        locations.add(new Location(getString(R.string.grand_pyramids_hotel), R.drawable.grandpyramids_hotel));
        locations.add(new Location(getString(R.string.four_seasons_hotel), R.drawable.fourseasons_hotel));
        locations.add(new Location(getString(R.string.marriott_mena_house_hotel), R.drawable.marriottmenahouse_hotel));
        locations.add(new Location(getString(R.string.pyramids_view_hotel), R.drawable.pyramidsview_hotel));
        locations.add(new Location(getString(R.string.grand_pyramids_hotel), R.drawable.grandpyramids_hotel));
        locations.add(new Location(getString(R.string.four_seasons_hotel), R.drawable.fourseasons_hotel));
        locations.add(new Location(getString(R.string.marriott_mena_house_hotel), R.drawable.marriottmenahouse_hotel));
        locations.add(new Location(getString(R.string.pyramids_view_hotel), R.drawable.pyramidsview_hotel));

        view = inflater.inflate(R.layout.location_list, container, false);

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        // Create ListView object in places_list.xml and set the LocationAdapter object to it
        ListView listView = view.findViewById(R.id.list);
        listView.setAdapter((ListAdapter) locationAdapter);

        // Return current View object with the data
        return view;
    }
}