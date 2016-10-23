package com.example.ma.resumeapp.Fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ma.resumeapp.CardsData;
import com.example.ma.resumeapp.MyRecyclerViewAdapter_Skills;
import com.example.ma.resumeapp.R;

import java.util.ArrayList;


public class OtherProjectsFragment extends Fragment {
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

    public OtherProjectsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OtherProjectsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OtherProjectsFragment newInstance(String param1, String param2) {
        OtherProjectsFragment fragment = new OtherProjectsFragment();
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
        view = inflater.inflate(R.layout.fragment_other_projects, container, false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view_other_projects);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter_Skills(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<CardsData> getDataSet() {
        ArrayList results = new ArrayList<CardsData>();

        String[] array_ProjectTitle =new String[15];
        String[] array_Projects =new String[15];
        array_ProjectTitle[0]="Current Project";
        array_ProjectTitle[1]="MSc Thesis";
        array_ProjectTitle[2]="BSc Thesis";

        array_Projects[0]="Project CS 2016 os carried out in the context of GreenIoT, a national project funded by Vinnova (The Swedish innovation Agency). Our project is a cooperation between Uppsala University "
        +",ERICSSON and SICS. The project goal is to develop an integrated sensing system. It will explore an advanced technology called Information-Centric Networking on Internet-of-Things to "+
                "facilitate the collection of sensor data";
        array_Projects[1]="---";
        array_Projects[2]="---";
        array_Projects[3]="---";
        array_Projects[4]="---";
        array_Projects[5]="---";
        array_Projects[6]="---";
        array_Projects[7]="---";
        array_Projects[8]="---";
        array_Projects[9]="---";
        array_Projects[10]="---";
        array_Projects[11]="---";
        array_Projects[12]="---";
        array_Projects[13]="---";
        array_Projects[14]="---";

        for (int index = 0; index < 15; index++) {

            CardsData obj = new CardsData(array_ProjectTitle[index],
                    array_Projects[index]);

            results.add(index, obj);
        }
        return results;
    }
   
}
