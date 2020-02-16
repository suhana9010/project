package com.sharu.session4;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
public class thank_you extends AppCompatActivity {
    TextView thankyouTV;
    ArrayList<GDGFeedbak> gfList;
    FeedbackAdapter fadapter;
    RecyclerView feedbackRCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        thankyouTV=(TextView)findViewById(R.id.thankyouTV);
        gfList= new ArrayList<GDGFeedbak>();

        String name = getIntent().getStringExtra("name");
        GDGFeedbak gf=(GDGFeedbak) getIntent().getSerializableExtra("feedback");
        GDGFeedbak g1 = new GDGFeedbak("nadm","db",4,"dgd","hgdn",7,true);

        gfList.add(g1);
        GDGFeedbak g2 = new GDGFeedbak("nadm","db",4,"dgd","hgdn",7,true);
        gfList.add(g2);

        fadapter=new FeedbackAdapter(this,gfList);
        feedbackRCV=(RecyclerView)findViewById(R.id.feedbackRecycleView);
        feedbackRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        feedbackRCV.setAdapter(fadapter);
        fadapter.notifyDataSetChanged();

    }

}
