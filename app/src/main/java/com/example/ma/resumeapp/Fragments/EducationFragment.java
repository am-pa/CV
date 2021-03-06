package com.example.ma.resumeapp.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ma.resumeapp.MyRecyclerViewAdapter_Skills;
import com.example.ma.resumeapp.R;
import com.example.ma.resumeapp.CardsData;

import java.util.ArrayList;


public class EducationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    View view;

    public EducationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EducationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EducationFragment newInstance(String param1, String param2) {
        EducationFragment fragment = new EducationFragment();
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
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_education, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view_education);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter_Skills(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<CardsData> getDataSet() {
        ArrayList results = new ArrayList<CardsData>();


        String[] array_EducationTime=new String[5];
        String[] array_Education=new String[5];

        array_EducationTime[0]="Sep 2015‐ now";
        array_EducationTime[1]="2014‐2015";
        array_EducationTime[2]="2009 ‐ 2011";
        array_EducationTime[3]="2005 ‐ 2009";
        array_EducationTime[4]="2001 ‐ 2005";


        array_Education[0]="MS student in Computer Science, Uppsala University, Uppsala, Sweden.";
        array_Education[1]="Student in Swedish For Immigrants (SFI) Organization, Sandviken, Sweden.";
        array_Education[2]="MS in Computer Engineering – Artificial Intelligence (GPA 17.45 out of 20), Iran University of Science\n" +
                "and Technology, Tehran, Iran.";
        array_Education[3]="BS in Computer Engineering – Software (GPA 16.49 out of 20), Iran University of Science and\n" +
                "Technology, Tehran, Iran. (This university is ranked as the first university in Iran).";
        array_Education[4]="Diploma in Mathematics and Physics (GPA 19.70 out of 20).";



        for (int index = 0; index < 5; index++) {

            CardsData obj = new CardsData(array_EducationTime[index],
                    array_Education[index]);

            results.add(index, obj);
        }
        return results;
    }
}
