package com.example.adcomp.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MatrixB extends Activity {

    public static int e1;
    public static int e2;
    public static int e4;
    public static int e5;
    public static int e6;
    public static int e7;
    public static int e8;
    public static int e9;
    boolean emptyString = false;

    private int getE1() {
        EditText temp = (EditText) findViewById(R.id.e1);
        String input = temp.getText().toString();

        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
            try {
                e1 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();
                Toast t = Toast.makeText(this, "Please enter only integers", Toast.LENGTH_SHORT);
                t.show();
            }

            return e1;
        }
    }



    private int getE2() {
        EditText temp = (EditText) findViewById(R.id.e2);
        String input = temp.getText().toString();

        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e1 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }

            return e2;

        }
    }


    private int getE3() {
        EditText temp = (EditText) findViewById(R.id.e3);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e3 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e3;
        }
    }

    public static int e3;

    private int getE4() {
        EditText temp = (EditText) findViewById(R.id.e4);
        String input = temp.getText().toString();
        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
            try{
                e4 = Integer.parseInt(input);
            }catch (Exception e){
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e4;
        }
    }


    private int getE5() {
        EditText temp = (EditText) findViewById(R.id.e5);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e5 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e5;

        }
    }




    private int getE6() {
        EditText temp = (EditText) findViewById(R.id.e6);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e6 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e6;

        }
    }



    private int getE7() {
        EditText temp = (EditText) findViewById(R.id.e7);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e7 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e7;

        }
    }


    private int getE8() {
        EditText temp = (EditText) findViewById(R.id.e8);
        String input = temp.getText().toString();
        if (input.isEmpty()) {
            emptyString = true;
            return 0;
        } else {
            try {
                e8 = Integer.parseInt(input);
            } catch (Exception e) {
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e8;

        }
    }


    private int getE9() {
        EditText temp = (EditText) findViewById(R.id.e9);
        String input = temp.getText().toString();
        if (input.isEmpty()){
            emptyString = true;
            return 0;
        }
        else
        {
            try{
                e9 = Integer.parseInt(input);
            }catch (Exception e){
                e.getStackTrace();

                Toast t = Toast.makeText(this, "Please enter an integer", Toast.LENGTH_SHORT);
                t.show();
            }
            return e9;

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_b);

//        EditText abc = (EditText) findViewById(R.id.e1);

  //      abc.setText(Integer.toString(MainScreen.e1));

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
 //           Intent matB = new Intent("com.example.adcomp.calculator.MATRIXB");
 //           startActivity(matB);
        }


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.matrix_b, menu);
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
