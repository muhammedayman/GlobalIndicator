package com.example.globalindicator;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activitylogin extends ActionBarActivity {
	Button b1;
	EditText et1,et2;
	String machineCode;
	String threealgm;
	String serialKey;
	String value;
	String update="01";
	Boolean mustupdate=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activitylogin);
		b1=(Button) findViewById(R.id.button1);
		et1=(EditText) findViewById(R.id.editText1);
		et2=(EditText) findViewById(R.id.editText2);
		getmacaddress();
		makethefile0();
		openfilelevel0();
		
		
		
				}

	private void openfilelevel0() {
		FileInputStream fis;
		String FILE_NAME="Update.sn";
		File file=getBaseContext().getFileStreamPath(FILE_NAME);
		Log.d("okopen", "openfile loop");
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
		    String line="00";

		    while ((line=br.readLine()) != null) {
		    	 value=line;
		    	Log.d("line44", line+"openfile loop");
		        }
		    br.close();
		    
			//////////
		   
			Log.d("line", line+"openfile loop");
			if(!value.contentEquals(serialKey)){
				Toast.makeText(this, "Invalid Usercode",Toast.LENGTH_LONG).show();
				mustupdate=true;
				creatUpdatelevel();
			}
			if(value.contentEquals(serialKey)){
				Toast.makeText(this, "Login",Toast.LENGTH_LONG).show();
				Intent a=new Intent(Activitylogin.this,Home.class);
				startActivity(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//byte[] input=new byte[fis]
		
	}

	private void makethefile0() {
		Log.d("make0","make0");
				
		threealgm=calculateHashcode(machineCode,"SHA1")+calculateHashcode(machineCode,"MD5")+calculateHashcode(machineCode,"SHA256");	//serialKey=encodeSerialkey(threealgm);
		Log.d("make0",threealgm+"make0");
		serialKey=encodeSerialkey(threealgm);
		Log.d("make0",serialKey+"make0");
	}

	private void getmacaddress() {
		WifiManager manager = (WifiManager) getSystemService(this.WIFI_SERVICE);
		WifiInfo info = manager.getConnectionInfo();
		machineCode = info.getMacAddress();
		Toast.makeText(this, "info"+info+"address"+machineCode+"exist", Toast.LENGTH_LONG).show();
		et1.setText(machineCode);
		
	}

	public void checkMyid(View v){
		if(v.getId()==R.id.button1){
			
			
		
			makethefile();
			openfilelevel();
			
		}
	}
	private String encodeSerialkey(String threealgm) {
		
		  String serialKeyEncoded=""+
	              threealgm.charAt(32)+
	              threealgm.charAt(76)+
	              threealgm.charAt(100)+
	              threealgm.charAt(50)+
	              "-"+
	              threealgm.charAt(45)+
	              threealgm.charAt(25)+
	              threealgm.charAt(17)+
	              threealgm.charAt(32)+
	              "-"+
	              threealgm.charAt(29)+
	              threealgm.charAt(41)+
	              threealgm.charAt(26)+
	              threealgm.charAt(33)+
	              "-"+
	              threealgm.charAt(51)+
	              threealgm.charAt(57)+
	              threealgm.charAt(67)+
	              threealgm.charAt(71);
		 
	      return serialKeyEncoded;
	  
	}
	private String calculateHashcode(String machineCode, String algcode) {
		  
		 String HexMessageEncode="";
		 byte[] machinecodebyte=machineCode.getBytes();
		
	     try {
			java.security.MessageDigest msgdigest=java.security.MessageDigest.getInstance(algcode);
			msgdigest.update(machinecodebyte);
			byte[] msgdigestbyte=msgdigest.digest();
			for(int i=0;i<msgdigestbyte.length;i++){
				
			    int countEncode=msgdigestbyte[i] & 0xff;
			    HexMessageEncode=HexMessageEncode+Integer.toHexString(countEncode);
			    if(Integer.toHexString(countEncode).length()==1){
			        HexMessageEncode=HexMessageEncode+"0";
			    }
			   
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return HexMessageEncode;
	}
	private void openfilelevel() {
		FileInputStream fis;
		String FILE_NAME="Update.sn";
		File file=getBaseContext().getFileStreamPath(FILE_NAME);
		Log.d("okopen", "openfile loop");
		try {
			fis=openFileInput("Update.sn");
			byte[] input=new byte[fis.available()];
			/*while(fis.read(input)!=-1){
				value=new String(input);
				Log.d("okopenwhilw", "openfile loop");	
			}*/fis.close();
			//////
			BufferedReader br = new BufferedReader(new FileReader(file));
		    String line="00";

		    while ((line=br.readLine()) != null) {
		    	 value=line;
		    	Log.d("line44", line+"openfile loop");
		        }
		    br.close();
		    
			//////////
		   
			Log.d("line", line+"openfile loop");
			if(!value.contentEquals(serialKey)){
				Toast.makeText(this, "Invalid Usercode",Toast.LENGTH_LONG).show();
				mustupdate=true;
				creatUpdatelevel();
			}
			if(value.contentEquals(serialKey)){
				Toast.makeText(this, "Login",Toast.LENGTH_LONG).show();
				Intent a=new Intent(Activitylogin.this,Home.class);
				startActivity(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//byte[] input=new byte[fis]
		
	}

	private void creatUpdatelevel() {
		String FILENAME="Update.sn";
		String JOUR=serialKey;
		try{
			File file=getBaseContext().getFileStreamPath(FILENAME);
			mustupdate=true;
			FileOutputStream fos=openFileOutput(FILENAME, getBaseContext().MODE_PRIVATE);
			String usercode=et2.getText().toString();
			if(usercode.contentEquals(JOUR)){
				fos.write(JOUR.getBytes());
			}
			fos.close();
		}catch(FileNotFoundException e){
			
		}catch (IOException e) {
			// TODO: handle exception
		}	
		
	}

	private void makethefile() {
		String FILE_NAME="Update.sn";
		String JOUR=serialKey;
		try {
			Log.d("okmake", "make fileloop");
			File file=getBaseContext().getFileStreamPath(FILE_NAME);
			if(file.exists()){
				
				/////
				BufferedReader br = new BufferedReader(new FileReader(file));
			    String line="00";

			    int k=0;
			    while ((line=br.readLine()) != null) {
			    	k=1;
			    	
			        }
			    br.close();
				///////
			    if(k==0){
			    	FileOutputStream fos=openFileOutput(FILE_NAME, getBaseContext().MODE_PRIVATE);	
					String usercode=et2.getText().toString();
		fos.write(usercode.getBytes());
						
					
					
					fos.close();	
			    }
				
				Toast.makeText(this, "Exist",Toast.LENGTH_LONG).show();
				Log.d("okmake if", "make fileloop");
			}else{
				Log.d("okmake else", "make fileloop");
				mustupdate=true;
				FileOutputStream fos=openFileOutput(FILE_NAME, getBaseContext().MODE_PRIVATE);
				String usercode=et2.getText().toString();
				Log.d("okmake", usercode+"usercode make fileloop");
				
					fos.write(usercode.getBytes());
					
				
				
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
