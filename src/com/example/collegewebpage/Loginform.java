package com.example.collegewebpage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Loginform extends  Activity implements android.view.View.OnClickListener,OnItemSelectedListener {
	EditText ed1,ed2;
	Button b1,b2;
	//Spinner sp1;
	//String r[]={"Selet Your Department","B.E(cse)","B.E(ece)","B.E(eee)","B.Tech(it)"};
	Data d;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginform);
		
		ed1=(EditText)findViewById(R.id.edi1);
		ed2=(EditText)findViewById(R.id.e22);
		b1=(Button)findViewById(R.id.B1);
		b2=(Button)findViewById(R.id.b2);
		d=new Data(this);
		//sp1=(Spinner)findViewById(R.id.spinner3);
		//ArrayAdapter<String> r1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,r);
		//sp1.setAdapter(r1);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.loginform, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.bu1) {
			Toast.makeText(this,"hai", Toast.LENGTH_LONG).show();

			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
	
		
	}

	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.B1:
		{
			String j=ed1.getText().toString();
			String g=ed2.getText().toString();
			boolean val=d.select(j, g);
			if((j.length()!=0)&&(g.length()!=0)&&(val))
			{
				
			Toast.makeText(this,"login sucessfully", Toast.LENGTH_LONG).show();
			ed1.setText(" ");
			ed2.setText(" ");
			Intent in=new Intent(this,Homepage.class);
			startActivity(in);
			}
			else
			{
				Toast.makeText(this,"Please REGISTER", Toast.LENGTH_LONG).show();	
			}
			
			}
			break;
			case R.id.b2:
			{
			Toast.makeText(this,"WELCOME", Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,Registrationform.class);
			startActivity(in);
			}
		}
	}
}
	
	
	
		
	

