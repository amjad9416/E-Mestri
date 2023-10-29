package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class next2 extends Activity 
{
	GridView gridView;  
    TextView textView;  
    String[] B = {
        "Residential Building",
        "Office Building",
        "Schoola and collages"
        ,"Industrial sheds"
    };
	final int[] ab={R.drawable.tiledresidential,R.drawable.tiledroofoffice,R.drawable.tiledschool,R.drawable.tiledroofindustrial};



    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_next);  

        gridView = (GridView) findViewById(R.id.gridView);  
        textView = (TextView) findViewById(R.id.text);  

		// final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.grid, R.id.text, B);
		customAdapter customAdapter = new customAdapter(this,B,ab);



        gridView.setAdapter(customAdapter);  

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
				@Override  
				public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  

					Intent i = null ;
					switch(position)
					{
						case 0:
							i =  new Intent(next2.this,li.class);
							break;

						case 1:
							i=  new Intent(next2.this,li2.class);
							break;

						case 2:
							i =  new Intent(next2.this, li3.class);
							break;


						case 3:

							i =  new Intent(next2.this, li4.class);
							break;






					}
					startActivity(i);







				}  
			}); 
	}





}
