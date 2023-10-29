package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class sump extends Activity 
{
	GridView gridView,gridvie;  
    TextView textView;  

    String[] B = {
		"RCC",
        "Reinforced brick wall"
    };
	String[] Bs ={
		"cortugated Roof"

	};

    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_sump);  
		//gridvie=(GridView) findViewById(R.id.gridVie);
        gridView = (GridView) findViewById(R.id.gridView);  
        textView = (TextView) findViewById(R.id.text);  

        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.grid, R.id.text, B);  
		//final ArrayAdapter a=new ArrayAdapter(this,R.layout.grid,R.id.text,Bs);
		final int ab[]={R.drawable.sumprcc,R.drawable.sumpbrick};

		customAdapter cs=new customAdapter(this,B,ab);

        gridView.setAdapter(cs);  
		//	gridvie.setAdapter(a);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
				@Override  
				public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  

					Intent i = null ;
					switch(position)
					{
						case 0:
							i =  new Intent(sump.this, rcc4.class);
							break;

						case 1:
							i=  new Intent(sump.this, rein.class);
							break;


					}
					startActivity(i);







				}  
			});  
    }
}
