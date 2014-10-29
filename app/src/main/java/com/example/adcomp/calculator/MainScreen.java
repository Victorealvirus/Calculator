package com.example.adcomp.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainScreen extends Activity {

    public int getE1() {
        EditText temp = (EditText) findViewById(R.id.e1);
         String input = temp.getText().toString();


        try{
            e1 = Integer.parseInt(input);
        }catch (Exception e){
            e.getStackTrace();
            Log.d("Error", "Something went wrong");
        }

        return e1;
    }

    public static int e1,e2,e3,e4,e5,e6,e7,e8,e9;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button goB = (Button) findViewById(R.id.gotoB);
        goB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                getE1();
                Intent matB = new Intent("com.example.adcomp.calculator.MATRIXB");
                startActivity(matB);

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
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
