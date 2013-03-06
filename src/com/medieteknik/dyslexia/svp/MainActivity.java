package com.medieteknik.dyslexia.svp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  
    int counter;
    String s = "Efter Hugo Chavez död är det två personer som pekas ut som mäktigast bland arvtagarna. Den ene en före detta busschaufför och fackföreningsman med stark vänsterideologisk profil. Den andre en pragmatisk och välbärgad ingenjör med ett förflutet inom militären.";
    final String[] words = s.split("\\s+");
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.text_box);
        counter = 0;
        tx.setText(words[counter]+" "+words[counter+1]+" "+words[counter+2]);
        
    Button b = (Button) findViewById(R.id.next_button);

    b.setOnClickListener(new OnClickListener() {
       @Override
       public void onClick(View v) {
    	   try{
    		   counter+=3;
    		   
    		   if(words[counter]!=null & words[counter+1]!=null & words[counter+2]!=null){
    			   tx.setText(words[counter]+" "+words[counter+1]+" "+words[counter+2]);
    		   }
    		   else if(words[counter]!=null & words[counter+1]!=null){
    			   tx.setText(words[counter]+" "+words[counter+1]);
    		   }
    		   else{
    			   tx.setText(words[counter]);
    		   }
    	   }
    	   catch( ArrayIndexOutOfBoundsException e){
    		   tx.setText("End of text =(");
    	   }
       }
    });
    
}}
