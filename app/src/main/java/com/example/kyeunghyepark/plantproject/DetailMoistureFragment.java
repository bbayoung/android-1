package com.example.kyeunghyepark.plantproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailMoistureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailMoistureFragment extends Fragment {
    private static final String ARG_PARAM1 = "plantId";
    private int mPlantId;

    public DetailMoistureFragment() {
        // Required empty public constructor
    }

    public static DetailMoistureFragment newInstance(int plantId) {
        DetailMoistureFragment fragment = new DetailMoistureFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, plantId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPlantId = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_moisture, container, false);
    }

}
