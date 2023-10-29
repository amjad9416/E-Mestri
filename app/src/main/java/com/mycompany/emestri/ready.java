package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.content.*;
import android.view.*;

public class ready extends Activity 
{
	Button a;
	EditText b;
	String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityready);
		a=(Button) findViewById(R.id.ok1);
		b=(EditText) findViewById(R.id.et1);

		a.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b.length()==0)
					{
						Toast.makeText(ready.this,"Filed Should not be empty",Toast.LENGTH_SHORT).show();


					}
					
					else if((Integer.parseInt(b.getText().toString()))>=5)
					{

						Intent i=new Intent(ready.this,readyt.class);
						s=b.getText().toString();
						i.putExtra("name",s);
						startActivity(i);

					}
					else{

						Toast.makeText(ready.this,"minimum area is 5",Toast.LENGTH_SHORT).show();

					}
				}
			});









    }
}

