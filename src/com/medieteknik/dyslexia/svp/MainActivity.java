package com.medieteknik.dyslexia.svp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  
    int counter;
    String s = "Iphone swag fanny pack, try-hard master cleanse pop-up elit deserunt vinyl. Odio mustache hoodie YOLO fap. Vegan godard labore tempor. Farm-to-table aute craft beer, YOLO bicycle rights artisan semiotics. Cosby sweater readymade eiusmod consectetur fap stumptown. Cliche keytar accusamus blue bottle, wayfarers locavore selfies elit aliqua chillwave lo-fi helvetica enim. Irony tofu blog, fap pickled pariatur odio wolf cliche vice sint pitchfork eiusmod cosby sweater polaroid.";
    final String[] words = s.split("\\s+");
    Button b = (Button) findViewById(R.id.next_button);
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.text_box);
        counter = 0;
        tx.setText(words[counter]);
        
    b.setOnClickListener(new OnClickListener() {
       @Override
       public void onClick(View v) {
           counter++;
           tx.setText(words[counter]);
       }
    });
    
}}
