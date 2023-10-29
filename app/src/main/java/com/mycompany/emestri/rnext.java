package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class rnext extends Activity 
{
	Button a;
	EditText b;
	String s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityrnext);
		a=(Button) findViewById(R.id.ok1);
		b=(EditText) findViewById(R.id.et1);

		a.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b.length()==0)
					{
						Toast.makeText(rnext.this,"Filed Should not be empty",Toast.LENGTH_SHORT).show();


					}
					else if((Integer.parseInt(b.getText().toString()))>=5)
					{

						Intent i=new Intent(rnext.this,r1.class);
						s=b.getText().toString();
						i.putExtra("name",s);
						startActivity(i);

					}
					else{

						Toast.makeText(rnext.this,"minimum area is 5",Toast.LENGTH_SHORT).show();

					}
				}
			});









    }
}

