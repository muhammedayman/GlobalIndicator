package com.example.globalindicator;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class SplashActivity extends ActionBarActivity {
	String value;
	String update="01";
	TextView text;
	Boolean mustupdate=false;
	private static String DB_PATH_NAME="data/data/com.example.globalindicator/citycoode.sqlite";
	private static String DB_PATH_NAME2="data/data/com.example.globalindicator/fullcode.sqlite";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		text = (TextView) findViewById(R.id.textView8);
	Typeface tf = Typeface.createFromAsset(getAssets(), "akbaracademy.ttf");
		
		text.setTypeface(tf);
		makethefile();
		openfilelevel();
		if(mustupdate){
			deleteDB();
			copyDBfromassets();
		}
		
		
		Thread time=new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					
				}finally{
					Intent a=new Intent(SplashActivity.this,Activitylogin.class);
					startActivity(a);
				}
			}
		};
		time.start();
	}
	private void copyDBfromassets() {
		DataBaseCreator myHelper;
		myHelper=new DataBaseCreator(this);
		try{
			myHelper.createDatabase();
		}catch(IOException e){
			throw new Error("Unable to create database");
		}
		try{
			myHelper.openDatabase();
		}catch(SQLiteException eql){
			throw eql;
			
		}
		
	}

	private void deleteDB() {
		try{
			File f=new File(DB_PATH_NAME);
			if(f.exists()){
				f.delete();
			}
			File f2=new File(DB_PATH_NAME2);
			if(f2.exists()){
				f2.delete();
			}
		}catch(Exception ex){
			
		}
		
	}

	private void openfilelevel() {
		FileInputStream fis;
		
		try {
			fis=openFileInput("Update.ss");
			byte[] input=new byte[fis.available()];
			while(fis.read(input)!=-1){
				value=new String(input);
				
			}fis.close();
			if(!value.contentEquals(update)){
				mustupdate=true;
				creatUpdatelevel();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//byte[] input=new byte[fis]
		
	}

	private void creatUpdatelevel() {
		String FILENAME="Update.ss";
		String JOUR=update;
		try{
			File file=getBaseContext().getFileStreamPath(FILENAME);
			mustupdate=true;
			FileOutputStream fos=openFileOutput(FILENAME, getBaseContext().MODE_PRIVATE);
			fos.write(JOUR.getBytes());
			fos.close();
		}catch(FileNotFoundException e){
			
		}catch (IOException e) {
			// TODO: handle exception
		}	
		
	}

	private void makethefile() {
		String FILE_NAME="Update.ss";
		String JOUR=update;
		try {
			File file=getBaseContext().getFileStreamPath(FILE_NAME);
			if(file.exists()){
				Toast.makeText(this, "Exist",Toast.LENGTH_LONG).show();
				
			}else{
				mustupdate=true;
				FileOutputStream fos=openFileOutput(FILE_NAME, getBaseContext().MODE_PRIVATE);
				fos.write(JOUR.getBytes());
				fos.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
