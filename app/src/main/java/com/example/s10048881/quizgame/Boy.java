package com.example.s10048881.quizgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Boy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy);
    }

    static String tag = "com.example.jchuah.myapplication.Boy";

    public void onBoyMaleClick (View source) {
        Log.i(tag, "Males FTW!");
        Intent BoyMaleIntent = new Intent(this, BoyMale.class);
        startActivity(BoyMaleIntent);
    }

    public void onBoyFemaleClick (View source) {
        Log.i(tag, "Females BOO!");
        Intent BoyFemaleClick = new Intent(this, BoyFemale.class);
        startActivity(BoyFemaleClick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boy, menu);
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
