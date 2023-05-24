package com.example.globalindicator;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class UseDB2{
	
	public static final String DATABASE_NAME2="fullcode.sqlite";
	
	public static final String DATABASE_TABLE2="maintb";
	public static final int DATABASE_VERSION=1;

	Context ourContext;
	private Dbhelper ourHelper;
	private SQLiteDatabase ourDatabase;
	ArrayList<String> list=new ArrayList<String>();
	//fields
	public static String KEY_ROWID="_id";

	public static String KEY_ROWID2="_id";
	public static String KEY_CITYCODE2="citycode";
	public static String KEY_CITY2="cityname";
	public static String KEY_AIRPORT2="airport";
	public static String KEY_COUNTRY2="country";
	
	

	
	///////////////////
	
	
	private String[] columns2=new String[]{KEY_CITYCODE2,KEY_CITY2,KEY_AIRPORT2,KEY_COUNTRY2};
	private static class Dbhelper extends SQLiteOpenHelper{

		public Dbhelper(Context context) {
			super(context, DATABASE_NAME2, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS"+DATABASE_TABLE2);
			onCreate(db);
			
		}}
	public UseDB2(Context c){
		ourContext=c;
	}
	public UseDB2 open() throws SQLException{
		ourHelper=new Dbhelper(ourContext);
		ourDatabase=ourHelper.getWritableDatabase();
		return this;
	}
	public void close(){
		ourHelper.close();
	}
	public ArrayList<String> getcity(String city){
		
		String cityname2 = null;
		String airportname2 = null;
		String countryname2 = null;
		
		if(city!=null){
			
			int mks=0;
			
			
			Cursor c2=null;
			
				if(city.length()==3){
					c2=ourDatabase.query(DATABASE_TABLE2, columns2, KEY_CITYCODE2 + " like ?", new String[]{ city+"%" }, null, null, null);	
				
				
			
				while(c2.moveToNext()){
					
					mks=1;
					int citynameid2=c2.getColumnIndex(KEY_CITY2);
					int countryid2=c2.getColumnIndex(KEY_COUNTRY2);
					int airportid2=c2.getColumnIndex(KEY_AIRPORT2);
					
					cityname2=c2.getString(citynameid2);
					
					airportname2=c2.getString(airportid2);	
					countryname2=c2.getString(countryid2);
					Log.d("ok city names", cityname2+"");
					list.add(cityname2);
					list.add(airportname2);
					list.add(countryname2);
				}}
				if(city.length()>3)
				{
					c2=ourDatabase.query(DATABASE_TABLE2, columns2, KEY_CITY2 + " like ?", new String[]{ city+"%" }, null, null, null);
					while(c2.moveToNext()){
						
						mks=1;
						int citynameid2=c2.getColumnIndex(KEY_COUNTRY2);
						int countryid2=c2.getColumnIndex(KEY_CITYCODE2);
						int airportid2=c2.getColumnIndex(KEY_AIRPORT2);
						
						cityname2=c2.getString(citynameid2);
						
						airportname2=c2.getString(airportid2);	
						countryname2=c2.getString(countryid2);
						Log.d("okcity names mks", cityname2+"");
						list.add(cityname2);
						list.add(airportname2);
						list.add(countryname2);
					}
					
				if(mks==0){
					c2=ourDatabase.query(DATABASE_TABLE2, columns2, KEY_COUNTRY2 + " like ?", new String[]{ city+"%" }, null, null, null);
					while(c2.moveToNext()){
						
						mks=1;
						int citynameid2=c2.getColumnIndex(KEY_CITY2);
						int countryid2=c2.getColumnIndex(KEY_CITYCODE2);
						int airportid2=c2.getColumnIndex(KEY_AIRPORT2);
						
						cityname2=c2.getString(citynameid2);
						
						airportname2=c2.getString(airportid2);	
						countryname2=c2.getString(countryid2);
						
						Log.d("ok city namesmks", cityname2+"");
						list.add(cityname2);
						list.add(airportname2);
						list.add(countryname2);
					}
				}}
			
			
		}
		
		return list;
		
		
		
	}
}
