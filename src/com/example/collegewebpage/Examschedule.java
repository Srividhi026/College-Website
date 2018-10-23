package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Examschedule extends Activity implements OnItemSelectedListener,OnClickListener{
	Spinner spinner1,spinner2;
	Button button1;

	String s[]={"select your year","1st year","2nd year","pre_final year","final year"};
	String r[]={"UG","PG"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_examschedule);
		Spinner spinner1=(Spinner)findViewById(R.id.spinner3);
		ArrayAdapter<String>r1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,s);
		//Spinner spinner2=(Spinner)findViewById(R.id.spinner2);
		//ArrayAdapter<String>r2=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,r);
		spinner1.setAdapter(r1);
		//spinner2.setAdapter(r2);
		spinner1.setOnItemSelectedListener(this);
		//spinner2.setOnItemSelectedListener(this);
		Button button1=(Button)findViewById(R.id.b2);
		button1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.examschedule, menu);
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
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		switch (arg2) {
		case 1:
		{
			String value="1st Year";
			Intent  sas=new Intent(this,Firstyear.class);
			sas.putExtra("Value", value);
			startActivity(sas);
			
			break;
		}
		case 2:
		{
			String value="2nd Year";
			Intent  sas=new Intent(this,Secondyear.class);
			sas.putExtra("Value", value);
			startActivity(sas);
			break;
		}
		case 3:
		{
			String value="3rd Year";
			Intent  sas=new Intent(this,Thirdyear.class);
			sas.putExtra("Value", value);
			startActivity(sas);
			break;
		}
		case 4:
		{
			String value="4th Year";
			Intent  sas=new Intent(this,Fourthyear.class);
			sas.putExtra("Value", value);
			startActivity(sas);
			break;
		}
			
		}
	}
	

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		Intent r=new Intent(this,Loginform.class);
		startActivity(r);
		Toast.makeText(this,"thank you", Toast.LENGTH_LONG).show();
		
	}
}
