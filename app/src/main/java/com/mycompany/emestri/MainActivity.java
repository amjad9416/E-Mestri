package com.mycompany.emestri;


import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.graphics.drawable.*;

public class MainActivity extends Activity {  
    GridView gridview;  
    TextView textView;  
    String[] B = {
        "Building",
        "Compound wall",
		"Overhead Tank",
        "sump",
        "Septic tank"
    };
	final int[] ab={R.drawable.buildingmat,R.drawable.compound,R.drawable.overhead,R.drawable.sump250x250,R.drawable.septictank};



    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);  
		gridview=(GridView) findViewById(R.id.gridView);

        //gridview = findViewById(R.id.gridView); 
        textView = (TextView) findViewById(R.id.text);  

		// final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.grid, R.id.text, B);
		customAdapter customAdapter = new customAdapter(this,B,ab);


        gridview.setAdapter(customAdapter);  

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
				@Override  
				public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  

					Intent i = null ;
					switch(position)
					{
						case 0:
							i =  new Intent(MainActivity.this, buildi.class);
							break;

						case 1:
							i=  new Intent(MainActivity.this, compound.class);
							break;

						case 2:
							i =  new Intent(MainActivity.this, overhead.class);
							break;

						case 3:
							i =  new Intent(MainActivity.this, sump.class);
							break;

						case 4:
							i =  new Intent(MainActivity.this, septic.class);
							break;

						case 5:
							i =  new Intent(MainActivity.this, material.class);
							break;

					}
					startActivity(i);







				}  
			}); 
	}





}
