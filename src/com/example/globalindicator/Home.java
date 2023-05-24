package com.example.globalindicator;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends ActionBarActivity {

 Button but1,but2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		but1=(Button) findViewById(R.id.button1);
		but2=(Button) findViewById(R.id.button2);
	}
	public void gotomymenu(View v){
		if(v.getId()==R.id.button1);{
			Intent a=new Intent(Home.this,Menu1.class);
			startActivity(a);
		}
	
		}
	public void gotomy(View v){
		
		if(v.getId()==R.id.button2);{
			Intent a=new Intent(Home.this,Threelettercode.class);
			startActivity(a);
			
		}
		}
}
