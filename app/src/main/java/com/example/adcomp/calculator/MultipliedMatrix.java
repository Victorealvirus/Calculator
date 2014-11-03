package com.example.adcomp.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MultipliedMatrix extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplied_matrix);


        EditText e1 = (EditText) findViewById(R.id.e1);
        int s = MatrixA.e1*MatrixB.e1 + MatrixA.e2*MatrixB.e4 + MatrixA.e3*MatrixB.e7;
        String sq = Integer.toString(s);
        e1.setText(sq, TextView.BufferType.EDITABLE);

        EditText e2 = (EditText) findViewById(R.id.e2);
        s = MatrixA.e1*MatrixB.e2 + MatrixA.e2*MatrixB.e5 + MatrixA.e3*MatrixB.e8;
        sq = Integer.toString(s);
        e2.setText(sq, TextView.BufferType.EDITABLE);

        EditText e3 = (EditText) findViewById(R.id.e3);
        s = MatrixA.e1*MatrixB.e3 + MatrixA.e2*MatrixB.e6 + MatrixA.e3*MatrixB.e9;
        sq = Integer.toString(s);
        e3.setText(sq, TextView.BufferType.EDITABLE);

        EditText e4 = (EditText) findViewById(R.id.e4);
        s = MatrixA.e4*MatrixB.e1 + MatrixA.e5*MatrixB.e4 + MatrixA.e6*MatrixB.e7;
        sq = Integer.toString(s);
        e4.setText(sq, TextView.BufferType.EDITABLE);

        EditText e5 = (EditText) findViewById(R.id.e5);
        s = MatrixA.e4*MatrixB.e2 + MatrixA.e5*MatrixB.e5 + MatrixA.e6*MatrixB.e8;
        sq = Integer.toString(s);
        e5.setText(sq, TextView.BufferType.EDITABLE);

        EditText e6 = (EditText) findViewById(R.id.e6);
        s = MatrixA.e4*MatrixB.e3 + MatrixA.e5*MatrixB.e6 + MatrixA.e6*MatrixB.e9;
        sq = Integer.toString(s);
        e6.setText(sq, TextView.BufferType.EDITABLE);

        EditText e7 = (EditText) findViewById(R.id.e7);
        s = MatrixA.e7*MatrixB.e1 + MatrixA.e8*MatrixB.e4 + MatrixA.e9*MatrixB.e7;
        sq = Integer.toString(s);
        e7.setText(sq, TextView.BufferType.EDITABLE);

        EditText e8 = (EditText) findViewById(R.id.e8);
        s = MatrixA.e7*MatrixB.e2 + MatrixA.e8*MatrixB.e5 + MatrixA.e9*MatrixB.e8;
        sq = Integer.toString(s);
        e8.setText(sq, TextView.BufferType.EDITABLE);

        EditText e9 = (EditText) findViewById(R.id.e9);
        s = MatrixA.e7*MatrixB.e3 + MatrixA.e8*MatrixB.e6 + MatrixA.e9*MatrixB.e9;
        sq = Integer.toString(s);
        e9.setText(sq, TextView.BufferType.EDITABLE);

    }//oncreate ends


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multiplied_matrix, menu);
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
