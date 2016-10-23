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


public class SkillsFragment extends Fragment {
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

    public SkillsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SkillsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SkillsFragment newInstance(String param1, String param2) {
        SkillsFragment fragment = new SkillsFragment();
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
        view = inflater.inflate(R.layout.fragment_skills, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter_Skills(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }


    private ArrayList<CardsData> getDataSet() {
        ArrayList results = new ArrayList<CardsData>();


       String[] array_skillTitle=new String[7];
        String[] array_skillDetail=new String[7];

        array_skillTitle[0]="Programming Languages";
        array_skillTitle[1]="Programming Technologies";
        array_skillTitle[2]="Web Design and Programming";
        array_skillTitle[3]="Programming Frameworks";
        array_skillTitle[4]="Database Design";
        array_skillTitle[5]="Program Verification";
        array_skillTitle[6]="others";

       array_skillDetail[0]="Java, C/C++, JavaScript, MATLAB";
        array_skillDetail[1]="Android , Java Hibernate";
        array_skillDetail[2]="HTML5, CSS3, JavaScript";
        array_skillDetail[3]="Microsoft Visual Studio, Eclipse, MATLAB, Android Studio";
        array_skillDetail[4]="Java Hibernate, EER Design, SQL and AmoSQL Languages, MySQL Software, Familiar with Relational Database Management System (RDBMS) and Object‐Relational Database  Management System (ORDBMS)";
        array_skillDetail[5]="Familiar with Programming Theory to verify codes using Dafny";
        array_skillDetail[6]="Git, Scrum Methodology, WEKA software, Rational Rose, Ubuntu";


        for (int index = 0; index < 7; index++) {

            CardsData obj = new CardsData(array_skillTitle[index],
                    array_skillDetail[index]);

            results.add(index, obj);
        }
        return results;
    }

}
