package com.mycompany.emestri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends BaseAdapter{
	private Context mContext;
	private final String[] B;
	private final int[] ab;

	public customAdapter(Context c,String[] B,int[] ab ) {
		mContext = c;
		this.ab = ab;
		this.B =B;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return B.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View grid;
		LayoutInflater inflater = (LayoutInflater) mContext
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		if (convertView == null) {

			grid = new View(mContext);
			grid = inflater.inflate(R.layout.grid, null);
			TextView textView =(TextView) grid.findViewById(R.id.text);
			ImageView imageView = (ImageView)grid.findViewById(R.id.image);
			textView.setText(B[position]);
			imageView.setImageResource(ab[position]);
		} else {
			grid =  convertView;
		}

		return grid;
	}
}
