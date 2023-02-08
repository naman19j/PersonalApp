package com.example.androiddigitalassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CourseActivity extends AppCompatActivity {

    ListView simpleListView;

    // array objects
    String courseList[] = {"CHY1701\tEngineering Chemistry\t\t\n"    ,
            "CSE1001\tProblem Solving and Programming\t\n"    ,
            "EEE1019\tFoundations of Electrical and Electronics Engineering\t\t\n"    ,
            "HUM1021\tEthics and Values\t \t\t\n"    ,
            "HUM1022\tPsychology in Everyday Life\t\n"    ,
            "MAT1011\tCalculus for Engineers\t\n"    ,
            "STS1021\tIntroduction to Soft Skills\t\n"    ,
            "CHY1002\tEnvironmental Sciences\n"    ,
            "CSE1002\tProblem Solving and Object Oriented Programming\t\n"    ,
            "ENG1902\tTechnical English - II\t\n"    ,
            "GER1001\tGrundstufe Deutsch\t\n"    ,
            "MAT2002\tApplications of Differential and Difference Equations\t\n"    ,
            "PHY1701\tEngineering Physics\t\n"    ,
            "STS1022\tIntroduction to Personal Skills\t\n"    ,
            "SWE1701\tSoftware Engineering\t\n"    ,
            "SWE2001\tData Structures and Algorithms\t\n"    ,
            "MAT1016\tApplied Discrete Mathematical Structures\t\n"    ,
            "MGT1047\tSocial Marketing\t\n"    ,
            "PHY1901\tIntroduction to Innovative Projects\t\n"    ,
            "STS2021\tFundamentals of Aptitude\t\n"    ,
            "SWE1003\tDigital Logic and Microprocessor\t\n"    ,
            "SWE1004\tDatabase Management Systems\t\n"    ,
            "SWE1007\tProgramming in Java\t\n"    ,
            "SWE2004\tSoftware Architecture and Design\t\n"    ,
            "EXC1208\tGame Development Club\t\n"    ,
            "MAT2001\tStatistics for Engineers\t\n"    ,
            "MGT1022\tLean Start-up Management\t\n"    ,
            "STS2022\tArithmetic Problem Solving\t\n"    ,
            "SWE1005\tComputer Architecture and Organization\t\n"    ,
            "SWE1006\tTheory of Computation\t\n"    ,
            "SWE1013\tMultimedia Systems\t\n"    ,
            "SWE2003\tRequirements Engineering and Management\t\n"    ,
            "SWE2005\tSoftware Testing\t\n"    ,
            "SWE2009\tData Mining Techniques\t\n"    ,
            "HUM1045\tIntroduction to Psychology\t\n"    ,
            "STS3021\tReasoning Skill Enhancement\t\n"    ,
            "SWE1008\tWeb Technologies\t\n"    ,
            "SWE1012\tE-Governance\t\n"    ,
            "SWE2002\tComputer Networks\t\n"    ,
            "SWE2007\tSoftware Construction and Maintenance\t\n"    ,
            "SWE2013\tAdvanced Java Programming\t\n"    ,
            "SWE3001\tOperating Systems\t\n"    ,
            "MGT1021\tDigital and Social Media Marketing\t\n"    ,
            "STS3022\tEnhancing Problem Solving Skills\t\n"    ,
            "SWE2006\tSoftware Project Management\t\n"    ,
            "SWE2011\tBig Data Analytics\t\n"    ,
            "SWE2032\tKnowledge Engineering\t\n"    ,
            "SWE2034\tRuby Programming\t\n"    ,
            "SWE3002\tInformation and System Security\t\n"    ,
            "SWE4002\tCloud Computing\t\n"    ,
            "CSE3505\tFoundations of Data Analytics\t\n"    ,
            "STS4021\tPreparedness for External Opportunities\t\n"    ,
            "SWE1901\tTechnical Answers for Real World Problems (TARP)\t\n"    ,
            "SWE2016\tSemantic Web Technologies\t\n"    ,
            "SWE2027\tKnowledge Management System\t\n"    ,
            "SWE4010\tArtificial Intelligence\t\n"    ,
            "SWE4012\tMachine Learning"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
            simpleListView = (ListView) findViewById(R.id.simpleListView);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                    R.layout.item_view, R.id.itemTextView, courseList);
            simpleListView.setAdapter(arrayAdapter);
        }

    }