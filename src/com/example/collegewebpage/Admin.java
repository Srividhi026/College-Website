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
import android.widget.Toast;

public class Admin extends Activity implements OnClickListener {
	EditText t1,t2,i3;
	Button button1;
	Dataclass d;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin);
		t1=(EditText)findViewById(R.id.t1);
		t2=(EditText)findViewById(R.id.t2);
		i3=(EditText)findViewById(R.id.i3);
		button1=(Button)findViewById(R.id.button1);
		button1.setOnClickListener(this);
		d=new Dataclass(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admin, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		String k=t1.getText().toString();
		String r=t2.getText().toString();
		Long j=d.insertData(k,r);
		Toast.makeText(this,"Registered Successfully",Toast.LENGTH_LONG).show();
		Intent in=new Intent(this,Internalassesment.class);
		startActivity(in);
		// TODO Auto-generated method stub
		
	}
}
