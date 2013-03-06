package com.medieteknik.dyslexia.svp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  
    int counter;
    String s = "efter Hugo Chavez d�d �r det tv� personer som pekas ut som m�ktigast bland arvtagarna. Den ene en f�re detta busschauff�r och fackf�reningsman med stark v�nsterideologisk profil. Den andre en pragmatisk och v�lb�rgad ingenj�r med ett f�rflutet inom milit�ren.";
    final String[] words = s.split("\\s+");
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.text_box);
        counter = 0;
        tx.setText(words[counter]);
        
    Button b = (Button) findViewById(R.id.next_button);

    b.setOnClickListener(new OnClickListener() {
       @Override
       public void onClick(View v) {
    	   try{
    		   counter++;
               tx.setText(words[counter]);   
    	   }
    	   catch( ArrayIndexOutOfBoundsException e){
    		   tx.setText("End of text =(");
    	   }
       }
    });
    
}}
