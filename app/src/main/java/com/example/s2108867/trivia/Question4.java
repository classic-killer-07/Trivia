package com.example.s2108867.trivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Question4 extends AppCompatActivity {
    static String tag="com.example.jchuah.myapplication.MainActivity";

    public void onNextClick(View source) {
        Log.i(tag, "Launching");
        Intent Question5Intent = new Intent(this, Question5.class);
        startActivity(Question5Intent);
    }
    public void onWrongClick(View source) {
        Log.i(tag, "Launching");
        Intent FailIntent = new Intent(this, FailScreen.class);
        startActivity(FailIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
