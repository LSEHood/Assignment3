package com.example.laressahood.ass3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGreat(View view) {
        Toast.makeText(this, "My day was great!",
                Toast.LENGTH_LONG).show();
    }

    public void onGood(View view) {
        Toast.makeText(this, "My day was good.",
                Toast.LENGTH_LONG).show();
    }

    //low distress
    public void onMeh(View view) {
        Toast.makeText(this, "My day was okay.",
                Toast.LENGTH_LONG).show();
    }

    //moderate distress
    public void onWorse(View view) {
        Toast.makeText(this, "My day wasn't good.",
                Toast.LENGTH_LONG).show();
    }

    //high distress
    public void onWorst(View view) {
        Toast.makeText(this, "My day was the worst!",
                Toast.LENGTH_LONG).show();
    }

    public void onSkillsList(View view) {
        Toast.makeText(this, "These are my skills!",
                Toast.LENGTH_LONG).show();
    }
}

