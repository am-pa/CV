package com.example.ma.resumeapp.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ma.resumeapp.MyXAxisValueFormatter;
import com.example.ma.resumeapp.MyYAxisValueFormatter;
import com.example.ma.resumeapp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;


public class LanguageSkillsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    View view;

    public LanguageSkillsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LanguageSkillsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LanguageSkillsFragment newInstance(String param1, String param2) {
        LanguageSkillsFragment fragment = new LanguageSkillsFragment();
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
        view = inflater.inflate(R.layout.fragment_language_skills, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        BarChart chart = (BarChart) view.findViewById(R.id.chart);
        Description des = new Description();
        des.setText("");
        chart.setDescription(des);
        BarData data = new BarData(getDataSet());

        XAxis xAxis = chart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(12f);
        xAxis.setTextColor(Color.BLACK);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelRotationAngle(90);
        String[] xValues = new String[] { "Swedish", "English", "Persian","" };
        xAxis.setValueFormatter(new MyXAxisValueFormatter(xValues));
        xAxis.setGranularity(1f);

        YAxis yAxis = chart.getAxisLeft();
        yAxis.setTextSize(12f);
        yAxis.setTextColor(Color.BLACK);
        yAxis.setDrawAxisLine(true);
        String[] yValues = new String[] {"", "Basic", "Fluent", "Native" };
        yAxis.setValueFormatter(new MyYAxisValueFormatter(yValues));
        yAxis.setGranularity(1f);




        chart.setData(data);
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private List<IBarDataSet> getDataSet() {
        List<IBarDataSet> dataSets = null;

        List<BarEntry> valueSet = new ArrayList<BarEntry>();
        BarEntry v1e1 = new BarEntry(0.0f, 1);
        valueSet.add(v1e1);
        BarEntry v1e2 = new BarEntry(1.0f, 2);
        valueSet.add(v1e2);
        BarEntry v1e3 = new BarEntry(2.0f, 3);
        valueSet.add(v1e3);


        BarDataSet barDataSet1 = new BarDataSet(valueSet, "Level");
        barDataSet1.setColor(Color.rgb(0, 155, 0));

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }


}
