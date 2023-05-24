package com.example.globalindicator;

import java.util.ArrayList;
import java.util.List;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Threelettercode extends ActionBarActivity {

	Button bt;
	EditText txt;
	String city="lon";
	ListAdapter adapter;
	ListView lv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_threelettercode);
		bt=(Button) findViewById(R.id.bt1);
		txt=(EditText) findViewById(R.id.editText1);
		lv1=(ListView)findViewById(R.id.listView1);
	}

	public void searchcity(View v){
		if(v.getId()==R.id.bt1){
			city=txt.getText().toString();
			Log.d("taggg","okkk");
			 loadSpinnerData();
			//getdatacity(); 
		
	}
		
	}
	/*private void getdatacity() {
		String labels;
		UsecityDB count=new UsecityDB(this);
		count.open();
		 labels=count.getcity(city);
		
	}*/

	private void loadSpinnerData() {
 
		List<String> lables = getAllLabels();
		String[] mStringArray = new String[lables.size()];
		mStringArray = lables.toArray(mStringArray);
       ListAdapter dataAdapter = new CustomList(this, mStringArray);
        
        lv1.setAdapter(dataAdapter);
		               
    }
	private List<String> getAllLabels() {
		UsecityDB count=new UsecityDB(this);
		count.open();
        List<String> labels = new ArrayList<String>();
        labels=count.getcity(city);
         if(labels.isEmpty()){
        	 UseDB2 count2=new UseDB2(this);
     		count2.open();
     		labels=count2.getcity(city);
         }
        return labels;
    
	}

	
}
