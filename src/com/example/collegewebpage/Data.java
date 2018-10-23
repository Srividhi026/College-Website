package com.example.collegewebpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Data extends SQLiteOpenHelper{
	private String TABLE_NAME="login";
	
	private static final String DATABASE_NAME="register.db";
	private static final int DATABASE_VERSION=2;
	private String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"(Gender varchar(8),Pname VARCHAR(20),fname VARCHAR(20),address VARCHAR(20),phoneno VARCHAR(20))";

	public Data(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE "+DATABASE_NAME);
		
	}
	public long insertData(String ge,String pname,String fna,String add,String phno)
	{
		SQLiteDatabase db=getWritableDatabase();
		ContentValues con=new ContentValues();
		con.put("Gender",ge);
		con.put("Pname",pname);
		con.put("fname",fna);
		con.put("address",add);
		con.put("phoneno",phno);
		return db.insert(TABLE_NAME, null,con);
	}
	public boolean select(String name,String phn)
	{
		SQLiteDatabase r=getReadableDatabase();
		Cursor c=null;
		c=r.rawQuery("select * from "+TABLE_NAME, null);
		if(c.moveToFirst())
		{
			do{
			if(c.getString(1).equals(name)&&c.getString(4).equals(phn))
			{
				return true;
			}
			}while(c.moveToNext());
		}
		return false;
	}

}
