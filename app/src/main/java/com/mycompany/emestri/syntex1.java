package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class syntex1 extends Activity 
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysyntex1);

		Float total,m,ru,ru1;
		Float sa=Float.parseFloat(getIntent().getExtras().getString("name"));

Float add,add1,add2;

		TextView rate,to,rate1,to1,to2;


		to=(TextView) findViewById(R.id.to);
		rate=(TextView) findViewById(R.id.rate);
		rate1=(TextView) findViewById(R.id.rate1);
		to1=(TextView) findViewById(R.id.to1);
		to2=(TextView) findViewById(R.id.to2);

		Float ru11=Float.parseFloat(rate.getText().toString());
		Float ru22=Float.parseFloat(rate1.getText().toString());
		ru=sa*ru11;
		ru1=sa*ru22;
		
		
		to.setText(String.valueOf(ru));
		to1.setText(String.valueOf(ru1));
		add1=Float.parseFloat(to.getText().toString());
		add2=Float.parseFloat(to1.getText().toString());
		add=add1+add2;
		to2.setText(String.valueOf(add));
		
		








    }

}
