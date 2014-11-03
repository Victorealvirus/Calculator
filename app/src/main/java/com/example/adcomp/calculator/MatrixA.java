package com.example.adcomp.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MatrixA extends Activity {


    public static float e1;
    public static float e2;
    public static float e3;
    public static float e4;
    public static float e5;
    public static float e6;
    public static float e7;
    public static float e8;
    public static float e9;
    boolean emptyString = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button goB = (Button) findViewById(R.id.gotoB);
        goB.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {



                getE1();
                getE2();
                getE3();
                getE4();
                getE5();
                getE6();
                getE7();
                getE8();
                getE9();

                if(emptyString == true)
                {
                    Toast t = Toast.makeText(getBaseContext() , "Please enter all values to continue!", Toast.LENGTH_LONG);
                    t.show();
                    emptyString = false;
                }
                else{
                    Intent matB = new Intent("com.example.adcomp.calculator.MATRIXB");
                    startActivity(matB);
                }

            }
        });

    }//oncreate ends

    private float getE1() {
        EditText temp = (EditText) findViewById(R.id.e1);
        String input = temp.getText().toString();

        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
            try {
                e1 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();
                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }

            return e1;
        }
    }



    private float getE2() {
        EditText temp = (EditText) findViewById(R.id.e2);
        String input = temp.getText().toString();

        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e2 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }

            return e2;

        }
    }


    private float getE3() {
        EditText temp = (EditText) findViewById(R.id.e3);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e3 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            return e3;
        }
    }

    private float getE4() {
        EditText temp = (EditText) findViewById(R.id.e4);
        String input = temp.getText().toString();
        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
        try{
            e4 = Float.parseFloat(input);
        }catch (Exception e){
            e.getStackTrace();

            Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
            t.show();
        }
        return e4;
        }
    }


    private float getE5() {
        EditText temp = (EditText) findViewById(R.id.e5);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e5 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            return e5;

        }
    }




    private float getE6() {
        EditText temp = (EditText) findViewById(R.id.e6);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e6 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            return e6;

        }
    }



    private float getE7() {
        EditText temp = (EditText) findViewById(R.id.e7);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e7 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            return e7;

        }
    }


    private float getE8() {
        EditText temp = (EditText) findViewById(R.id.e8);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e8 = Float.parseFloat(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
                t.show();
            }
            return e8;

        }
    }


    private float getE9() {
        EditText temp = (EditText) findViewById(R.id.e9);
        String input = temp.getText().toString();
        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
        try{
            e9 = Float.parsefloat(input);
        }catch (Exception e){
            e.getStackTrace();

            Toast t = Toast.makeText(this, "Please enter numbers only", Toast.LENGTH_SHORT);
            t.show();
        }
        return e9;

        }
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
