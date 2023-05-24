package com.example.globalindicator;


import java.util.Arrays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomList2  extends ArrayAdapter<String>{
	
	
	String[] NorthAmerica=Menu1.NorthAmerica;
	String[] southAmerica=Menu1.southAmerica;
	String[] CentralAmerica=Menu1.CentralAmerica;
	String[] carrebeanArea=Menu1.carrebeanArea;
	String[] carreabeanIsland=Menu1.carreabeanIsland;
	
	String[] northAtlantic_SubArea=Menu1.northAtlantic_SubArea;
	String[] midAtlantic_SubArea=Menu1.midAtlantic_SubArea;
	String[] southAtlantic_SubArea=Menu1.southAtlantic_SubArea;
	String[] abcpuSA=Menu1.abcpuSA;
	String[] us_canda=Menu1.us_canda;
	//tc2
	String[] europe=Menu1.europe;
	String[] europeancomm_aviaArea=Menu1.europeancomm_aviaArea;
	String[] europeancomm_monit=Menu1.europeancomm_monit;
	String[] RussiaInEurope=Menu1.RussiaInEurope;
	String[] ukrain=Menu1.ukrain;
	String[] scandinavia_country=Menu1.scandinavia_country;
	String[] central_africa=Menu1.central_africa;
	String[] eastern_africa=Menu1.eastern_africa;
	String[] southern_africa=Menu1.southern_africa;
	
	String[] libiya=Menu1.libiya;
	String[] indian_oceanisland=Menu1.indian_oceanisland;
	String[] western_africa=Menu1.western_africa;
	String[] middleEast=Menu1.middleEast;
	//c3
	String[] southEastasia=Menu1.southEastasia;
	String[] Japan_Korea_subarea=Menu1.Japan_Korea_subarea;
	String[] SouthAsian_subcontinent=Menu1.SouthAsian_subcontinent;
	String[] southwestpacific=Menu1.southwestpacific;
	
	
	public CustomList2(Context context, String[] meaning) {
		super(context,R.layout.custom_list2,meaning);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater aymanInfalator=LayoutInflater.from(getContext());
		View customView=aymanInfalator.inflate(R.layout.custom_list2, parent,false);
		String singleword=getItem(position);
		TextView tv_entoml=(TextView)customView.findViewById(R.id.textView1);
		TextView tv_entoml2=(TextView)customView.findViewById(R.id.textView2);
		/*RobotoBoldFontHelper.applyFont(getContext(), tv_entoml);*/
		tv_entoml.setText(singleword);
		tv_entoml2.setText("AREA");
		if((Arrays.asList(NorthAmerica).contains(singleword))){
			tv_entoml2.setText("NorthAmerica TC1");
		}
		if((Arrays.asList(southAmerica).contains(singleword))){
			tv_entoml2.setText("outhAmerica TC1");
		}if((Arrays.asList(CentralAmerica).contains(singleword))){
			tv_entoml2.setText("CentralAmerica TC1");
		}if((Arrays.asList(carrebeanArea).contains(singleword))){
			tv_entoml2.setText("CarrebeanArea TC1");
		}if((Arrays.asList(midAtlantic_SubArea).contains(singleword))){
			tv_entoml2.setText("MidAtlantic SubArea TC1");
		}if((Arrays.asList(carreabeanIsland).contains(singleword))){
			tv_entoml2.setText("CarreabeanIsland TC1");
				}
		if((Arrays.asList(northAtlantic_SubArea).contains(singleword))){
			tv_entoml2.setText("North Atlantic SubArea TC1");
		}if((Arrays.asList(southAtlantic_SubArea).contains(singleword))){
			tv_entoml2.setText("South Atlantic SubArea TC1");
		}if((Arrays.asList(abcpuSA).contains(singleword))){
			tv_entoml2.setText("ABCPU TC1");
		}if((Arrays.asList(us_canda).contains(singleword))){
			tv_entoml2.setText("US/Canda TC1");
		}
		//tc2
		if((Arrays.asList(europe).contains(singleword))){
			tv_entoml2.setText("Europe TC2");
		}if((Arrays.asList(europeancomm_aviaArea).contains(singleword))){
			tv_entoml2.setText("European Common Aviation Area TC2");
		}if((Arrays.asList(europeancomm_monit).contains(singleword))){
			tv_entoml2.setText("European Economic And Monitary union TC2");
		}if((Arrays.asList(RussiaInEurope).contains(singleword))){
			tv_entoml2.setText("RussiaInEurope TC2");
		}if((Arrays.asList(ukrain).contains(singleword))){
			tv_entoml2.setText("Ukrain TC2");
		}if((Arrays.asList(scandinavia_country).contains(singleword))){
			tv_entoml2.setText("Scandinavia Country TC2");
		}if((Arrays.asList(central_africa).contains(singleword))){
			tv_entoml2.setText("Central Africa TC2");
		}if((Arrays.asList(eastern_africa).contains(singleword))){
			tv_entoml2.setText("Eastern Africa TC2");
		}if((Arrays.asList(southern_africa).contains(singleword))){
			tv_entoml2.setText("Southern Africa TC2");
		}if((Arrays.asList(libiya).contains(singleword))){
			tv_entoml2.setText("Libiya TC2");
		}if((Arrays.asList(indian_oceanisland).contains(singleword))){
			tv_entoml2.setText("Indian OceanIsland TC2");
		}if((Arrays.asList(western_africa).contains(singleword))){
			tv_entoml2.setText("Western Africa TC2");
		}if((Arrays.asList(middleEast).contains(singleword))){
			tv_entoml2.setText("MiddleEast TC2");
		}
		//tc3
		if((Arrays.asList(southEastasia).contains(singleword))){
			tv_entoml2.setText("SouthEastAsia TC3");
		}if((Arrays.asList(Japan_Korea_subarea).contains(singleword))){
			tv_entoml2.setText("Japan/Korea SubArea TC3");
		}if((Arrays.asList(SouthAsian_subcontinent).contains(singleword))){
			tv_entoml2.setText("SouthAsian SubContinent TC3");
		}if((Arrays.asList(southwestpacific).contains(singleword))){
			tv_entoml2.setText("SouthWestPacific TC3");
		}
		if(tv_entoml2.getText()=="AREA"){
			tv_entoml2.setText("Sorry ,Please helps your developer to add your code");}
		return customView;
		
	}
 

}