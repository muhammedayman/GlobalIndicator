package com.example.globalindicator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseCreator extends SQLiteOpenHelper{
	private static String DB_PATH="/data/data/com.example.globalindicator/databases/";
	private static String DB_NAME="citycoode.sqlite";
	private static String DB_NAME2="fullcode.sqlite";
	private static int DB_VERSION=1;
	public static String DB_TABLE="tbcity2";
	private SQLiteDatabase mydatabase;
	private SQLiteDatabase mydatabase2;
	private final Context myContext;

	public DataBaseCreator(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		this.myContext=context;
		// TODO Auto-generated constructor stub
	}
	public void createDatabase() throws IOException{
		boolean dbExist=checkDatabase();
		if (dbExist){
		Log.i("tag", "dbExists"+dbExist);	
		}else{
			Log.i("tag", "dbnotExists"+dbExist);
			this.getReadableDatabase();
			copydatabase();
			copydatabase2();
		}
			
	}
	private void copydatabase2() throws IOException {
		InputStream myInput2=myContext.getAssets().open(DB_NAME2);
		String outFileName2=DB_PATH+DB_NAME2;
		OutputStream myOutput2=new FileOutputStream(outFileName2);
		byte[] buffer2=new byte[1024];
		int length2;
		while((length2=myInput2.read(buffer2))>0){
		myOutput2.write(buffer2,0,length2);	
		}
		myOutput2.flush();
		myOutput2.close();
		myInput2.close();
		
		
	}
	private boolean checkDatabase() {
		SQLiteDatabase checkDB=null;
		String myPath=DB_PATH+DB_NAME;
		try{
		checkDB=SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);}
		catch(SQLiteException e){
		}
		if(checkDB!=null){
			checkDB.close();
			
		}
		return checkDB!=null?true:false;
	}
	private void copydatabase() throws IOException {
		InputStream myInput=myContext.getAssets().open(DB_NAME);
		String outFileName=DB_PATH+DB_NAME;
		OutputStream myOutput=new FileOutputStream(outFileName);
		byte[] buffer=new byte[1024];
		int length;
		while((length=myInput.read(buffer))>0){
		myOutput.write(buffer,0,length);	
		}
		myOutput.flush();
		myOutput.close();
		myInput.close();
		
		
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	public void openDatabase() throws SQLiteException {
		String myPath=DB_PATH+DB_NAME;
		mydatabase=SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
		String myPath2=DB_PATH+DB_NAME2;
		mydatabase2=SQLiteDatabase.openDatabase(myPath2, null, SQLiteDatabase.OPEN_READONLY);
	}
}
