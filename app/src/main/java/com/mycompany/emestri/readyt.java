package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class readyt extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityreadyt);

		Float total,m,ru,capp;
		Float sa=Float.parseFloat(getIntent().getExtras().getString("name"));



		TextView rate,to,cap;
		
cap=(TextView) findViewById(R.id.cap1);
// capp=Float.parseFloat(cap.getText().toString());
m=800.0f*sa;
cap.setText(String.valueOf(m));

		Float cappp=Float.parseFloat(cap.getText().toString());
		to=(TextView) findViewById(R.id.total1);
		rate=(TextView) findViewById(R.id.rate);
		

		Float ru11=Float.parseFloat(rate.getText().toString());
		ru=cappp*ru11;
		to.setText(String.valueOf(ru));








    }

}
