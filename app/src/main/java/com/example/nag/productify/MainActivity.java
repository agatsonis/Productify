package com.example.nag.productify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button assign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        assign = (Button) findViewById(R.id.makeAssignBut);

    }

    public void assignNew (View view)
    {
        Intent assign = new Intent(MainActivity.this, Assignment.class);
        startActivity(assign);
    }



}
