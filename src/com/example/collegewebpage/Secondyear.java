package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Secondyear extends Activity implements OnItemClickListener{
	ListView lv2;
	String r[]={"B.E(ece)","B.E(cse)","B.E(eee)","B.E(civil)","B.Tech(it)"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondyear);
		 lv2=(ListView)findViewById(R.id.lv2);
		
		ArrayAdapter<String> ra=new ArrayAdapter<>(this, R.layout.mylist,r);
		lv2.setAdapter(ra);
		lv2.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondyear, menu);
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
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		switch (arg2) {
		case 0:
		{
			Toast.makeText(this,"B.E(ECE)",Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,Ece.class);
			startActivity(in);
		}
			
			break;

		case 1:
		{
			Toast.makeText(this,"B.E(csc)",Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,Cse.class);
			startActivity(in);
		}
			break;
		case 2:
		{
			Toast.makeText(this,"B.E(eee)",Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,Eee.class);
			startActivity(in);
		}
			break;
		case 3:
		{
			Toast.makeText(this,"B.E(civil)",Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,Civil.class);
			startActivity(in);
		}
			break;
		case 4:
		{
			Toast.makeText(this,"B.Tech(it)",Toast.LENGTH_LONG).show();
			Intent in=new Intent(this,It.class);
			startActivity(in);
		}
			break;
		}
		// TODO Auto-generated method stub
		
	}
}
