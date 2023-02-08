package com.example.androiddigitalassignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        findViewById(R.id.textView7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(ProjectActivity.this);
                alertDialog.setTitle("Project Description").setMessage("Tourism Planner is an AWS-based web application which helps the user to get information about various tourism places nearby.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).show();
            }
        });
        findViewById(R.id.textView8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(ProjectActivity.this);
                alertDialog.setTitle("Project Description").setMessage("Predicting the safety of Airlines on the basis of past accidents data using Maching Learning Algorithms.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).show();
            }
        });
        findViewById(R.id.textView11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(ProjectActivity.this);
                alertDialog.setTitle("Project Description").setMessage("An automated attendance system is trained based on facial recognition data.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).show();
            }
        });
        findViewById(R.id.textView10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(ProjectActivity.this);
                alertDialog.setTitle("Project Description").setMessage("Voting Portal provides a medium for people to vote for desired political party and a person proctores them through webcam.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).show();
            }
        });
        findViewById(R.id.textView12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(ProjectActivity.this);
                alertDialog.setTitle("Project Description").setMessage("An umbrella with an in-built rain sensor and a manual switch. It will open automatically when the rain is detected.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setCancelable(false).show();
            }
        });
    }
}