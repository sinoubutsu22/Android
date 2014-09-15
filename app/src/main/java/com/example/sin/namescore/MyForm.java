package com.example.sin.namescore;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyForm extends Activity {

    public final static String EXTRA_MYNAME ="com.example.sin.namescore.MYNAME";

    //private Button m_button;
    //private MediaPlayer m_mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);

        /*
        m_button = (Button)findViewById(R.id.myButton);

        m_mediaPlayer = MediaPlayer.create(this,R.raw.results01);

        m_button.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v){
                m_mediaPlayer.start();
            }

        });
        */


    }
    public void getScore(View v) {
        EditText myEditText = (EditText) findViewById(R.id.myEditText);
        String myName = myEditText.getText().toString().trim();
        if (myName.equals("")) {
            //エラー表示
            myEditText.setError("Please Enter Your Name!");

        }else{
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_form, menu);
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
