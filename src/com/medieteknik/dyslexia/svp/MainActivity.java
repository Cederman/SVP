package com.medieteknik.dyslexia.svp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b = (Button) findViewById(R.id.nav_button);
        
        b.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
				
        	}
        });
    }
}
