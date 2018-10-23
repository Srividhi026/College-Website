package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Homepage extends Activity implements OnClickListener {
	Button but1,but2,but3,but4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		Button but1=(Button)findViewById(R.id.but1);
		Button but2=(Button)findViewById(R.id.but2);
		Button but3=(Button)findViewById(R.id.but3);
		Button but4=(Button)findViewById(R.id.but4);
		but1.setOnClickListener(this);
		but2.setOnClickListener(this);
		but3.setOnClickListener(this);
		but4.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.homepage, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.bu1) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.but1:
		{
			Intent in=new Intent(this,Admin.class);
			startActivity(in);
			break;
		}
		case R.id.but2:
		{
			Intent i=new Intent(this,Examschedule.class);
			startActivity(i);
			break;
		}
		case R.id.but4:
		{
			Intent in=new Intent(this,Query.class);
			startActivity(in);
			break;
		}
		case R.id.but3:
		{
			Intent in=new Intent(this,Cultural.class);
			startActivity(in);
		}
		}
		
			
		
		//Intent in=new Intent(this,Internalassesment.class);
		//startActivity(in);
		// TODO Auto-generated method stub
		
	}
}
