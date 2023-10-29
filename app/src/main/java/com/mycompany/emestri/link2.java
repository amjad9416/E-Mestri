package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class link2 extends Activity 
{
	Button a;
	EditText b;
	String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link2);
		a=(Button) findViewById(R.id.ok1);
		b=(EditText) findViewById(R.id.et1);

		a.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b.length()==0)
					{
						Toast.makeText(link2.this,"Filed Should not be empty",Toast.LENGTH_SHORT).show();


					}
					else if((Integer.parseInt(b.getText().toString()))>=500)
					{

						Intent i=new Intent(link2.this,ra.class);
						s=b.getText().toString();
						i.putExtra("name",s);
						startActivity(i);

					}
					else{

						Toast.makeText(link2.this,"minimum area is 500",Toast.LENGTH_SHORT).show();

					}
				}
			});









    }
}
        
