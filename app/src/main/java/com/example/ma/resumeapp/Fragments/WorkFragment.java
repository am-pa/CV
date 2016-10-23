package com.example.ma.resumeapp.Fragments;

import android.content.Context;
import android.net.Uri;
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


public class WorkFragment extends Fragment {
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

    public WorkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WorkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WorkFragment newInstance(String param1, String param2) {
        WorkFragment fragment = new WorkFragment();
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
        view = inflater.inflate(R.layout.fragment_work, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view_work);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter_Skills(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<CardsData> getDataSet() {
        ArrayList results = new ArrayList<CardsData>();


        String[] array_WorkTime=new String[4];
        String[] array_Work=new String[4];

        array_WorkTime[0]="Summer 2016";
        array_WorkTime[1]="2012‐2014";
        array_WorkTime[2]="2011 ‐ 2012";
        array_WorkTime[3]="Summer 2009";


        array_Work[0]="Sandvik Coromant,Sandviken,Sweden: System Developer:Creating a web-based user interface for documentation of an application using Java,Javascript, HTML5 and CSS3.";
        array_Work[1]="Lecturer as a member of academic staff, Computer Engineering Department, Iran University of Science\n" +
                "and Technology, Behshahr, Iran. Some courses which I have taught:\n" +
                "Fundamentals of C++ Programming, Advanced Programming Language, Discrete Mathematics, Artificial\n" +
                "Intelligence, Algorithms and Data Structure, Computer Lab, Technical English";
        array_Work[2]="Java Developer and Researcher, AFTA Co., Tehran, Iran.\n" +
                "Android Developer, AFTA Co., Tehran, Iran.";
        array_Work[3]="Internship, Computer and Video Games Foundation Co., Tehran, Iran.\n" +
                "Java Programming";




        for (int index = 0; index < 4; index++) {

            CardsData obj = new CardsData(array_WorkTime[index],
                    array_Work[index]);

            results.add(index, obj);
        }
        return results;
    }

}
