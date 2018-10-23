package com.example.collegewebpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Dataclass extends SQLiteOpenHelper {
private String TABLE_NAME="log";
	
	private static final String DATABASE_NAME="reg.db";
	private static final int DATABASE_VERSION=2;
	private String CREATE_TABLE="CREATE TABLE "+ TABLE_NAME +"(name VARCHAR(20),registerno VARCHAR(20))";


	public Dataclass(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE "+DATABASE_NAME);
		
		}
		public long insertData(String name,String registerno)
		{
			SQLiteDatabase db=getWritableDatabase();
			ContentValues con=new ContentValues();
			con.put("name",name);
			con.put("registerno",registerno);
			return db.insert(TABLE_NAME, null,con);
		}
		public boolean select(String name,String registerno)
		{
			SQLiteDatabase r=getReadableDatabase();
			Cursor c=null;
			c=r.rawQuery("select * from "+TABLE_NAME, null);
			if(c.moveToFirst())
			{
				do{
				if(c.getString(1).equals(name)&&c.getString(2).equals(registerno))
				{
					return true;
				}
				}while(c.moveToNext());
			}
			return false;
		}

	

		// TODO Auto-generated method stub
		
	}


