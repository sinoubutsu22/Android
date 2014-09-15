package com.example.sin.namescore;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class MyResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MyForm.EXTRA_MYNAME);
        TextView myLabel = (TextView) findViewById(R.id.myLabel);
        myLabel.setText(myName + "の点数は...");
        myLabel.setTextColor(Color.BLACK);

        Random randomGenerator = new Random();
        int score =randomGenerator.nextInt(101);
        String result = Integer.toString(score);
        TextView myResult = (TextView)findViewById(R.id.myResult);
        myResult.setText(result +"点" );
        myResult.setTextColor(Color.RED);









    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
