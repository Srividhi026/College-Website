package com.example.collegewebpage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
//import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

public class Image extends BaseAdapter {
	Context con;
 Integer[] imid= {
			R.drawable.ping,R.drawable.jing,R.drawable.dow,R.drawable.full,R.drawable.i,R.drawable.sssr};
	
	
	public Image (Context mtc) 
	
	{
		this.con=mtc;
		
	
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imid.length;
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
		ImageView iv=null;
		if(convertView==null)
		{
	 iv=new ImageView(con);	
		
		iv.setImageResource(imid[position]);
		iv.setLayoutParams(new GridView.LayoutParams(200,200));
		iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
		iv.setPadding(20,18,18,20);
		}
		else
		{
			iv=(ImageView)convertView;
		}
		iv.setImageResource(imid[position]);
	
	
		return iv;
	}

}
