package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Query extends Activity implements OnClickListener{
	Button button1,button2,button3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_query);
		button1=(Button)findViewById(R.id.button1);
		button2=(Button)findViewById(R.id.button2);
		button3=(Button)findViewById(R.id.button3);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.query, menu);
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
		case R.id.button1:
		{
			Intent callIntent=new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:"+5554));
			startActivity(callIntent);
				
			break;
		}

		case R.id.button2:
		{
			Intent sendIntent = new Intent(Intent.ACTION_VIEW);
		     sendIntent.putExtra("sms_body", ""); 
		     sendIntent.setType("vnd.android-dir/mms-sms");
		     startActivity(sendIntent);
		        break;
		
		}
		case R.id.button3:
		{
			Intent in=new Intent(this,Mail.class);
			startActivity(in);
		break;	
		}
		}
		
	}
}
