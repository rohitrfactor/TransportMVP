package com.pinnacle.garorasu.transportmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pinnacle.garorasu.transportmvp.Input.InputViewActionables;

public class MainActivity extends AppCompatActivity implements InputViewActionables {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void clickSource(View view) {
        // start ChooseSource Fragment
       // getSupportFragmentManager().beginTransaction().replace(R.id.container,).commit();
    }

    @Override
    public void clickDestination(View view) {
        // start ChooseDestination Fragment
        // getSupportFragmentManager().beginTransaction().replace(R.id.container,).commit();
    }

    @Override
    public void clickDate(View view) {
        // start ChooseDate Fragment
        // getSupportFragmentManager().beginTransaction().replace(R.id.container,).commit();
    }

    @Override
    public void clickSubmit(View view) {
        // start Result Fragment
        // getSupportFragmentManager().beginTransaction().replace(R.id.container,).commit();
    }
}
