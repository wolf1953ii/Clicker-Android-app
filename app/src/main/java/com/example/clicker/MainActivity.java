package com.example.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    long click;
    String key = "CLICK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        ++click;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.format("%s", click));
    }

    public void onClickReset(View view)
    {
        click =0;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.format("%s", click));
    }

    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putLong(key,click);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        click = savedInstanceState.getLong(key);

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(String.format("%s", click));
    }
}
