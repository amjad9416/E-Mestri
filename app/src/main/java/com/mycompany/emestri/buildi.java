package com.mycompany.emestri;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class buildi extends Activity 
{
	GridView gridview,gridvie;  
    TextView textView;  

    String[] B = {
        "RCC Roof",
        "Tiled Roof"
		,"corrugated Roof"
    };
	//String[] Bs ={
		//"cortugated Roof"
//
	//};
	final int bs[]={R.drawable.rccroof,R.drawable.tiledroof,R.drawable.corrgated};

    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_buildi);  
		//gridvie=(GridView) findViewById(R.id.gridVie);
        gridview = (GridView) findViewById(R.id.gridView);  
        textView = (TextView)findViewById(R.id.text);  
////
        //final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.grid, R.id.text, B);  
		//final ArrayAdapter a=new ArrayAdapter(this,R.layout.grid,R.id.text,bs);
		customAdapter customAdapter = new customAdapter(this,B,bs);
		

        gridview.setAdapter(customAdapter);  
		//gridvie.setAdapter(customAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
				@Override  
				public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  

					Intent i = null ;
					switch(position)
					{
						case 0:
							i =  new Intent(buildi.this, next.class);
							break;

						case 1:
							i=  new Intent(buildi.this, next2.class);
							break;
						case 2:
							i=new Intent(buildi.this,next3.class);
							break;




					}
					startActivity(i);







				}  
			});  
    }
}
