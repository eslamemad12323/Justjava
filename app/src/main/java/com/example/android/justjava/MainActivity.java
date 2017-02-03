package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu., menu);
        return true;}



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quntity = 0;
    private void disquntity(String message){
        TextView priceTextView =(TextView)findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
    public void decrement(View view){
        quntity = quntity-1;
        display(quntity);
    }
    public void increment(View view){
        quntity = quntity + 1 ;
        display(quntity);




    }








    public void submitOrder(View view){

        String v = "NAME:ESLAM EMAD";
        String l = "add whipped cream ?" ;
        String S = v + "\nQUANTIT: " +quntity;
        String N =S + "\ntotal$" + quntity *5;
        display(quntity);
        CheckBox whippedcreamcheckbox = (CheckBox) findViewById(R.id.wipped_cream_checkbox);
        boolean hsswippedCreamCheckbox =whippedcreamcheckbox.isChecked();




    }



    private void display(int number){

        TextView quantityTextView = (TextView)findViewById(R.id.order_summary_text_view);
        quantityTextView.setText("" + number);

    }
    private void displayordersummary(int number){
        TextView priceTextview = (TextView)findViewById(R.id.order_summary_text_view);
        priceTextview.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}
