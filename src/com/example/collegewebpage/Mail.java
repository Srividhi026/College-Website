package com.example.collegewebpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Mail extends Activity implements OnClickListener{
	EditText edi1,edi2,edi3;
	Button bu1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mail);
		edi1=(EditText)findViewById(R.id.edi1);
		edi2=(EditText)findViewById(R.id.edi2);
		edi3=(EditText)findViewById(R.id.edi3);
		bu1=(Button)findViewById(R.id.bu1);
		bu1.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mail, menu);
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
        String to=edi1.getText().toString();
        String subject=edi2.getText().toString();
        String message=edi3.getText().toString();
        Intent email=new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        email.putExtra(Intent.EXTRA_SUBJECT,subject);
        email.putExtra(Intent.EXTRA_TEXT,message);
        Log.i("Status Report","Status");
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email,"Choose an email client"));

		
	}
}
