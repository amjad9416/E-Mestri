package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.content.*;
import android.os.*;

public class splash extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
		
		try {
            this.getActionBar().hide();
        }
        // catch block to handle NullPointerException
        catch (NullPointerException e) {
        }
		
		
		new Handler().postDelayed(new Runnable(){
			
			@Override
			public void run()
			{
				startActivity(new Intent(splash.this,MainActivity.class));
				finish();
			}
			
			
			
		},2000);
		
		
		
    }
}
