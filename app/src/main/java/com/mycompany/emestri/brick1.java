package com.mycompany.emestri;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class brick1 extends Activity 
{
 	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
		TextView q1,q2,q3,q4,q5,r11,r1,r2,r3,r4,r5,tt1,t2,t3,t4,t5,t11,t19,t16,t6;

		Float ru11;

		Float sa;

		Float a,m,j,s,d,p,o,i,u,y,c,v,in,l,r,w,t,k,nl,n;
		Float  qu11,qu22,qu33,qu44,qu1111;
		Float qu1212,qu1313,qu1414,qu55;
		Float qu1,qu2,qu3,qu4,qu5,qu6,qu7,qu8,qu9,qu10,qu12,qu13,qu14,ru1,ru2,ru3,ru4,ru5,tu1,tu2,tu3,tu4,tu5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitybrick1);
		//	t=findViewById(R.id.text);







		q1=(TextView) findViewById(R.id.u1);
		q2=(TextView) findViewById(R.id.u2);
		q3=(TextView) findViewById(R.id.u3);
		q4=(TextView) findViewById(R.id.u4);
		q5=(TextView) findViewById(R.id.u5);


		r1=(TextView) findViewById(R.id.rr1);
		r2=(TextView) findViewById(R.id.rr2);
		r3=(TextView) findViewById(R.id.rr3);
		r4=(TextView) findViewById(R.id.rr4);
		r5=(TextView) findViewById(R.id.rr5);
		////r6=findViewById(R.id.rr6);
		//	r7=findViewById(R.id.rr7);
		//	r8=findViewById(R.id.rr8);
		//	r9=findViewById(R.id.rr9);
		////	r10=findViewById(R.id.rr10);
	//	r11=findViewById(R.id.rr11);
		//	r12=findViewById(R.id.rr12);
		//	r13=findViewById(R.id.rr13);

		//	r14=findViewById(R.id.rr14);






		tt1=(TextView) findViewById(R.id.t1);
		t2=(TextView) findViewById(R.id.t2);
		t3=(TextView) findViewById(R.id.t3);
		t4=(TextView) findViewById(R.id.t4);
		t5=(TextView) findViewById(R.id.t5);
		//	t6=findViewById(R.id.t6);
		////	t7=findViewById(R.id.t7);
		//	t8=findViewById(R.id.t8);
		//	t9=findViewById (R.id.t9);
		//	t10=findViewById(R.id.t10);
		//t11=findViewById(R.id.t11);
//		t12=findViewById(R.id.t12);
		//	t13=findViewById(R.id.t13);
		//	t14=findViewById(R.id.t14);
		t6=(TextView) findViewById(R.id.t6);
		//t19=findViewById(R.id.t19);



		ru1=Float.parseFloat(r1.getText().toString());
		ru2=Float.parseFloat(r2.getText().toString());
		ru3=Float.parseFloat(r3.getText().toString());
		ru4=Float.parseFloat(r4.getText().toString());
		ru5=Float.parseFloat(r5.getText().toString());

		//ru6=Float.parseFloat(r6.getText().toString());
		//	ru7=Float.parseFloat(r7.getText().toString());
		//	ru8=Float.parseFloat(r8.getText().toString());
		//	ru9=Float.parseFloat(r9.getText().toString());
		//ru10=Float.parseFloat(r10.getText().toString());
		//ru11=Float.parseFloat(r11.getText().toString());
		//	ru12=Float.parseFloat(r12.getText().toString());
		//	ru13=Float.parseFloat(r13.getText().toString());
		//	ru14=Float.parseFloat(r14.getText().toString());












		sa=Float.parseFloat(getIntent().getExtras().getString("name"));

		p=0.01f*sa;
		o=0.001634f*sa;
		i= 0.00256f*sa;
		u=0.01f*sa;
		y=258f*sa;



		q1.setText(String.valueOf(p));
		q2.setText(String.valueOf(o));
		q3.setText(String.valueOf(i));
		q4.setText(String.valueOf(u));
		//q5.setText(String.valueOf(y));


		qu1= Float.parseFloat(q1.getText().toString());
		qu2=Float.parseFloat(q2.getText().toString());
		qu3=Float.parseFloat(q3.getText().toString());
		qu4=Float.parseFloat(q4.getText().toString());

		//qu5=Float.parseFloat(q5.getText().toString());


//

		a=qu1*ru1;
		m=qu2*ru2;
		j=qu3*ru3;
		s=qu4*ru4;
		d=sa*ru5;


		//	c=sa*ru6;
		//	v=sa*ru7;
		//	in=sa*ru8;
		//	l=sa*ru9;
		//	r=sa*ru10;
		//w=sa*ru11;
		//	t=sa*ru12;
		//	k=sa*ru13;
		//	nl=sa*ru14;









		tt1.setText(String.valueOf(a));
		t2.setText(String.valueOf(m));
		t3.setText(String.valueOf(j));
		t4.setText(String.valueOf(s));

		t5.setText(String.valueOf(d));

		//	t6.setText(String.valueOf(c));
		//	t7.setText(String.valueOf(v));
		////	t8.setText(String.valueOf(in));
		//	t9.setText(String.valueOf(l));		
		//	t10.setText(String.valueOf(r));
	//	t11.setText(String.valueOf(w));
//		t12.setText(String.valueOf(t));
		////	t13.setText(String.valueOf(k));
		//	t14.setText(String.valueOf(nl));
//





		qu11= Float.parseFloat((tt1.getText().toString()));
		qu22= Float.parseFloat(t2.getText().toString());
		qu33= Float.parseFloat(t3.getText().toString());
		qu44= Float.parseFloat(t4.getText().toString());
		qu55= Float.parseFloat((t5.getText().toString()));
		////	qu66= Float.parseFloat(t6.getText().toString());
		//	qu77= Float.parseFloat((t7.getText().toString()));
		//	qu88= Float.parseFloat(t8.getText().toString());
		//	qu99= Float.parseFloat((t9.getText().toString()));
//		qu1010= Float.parseFloat(t10.getText().toString());
		//qu1111= Float.parseFloat(t11.getText().toString());
		//	qu1212= Float.parseFloat((t12.getText().toString()));
		//	qu1313= Float.parseFloat(t13.getText().toString());
		////	qu1414= Float.parseFloat(t14.getText().toString());


		Float total=qu11+qu22+qu33+qu44+qu55;

		//Float div=total/sa;


		t6.setText(String.valueOf(total));
		//	t19.setText(String.valueOf(div));














    }


}
