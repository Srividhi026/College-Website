package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Registrationform extends Activity implements OnClickListener,OnCheckedChangeListener {
	EditText edit1,edit2,edit3,edit44;
	Button button1;
	RadioGroup rg11;
	String gender;
	Data d;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registrationform);
		edit1=(EditText)findViewById(R.id.edit1);
		edit2=(EditText)findViewById(R.id.edit2);
		edit3=(EditText)findViewById(R.id.edit3);
		edit44=(EditText)findViewById(R.id.edit44);
		button1=(Button)findViewById(R.id.butt1);
		rg11=(RadioGroup)findViewById(R.id.rg11);
		d=new Data(this);
		button1.setOnClickListener(this);
		rg11.setOnCheckedChangeListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registrationform, menu);
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
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		
		checkedId=rg11.getCheckedRadioButtonId();
		switch (checkedId) {
		case R.id.rg1:
		{
			gender="Male";
			break;
		}
		case R.id.rg2:
		{
			gender="Female";
			break;
		}

		
		}
		
	}

	@Override
	public void onClick(View v) {
		String e1=edit1.getText().toString();
		String e2=edit2.getText().toString();
		String e3=edit3.getText().toString();
		String e44=edit44.getText().toString();
		Long j=d.insertData(gender,e1, e2,e3,e44);
		Toast.makeText(this,"Registered Successfully",Toast.LENGTH_LONG).show();
		Intent in=new Intent(this,Homepage.class);
		startActivity(in);
				
		
	}
}
