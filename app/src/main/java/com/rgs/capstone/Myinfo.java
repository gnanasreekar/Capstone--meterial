package com.rgs.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Myinfo extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_layout)
    CollapsingToolbarLayout toolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.linkdin)
    TextView linkdin;
    @BindView(R.id.youtube)
    TextView youtube;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.feedback_myinfo)
    FloatingActionButton feedbackMyinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView myClickableUrl =  findViewById(R.id.linkdin);
        myClickableUrl.setText(getString(R.string.lindin));
        Linkify.addLinks(myClickableUrl, Linkify.WEB_URLS);

        final TextView myClickableUrlYT =  findViewById(R.id.youtube);
        myClickableUrlYT.setText(getString(R.string.yotube));
        Linkify.addLinks(myClickableUrlYT, Linkify.WEB_URLS);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "😁😁😁😁😁😁😁😁😁", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        feedbackMyinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Myinfo.this,Feedback.class));
            }
        });
    }
}
