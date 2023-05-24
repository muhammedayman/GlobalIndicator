package com.example.globalindicator;



import java.util.ArrayList;



import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class UsecityDB {
	public static final String DATABASE_NAME="citycoode.sqlite";
	public static final String DATABASE_TABLE="tbcity2";
	public static final int DATABASE_VERSION=1;
	private static final String CityAirport = null;
	Context ourContext;
	private Dbhelper ourHelper;
	private SQLiteDatabase ourDatabase;
	ArrayList<String> list=new ArrayList<String>();
	//fields
	public static String KEY_ROWID="_id";
	public static String KEY_COUNTRY="country";
	public static String KEY_CITY="city";
	public static String KEY_CITYCODE="citycode";
	public static String KEY_AIRPORT="airportname";
	public static String KEY_AIRPORTCODE="airportcode";
	public static String KEY_AREA="area";
	
	private String[] columns=new String[]{KEY_COUNTRY,KEY_CITY,KEY_CITYCODE,KEY_AIRPORT,KEY_AIRPORTCODE,KEY_AREA};
	private static class Dbhelper extends SQLiteOpenHelper{

		public Dbhelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS"+DATABASE_TABLE);
			onCreate(db);
			
		}}
	public UsecityDB(Context c){
		ourContext=c;
	}
	public UsecityDB open() throws SQLException{
		ourHelper=new Dbhelper(ourContext);
		ourDatabase=ourHelper.getWritableDatabase();
		return this;
	}
	public void close(){
		ourHelper.close();
	}
	public ArrayList<String> getcity(String city){
		String cityname = null;
		String Area=null;
		String citycode1=null;
		String country=null;
		String Airportname=null;
		String Airportcode=null;
		if(city!=null){
			Cursor c=ourDatabase.query(DATABASE_TABLE, columns, KEY_CITYCODE + " like ?", new String[]{ city+"%" }, null, null, null);
			
			while(c.moveToNext()){
				int countid=c.getColumnIndex(KEY_COUNTRY);
				int citynameid=c.getColumnIndex(KEY_CITY);
				int citycodeid=c.getColumnIndex(KEY_CITYCODE);
				int areaid=c.getColumnIndex(KEY_AREA);
				int airportnameid=c.getColumnIndex(KEY_AIRPORT);
				int airportcodeid=c.getColumnIndex(KEY_AIRPORTCODE);
				
				Airportcode=c.getString(airportcodeid);
				citycode1=c.getString(citycodeid);
				country=c.getString(countid);
				cityname=c.getString(citynameid);
				Area=c.getString(areaid);
				Airportname=c.getString(airportnameid);		
				Log.d("ok city names", cityname+"");
				list.add(citycode1);
				list.add(cityname);
				list.add(country);
				list.add(Airportname);
				list.add(Airportcode);
				list.add(Area);
			}
			
		}
		
		return list;
		
		
		
	}
}
