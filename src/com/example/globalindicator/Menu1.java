package com.example.globalindicator;

import java.util.ArrayList;
import java.util.Arrays;
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
import android.widget.TextView;
import android.widget.Toast;

public class Menu1 extends ActionBarActivity {
	
	EditText etext;
	Button btn,btn2;
	TextView tv2;
	int b=0,tt=0,ee=0,ts=0,fe=0,ru=0,at=0,sa=0,pn=0;
	String s;
	String[] words;
	
	String initialPlace;
	int limitArray;
	String finalPlace;
	/**********************************************************************************************/
						//tc1
	public static String[] abcpuSA={"bue","eze","bsb","rio","gig","gru","sao","scl","asu","mvd"};
	public static String[] us_canda={"yhz","yow","ymq","yul","yyz","yto","yyc","yvr","anc","atl","bos","chi","hou","iah","jfk","lga","ewr","iad","dca","ord","dfw","dtw","dal","dtt","hou","lax","mia","msy","nyc",
									"mco","slc","sfo","was"};
	public static String[] NorthAmerica={"yhz","yow","ymq","yul","yyz","yto","yyc","yvr","mex","aca","anc","atl","bos"
										,"chi","hou","iah","jfk","lga","ewr","iad","dca","ord","dfw","dtw","dal","dtt","hou","lax","mia","msy","nyc","mco","slc","sfo","was"};
	public static String[] CentralAmerica={"bcv","sjo","sal","gua","tgu","mga"};
	public static String[] carrebeanArea={"nas","bda","geo","cay","pbm"};
	public static String[] carreabeanIsland={"anu","bgi","hav","dom","sdq","gnd","pap","kin","skb","slu","svd"};
	public static String[] southAmerica={"bue","eze","lpb","bsb","rio","gig","gru","sao","scl","bog","gye","uio","cay","geo","pty","asu","lim",
									"pbm","mvd","ccs"};
			//second classificationtc1				
	public static String[] northAtlantic_SubArea={"yhz","yow","ymq","yul","yyz","yto","yyc","yvr","goh","mex","aca","sju"};
	public static String[] midAtlantic_SubArea={"anu","bgi","hav","dom","sdq","gnd","pap","kin","skb","slu","svd",
							"bcv","sjo","sal","gua","tgu","mga",
								"lpb","bog","gye","uio","cay","geo","pty","lim","pbm","ccs"};
	public static String[] southAtlantic_SubArea={"bue","eze","bsb","rio","gig","gru","sao","scl","asu","mvd"};
	/********************************************************************************************/					
	///tc2
	
	public static String[] europe={"alg","ank","esb","vie","inn","bak","msq","bru","anr","sof","nic","lca","prg","cph","hel","par","cdg","ory","mrs","nce"
						,"lys","ber","txl","sxf","fra","muc","ham","dus","ath","skg","bud","rek","kef","dub","rom","fco","lin","mxp","mil","nap","vce","mla","kiv","rba","cmn"
						,"cas","rak","tgd","ams","rtm","osl","waw","lis","opo","fao","buh","otp","mow","svo","led","beg","bts","lju","mad","bcn",
							"agp","sto","arn","brn","zrh","gva","bsl","ist","iev","tun","lon","lhr","lgw","man","bhx","edi","gla","bfs"};
	public static String[] europeancomm_aviaArea={"vie","inn","bru","anr","sof","nic","lca","prg","cph","hel","par","cdg","ory","mrs","nce","lys",
							"ber","txl","sxf","fra","mun","ham","dus","ath","skg","bud","rek","kef","dub","rom","fco","lin","mxp","mil","nap","vce",
							"osl","waw","lis","opo","fao","buh","otp","beg","bts","mad","bcn","agp","sto","arn","brn","zrh","gva","bsl","lon","lhr","lgw","man",
						"bhx","edi","gla","bfs"};
	public static String[] europeancomm_monit={"bru","anr","nic","lca","hel","par","cdg","ory","mrs","nce","lys","ber","txl","sxf","fra","muc","ham","dus",
							"ath","skg","dub","rom","fco","lin","mxp","mil","nap","vce","mla","ams","lis","opo","fao","bts","lju","mad","bcn","agp"};
	public static String[] RussiaInEurope={"mow","svo","led"};
	public static String[] ukrain={"iev"}; 
	public static String[] scandinavia_country={"cph","osl","sto","arn"};
	//africa
	public static String[] central_africa={"llw","lun","hre"};
	public static String[] eastern_africa={"jib","asm","add","nbo","mba","kgl","mgq","dod","dar","ebb"};
	public static String[] southern_africa={"gbe","msu","mpm","pry","cpt","jnb","wdh","mts"};
	public static String[] libiya={"tip"};
	public static String[] indian_oceanisland={"tnr","mru","sez"};
	public static String[] western_africa={"lad","coo","yao","dla","vzv","ask","abj","fih","ssg","lbv","bjl",
			"cky","mlw","bko","nkc","nim","abv","los","tms","tkr","fna","lfw"};
	//middle east
	public static String[] middleEast={"bah","cai","aly","bgw","thr","jrs","tlv","amm","kwt","bey","mct","doh",
			"ruh","jed","krt","dam","auh","dxb","shj","saa","sah"};
	/*******************************************************************************************/
	//tc3
	public static String[] southEastasia={"bwn","pnh","bjs","pek","sha","tpe","hkg","jkt","cgk","dps","tse","fru","vte","mfm","kul",
			"maj","uln","rgn","ror","mnl","khv","sin","dyu","bkk","dil","asb","tas","han","sgn"};
	public static String[] Japan_Korea_subarea={"fnj","sel","tyo","nrt","hnd","kix","osa"};
	public static String[] SouthAsian_subcontinent={"kbl","dac","pbh","del","bom","maa","ccu","mle","ktm"
			,"isb","khi","cmb"};
	public static String[] southwestpacific={"apw","cbr","syd","mel","per","suv","nan","ppt","trw","inu","wlg","akc","chc","hir",
			"tbu","fun","vli"};
	
	ListAdapter adapter;
	ListView lv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu1);
		etext=(EditText)findViewById(R.id.et1);
		btn=(Button)findViewById(R.id.bt1);
		btn2=(Button)findViewById(R.id.bt2);
		tv2=(TextView)findViewById(R.id.textView2);
		lv1=(ListView)findViewById(R.id.listView1);
		
		
	}

	
	public void globalI(View v){
		if(v.getId()==R.id.bt1);{
			b=0;tt=0;ru=0;fe=0;
			ee=0;ts=0;at=0;sa=0;pn=0;
			tv2.setText("Type Code");
			russianRoute();
			loadSpinnerData();
		}
		
	}
	public void resettxt(View v1){
		if(v1.getId()==R.id.bt2){
			b=0;tt=0;ru=0;fe=0;
			tv2.setText("reset");
			etext.setText("");
			
		}
	}
	public void russianRoute(){
		
		s =etext.getText().toString();
		words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    // You may want to check for a non-word character before blindly
		    // performing a replacement
		    // It may also be necessary to adjust the character class
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		initialPlace=words[0];
		limitArray=words.length;
		finalPlace=words[limitArray-1];
		if((Arrays.asList(RussiaInEurope).contains(initialPlace))&&
				(Arrays.asList(Japan_Korea_subarea).contains(words[1]))){
		for(int k=2;k<limitArray;k++){
			
				if(k>1){
					if((Arrays.asList(southEastasia).contains(words[k]))
							||Arrays.asList(Japan_Korea_subarea).contains(words[k])
							||Arrays.asList(SouthAsian_subcontinent).contains(words[k])
							||Arrays.asList(southwestpacific).contains(words[k])){
						b++;
						
					}
				}
				
				
				
			}
		Log.d("llkkk", "b "+b+" limitarray "+(limitArray-2));
		if(limitArray==2){
			tv2.setText("RU indicator");
			Log.d("if_llkkk", "l=1 ru=1 ");
			ru=1;
		}
		if(b==limitArray-2){
			tv2.setText("RU indicator");
			ru=1;
			Log.d("b lm llkkk", "ru=1 ");
		}
			
			
		}
		/******************************************rev ru**********************/
		// area3 tyo mow
		if((Arrays.asList(RussiaInEurope).contains(finalPlace))&&
				(Arrays.asList(Japan_Korea_subarea).contains(words[limitArray-2]))){
		for(int k=limitArray;k>=3;k--){
			/*************************************************/
			
				if(k>1){
					if((Arrays.asList(southEastasia).contains(words[k-3]))
							||Arrays.asList(Japan_Korea_subarea).contains(words[k-3])
							||Arrays.asList(SouthAsian_subcontinent).contains(words[k-3])
							||Arrays.asList(southwestpacific).contains(words[k-3])){
						b++;
						
					}
				}
				
				
				
			}
		Log.d("llkkk", "b "+b+"limitarray "+(limitArray-2));
		if(limitArray==2){
			tv2.setText("RU indicator");
			ru=1;
		}
		if(b==limitArray-2){
			tv2.setText("RU indicator");
			ru=1;
		}
			
		}
		farEast();
		
	}
	public void farEast(){
		/********************************fe****************************/
		if((Arrays.asList(RussiaInEurope).contains(initialPlace))&&
				(Arrays.asList(ukrain).contains(words[1]))){
		for(int k=0;k<limitArray;k++){
			
				if(k>1){
					if((Arrays.asList(southEastasia).contains(words[k]))
							||Arrays.asList(SouthAsian_subcontinent).contains(words[k])
							||Arrays.asList(southwestpacific).contains(words[k])){
						b++;
						
					}
				}
				if(limitArray==1){
					tv2.setText("FE indicator");
					fe=1;
				}
				if(b==limitArray-2){
					tv2.setText("FE indicator");
					fe=1;
				}
				
				
			}
			
			
		}
		/******************************************rev fe**********************/
		
		if((Arrays.asList(RussiaInEurope).contains(finalPlace))&&
				(Arrays.asList(ukrain).contains(words[limitArray-2]))){
		for(int k=limitArray;k>=3;k--){
			/*************************************************/
			
				if(k>1){
					if((Arrays.asList(southEastasia).contains(words[k-3]))
							||Arrays.asList(SouthAsian_subcontinent).contains(words[k-3])
							||Arrays.asList(southwestpacific).contains(words[k-3])){
						b++;
						
					}
					
				}
				
				if(limitArray==2){
					
					tv2.setText("FE indicator");
					fe=1;
				}
				
				if(b==limitArray-2){
					tv2.setText("FE indicator");
					fe=1;
				}
				
				
			}
		
		}
		transiberianRoute();
	}
	public void transiberianRoute(){
		if(ru!=1){
			int l=0,m=0,n=0,ll=0,mm=0;
			for(int i=0;i<limitArray;i++){
				if(Arrays.asList(Japan_Korea_subarea).contains(words[i])){
					Log.d("tracing_bugts","first japankore detected"+ words[i]);
					//area3 tyo lon area2
					if(limitArray>(i+1)){
					if((Arrays.asList(europe).contains(words[i+1]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i+1]))||
								(Arrays.asList(europeancomm_monit).contains(words[i+1]))){
						Log.d("tracing_bugts","europe detected 1"+ words[i+1]);
						
							for(int k=i+2;k<limitArray;k++){
								Log.d("tracing_bugts","1 for k europe detected 1"+ k);
							if((Arrays.asList(europe).contains(words[k]))||(Arrays.asList(europeancomm_aviaArea).contains(words[k]))||
											(Arrays.asList(europeancomm_monit).contains(words[k]))||(Arrays.asList(central_africa).contains(words[k]))
											||(Arrays.asList(eastern_africa).contains(words[k]))||(Arrays.asList(southern_africa).contains(words[k]))
											||(Arrays.asList(indian_oceanisland).contains(words[k]))||(Arrays.asList(western_africa).contains(words[k]))
											||(Arrays.asList(middleEast).contains(words[k]))){
								Log.d("tracing_bugts","1 for k europe detected 1"+ words[k]);
								l++;
								}
							}
							Log.d("tracing_bugts","above 2 for k  detected 1"+ l);
							for(int k=0;k<=(i);k++){
								Log.d("tracing_bugts","2 for k area3 detected 1"+ words[k]);
							if((Arrays.asList(southEastasia).contains(words[k]))||(Arrays.asList(southwestpacific).contains(words[k]))||
										(Arrays.asList(SouthAsian_subcontinent).contains(words[k]))){
								Log.d("tracing_bugts","2 if k area3 detected 1"+ words[k]);
								m++;
								}
							}
							Log.d("tracing_bugts","2  k area3 detected 1"+ l+" m "+m);
							Log.d("tracing_bugts","ffff l "+ l+" m "+m +" ll "+ll+" mm "+mm);
							if(((m+l+2)==limitArray)||((mm+ll+2)==limitArray)){
								tv2.setText("TS");
								Log.d("TS","ts set ");
								ts=1;
							}
							}
					
					
					}
					Log.d("tracing_bugts","2  k area3 detected 1 "+ l+" m "+m);
					//area2 lon tyo area3
					if(i>=1){
					if((Arrays.asList(europe).contains(words[i-1]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i-1]))||
								(Arrays.asList(europeancomm_monit).contains(words[i-1]))){
						Log.d("tracing_bugts","europe detected 2"+ words[i-1]);
						
							for(int k=0;k<=(i-1);k++){
								Log.d("tracing_bugts","a2 1 for k europe detected 1"+ words[k]);
							if((Arrays.asList(europe).contains(words[k]))||(Arrays.asList(europeancomm_aviaArea).contains(words[k]))||
											(Arrays.asList(europeancomm_monit).contains(words[k]))||(Arrays.asList(central_africa).contains(words[k]))
											||(Arrays.asList(eastern_africa).contains(words[k]))||(Arrays.asList(southern_africa).contains(words[k]))
											||(Arrays.asList(indian_oceanisland).contains(words[k]))||(Arrays.asList(western_africa).contains(words[k]))
											||(Arrays.asList(middleEast).contains(words[k]))){
								ll++;
								}
							}
							for(int k=i+1;k<limitArray;k++){
								Log.d("tracing_bugts","a2 2 for k europe detected 1"+ k);
							if((Arrays.asList(southEastasia).contains(words[k]))||(Arrays.asList(southwestpacific).contains(words[k]))||
										(Arrays.asList(SouthAsian_subcontinent).contains(words[k]))){
								Log.d("tracing_bugts","a2 2 for k europe detected 1"+ words[k]);
								mm++;
								}
							}
							Log.d("tracing_bugts","ffff l "+ l+" m "+m +" ll "+ll+" mm "+mm);
							if(((m+l+2)==limitArray)||((mm+ll+1)==limitArray)){
								tv2.setText("TS");
								Log.d("TS","ts set ");
								ts=1;
							}
							}
				
					}
					
							
							}
							}
							}
		esternHemi();
	}
public void esternHemi(){
	if((ts!=1)&&(fe!=1)&&(ru!=1)){
		for(int i=0;i<limitArray;i++){
			Log.d("eh for", limitArray+"limitarray ");
		if((Arrays.asList(europe).contains(words[i]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i]))||(Arrays.asList(europeancomm_monit).contains(words[i]))
				||(Arrays.asList(central_africa).contains(words[i]))||(Arrays.asList(eastern_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))
				||(Arrays.asList(indian_oceanisland).contains(words[i]))||(Arrays.asList(western_africa).contains(words[i]))||(Arrays.asList(middleEast).contains(words[i]))
				||(Arrays.asList(southEastasia).contains(words[i]))||(Arrays.asList(SouthAsian_subcontinent).contains(words[i]))||(Arrays.asList(Japan_Korea_subarea).contains(words[i]))
				||(Arrays.asList(southwestpacific).contains(words[i]))){
			tt++;
			Log.d("eh for", limitArray+"limitarray " +words[i]);
		}
		}
		
	}
	Log.d("ehkkkk", limitArray+"limitarray "+"tt "+tt);
	if(tt==limitArray){
		tv2.setText("EH");
	}
	abcpufn();
}
public void abcpufn(){
	Log.d("hhabcpu", "ok");
	int abcp=0,abcpu=0;
	if((Arrays.asList(abcpuSA).contains(initialPlace))&&(Arrays.asList(southEastasia).contains(finalPlace))){
		Log.d("hhabcpu 1 if ", "ok");
	for(int i=1;i<limitArray-1;i++){
		Log.d("hhabcpu 1 if for ", "ok");
		if((Arrays.asList(central_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))||
				(Arrays.asList(indian_oceanisland).contains(words[i]))){
			abcp++;
			Log.d("hhabcpu 1 if for if ", "ok");
		}
	}
	if((limitArray==2)||(abcp==(limitArray-2))){
		tv2.setText("SA");
		sa=1;
		}
		}
	
	if((Arrays.asList(abcpuSA).contains(finalPlace))&&(Arrays.asList(southEastasia).contains(initialPlace))){
		for(int i=1;i<(limitArray-1);i++){
			if((Arrays.asList(central_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))||
					(Arrays.asList(indian_oceanisland).contains(words[i]))){
				abcpu++;
			}
			}
		if((limitArray==2)||(abcpu==limitArray-2)){
			tv2.setText("SA");
			sa=1;
			}
	}
	if((abcp==0)||(abcpu==0)){
		AtlanticT();
	}
}
public void AtlanticT(){
	if((sa==0)){
	int c=0,cc=0,ccc=0;
	if((Arrays.asList(NorthAmerica).contains(initialPlace))||(Arrays.asList(CentralAmerica).contains(initialPlace))||
			(Arrays.asList(carreabeanIsland).contains(initialPlace))||(Arrays.asList(southAmerica).contains(initialPlace))||
			(Arrays.asList(northAtlantic_SubArea).contains(initialPlace))||(Arrays.asList(midAtlantic_SubArea).contains(initialPlace))||
			(Arrays.asList(southAtlantic_SubArea).contains(initialPlace))){
			for(int i=0;i<limitArray;i++){
			if((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
			(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
			(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
			(Arrays.asList(southAtlantic_SubArea).contains(words[i]))){
			c++;
			Log.d("bug_at", "c "+c);
			}
			
			}
			
			for(int i=c;i<limitArray;i++){
			if((Arrays.asList(europe).contains(words[i]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i]))||
				(Arrays.asList(europeancomm_monit).contains(words[i]))||(Arrays.asList(central_africa).contains(words[i]))
				||(Arrays.asList(eastern_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))
				||(Arrays.asList(indian_oceanisland).contains(words[i]))||(Arrays.asList(western_africa).contains(words[i]))
				||(Arrays.asList(middleEast).contains(words[i]))){
				cc++;
				}
			}
			Log.d("bug_at", "c "+c+" cc "+cc+" limitArray "+limitArray);
			if(cc>0){
			if((cc+c)<(limitArray)){
			for(int i=(c+cc);i<limitArray;i++){
			if((Arrays.asList(southEastasia).contains(words[i]))
						||Arrays.asList(Japan_Korea_subarea).contains(words[i])
						||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
						||Arrays.asList(southwestpacific).contains(words[i])){
						ccc++;
						}
			}
			}
			}
			if((c+cc+ccc)==(limitArray)){
				Log.d("bug_at", " At set");
			tv2.setText("AT");
			at=1;
			}
			}
	/***************************************rev at*************************************************/
	c=0;cc=0;ccc=0;
	if((Arrays.asList(NorthAmerica).contains(finalPlace))||(Arrays.asList(CentralAmerica).contains(finalPlace))||
			(Arrays.asList(carreabeanIsland).contains(finalPlace))||(Arrays.asList(southAmerica).contains(finalPlace))||
			(Arrays.asList(northAtlantic_SubArea).contains(finalPlace))||(Arrays.asList(midAtlantic_SubArea).contains(finalPlace))||
			(Arrays.asList(southAtlantic_SubArea).contains(finalPlace))){
			for(int i=(limitArray-1);i>0;i--){
			if((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
			(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
			(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
			(Arrays.asList(southAtlantic_SubArea).contains(words[i]))){
			c++;
			Log.d("bug_at", "rev at c"+c);
			}
			
			}
			
			for(int i=(limitArray-c-1);i>=0;i--){
			if((Arrays.asList(europe).contains(words[i]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i]))||
				(Arrays.asList(europeancomm_monit).contains(words[i]))||(Arrays.asList(central_africa).contains(words[i]))
				||(Arrays.asList(eastern_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))
				||(Arrays.asList(indian_oceanisland).contains(words[i]))||(Arrays.asList(western_africa).contains(words[i]))
				||(Arrays.asList(middleEast).contains(words[i]))){
				cc++;
				Log.d("bug_at", "rev at cc"+cc);
				}
			}
			if(cc>0){
				Log.d("bug_at", "ifcc>0 c "+c+" cc "+cc);
			if((cc+c)<(limitArray)){
				Log.d("bug_at", "c+cc<limiitAraay c "+c+" cc "+cc);
			for(int i=(limitArray-(c+cc+1));i>=0;i--){
			if((Arrays.asList(southEastasia).contains(words[i]))
						||Arrays.asList(Japan_Korea_subarea).contains(words[i])
						||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
						||Arrays.asList(southwestpacific).contains(words[i])){
						ccc++;
						Log.d("bug_at", " ccc "+ccc);
						}
			}
			}
			}
			Log.d("bug_at", "c "+c+" cc "+cc+" ccc "+ccc);
			if((c+cc+ccc)==(limitArray)){
				Log.d("bug_at", "rev At set");
			tv2.setText("AT");
			at=1;
			}}
	/*******************************uscanada**********************************************/
	c=-1;int uss=0;int usss=0;
	if(Arrays.asList(us_canda).contains(initialPlace)){
		for(int i=0;i<(limitArray-1);i++){
			if((Arrays.asList(us_canda).contains(words[i]))&&(Arrays.asList(SouthAsian_subcontinent).contains(words[i+1]))){
				c=i;
			}
			
		}
		
		for(int i=0;i<=c;i++){
			if(Arrays.asList(us_canda).contains(words[i])){
				uss++;
			}
			
		}
		for(int i=(c+1);i<limitArray;i++){
			if((Arrays.asList(southEastasia).contains(words[i]))
					||Arrays.asList(Japan_Korea_subarea).contains(words[i])
					||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
					||Arrays.asList(southwestpacific).contains(words[i])){
				usss++;
			}
			
		}
		if(c>=0){
		if((uss+usss)==limitArray){
			Log.d("bug_at", "us canada at set");
			tv2.setText("AT");
			at=1;	
		}
		}
	}
	/*****************************rev uscanada*******************************************/
	c=-1;uss=0;usss=0;
	if(Arrays.asList(us_canda).contains(finalPlace)){
		for(int i=0;i<(limitArray-1);i++){
			if((Arrays.asList(us_canda).contains(words[i+1]))&&(Arrays.asList(SouthAsian_subcontinent).contains(words[i]))){
				c=i;
			}
			
		}
		for(int i=(c+1);i<limitArray;i++){
			if(Arrays.asList(us_canda).contains(words[i])){
				uss++;
			}
			
		}
		for(int i=0;i<=c;i++){
			if((Arrays.asList(southEastasia).contains(words[i]))
					||Arrays.asList(Japan_Korea_subarea).contains(words[i])
					||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
					||Arrays.asList(southwestpacific).contains(words[i])){
				usss++;
			}
			
		}
		if(c>=0){
		if((uss+usss)==limitArray){
			Log.d("bug_at", " uscanada rev at set");
			tv2.setText("AT");
			at=1;	
		}
		}
	}
	/*******************************************************************************/
	at2();
			}
	
	pacificNorthJourney();
}
public void at2(){
	int l=0,m=0,n=0,ll=0,mm=0;
	for(int i=0;i<limitArray;i++){
		if(Arrays.asList(SouthAsian_subcontinent).contains(words[i])){
			Log.d("tracing_bugat","first SouthAsian_subcontinent detected"+ words[i]);
			//area3 del lax area1
			if(limitArray>(i+1)){
			if((Arrays.asList(us_canda).contains(words[i+1]))){
				Log.d("tracing_bugat","area1 detected 1"+ words[i+1]);
				
				
					for(int k=i+2;k<limitArray;k++){
						Log.d("tracing_bugat","1 for k europe detected 1"+ k);
					if((Arrays.asList(midAtlantic_SubArea).contains(words[k]))||(Arrays.asList(NorthAmerica).contains(words[k]))||
			(Arrays.asList(carrebeanArea).contains(words[k]))||(Arrays.asList(carreabeanIsland).contains(words[k]))
			||(Arrays.asList(southAmerica).contains(words[k]))||(Arrays.asList(southAtlantic_SubArea).contains(words[k]))||
			(Arrays.asList(northAtlantic_SubArea).contains(words[k]))||
						(Arrays.asList(CentralAmerica).contains(words[k]))){
						Log.d("tracing_bugat","1 for k area1 detected 1"+ words[k]);
						l++;
						}
					}
					Log.d("tracing_bugat","above 2 for k  detected 1"+ l);
					for(int k=0;k<=(i);k++){
						Log.d("tracing_bugat","2 for k area3 detected 1"+ words[k]);
					if((Arrays.asList(southEastasia).contains(words[k]))||(Arrays.asList(southwestpacific).contains(words[k]))||
								(Arrays.asList(SouthAsian_subcontinent).contains(words[k]))||(Arrays.asList(Japan_Korea_subarea).contains(words[k]))){
						Log.d("tracing_bugat","2 if k area3 detected 1"+ words[k]);
						m++;
						}
					}
					Log.d("tracing_bugat","2  k area3 detected 1"+ l+" m "+m);
					Log.d("tracing_bugat","ffff l "+ l+" m "+m +" ll "+ll+" mm "+mm);
					if(((m+l+1)==limitArray)||((mm+ll+2)==limitArray)){
						tv2.setText("AT");
						Log.d("TS","at set ");
						at=1;
					}
					}
			
			
			}
			Log.d("tracing_bugat","2  k area3 detected 1 "+ l+" m "+m);
			//area1 lax del area3
			if(i>=1){
			if((Arrays.asList(us_canda).contains(words[i-1]))){
				Log.d("tracing_bugat","us_canda detected 2"+ words[i-1]);
				
					for(int k=0;k<=(i-1);k++){
						Log.d("tracing_bugat","a2 1 for k area1 detected 1"+ words[k]);
					if((Arrays.asList(midAtlantic_SubArea).contains(words[k]))||(Arrays.asList(NorthAmerica).contains(words[k]))||
			(Arrays.asList(carrebeanArea).contains(words[k]))||(Arrays.asList(carreabeanIsland).contains(words[k]))
			||(Arrays.asList(southAmerica).contains(words[k]))||(Arrays.asList(southAtlantic_SubArea).contains(words[k]))||
			(Arrays.asList(northAtlantic_SubArea).contains(words[k]))||
						(Arrays.asList(CentralAmerica).contains(words[k]))){
						ll++;
						}
					}
					for(int k=i+1;k<limitArray;k++){
						Log.d("tracing_bugat","a2 2 for k area1 detected 1"+ k);
					if((Arrays.asList(southEastasia).contains(words[k]))||(Arrays.asList(southwestpacific).contains(words[k]))||
								(Arrays.asList(SouthAsian_subcontinent).contains(words[k]))||(Arrays.asList(Japan_Korea_subarea).contains(words[k]))){
						Log.d("tracing_bugat","a2 2 for k asia detected 1"+ words[k]);
						mm++;
						}
					}
					Log.d("tracing_bugat","ffff l "+ l+" m "+m +" ll "+ll+" mm "+mm);
					if(((m+l+2)==limitArray)||((mm+ll+1)==limitArray)){
						tv2.setText("AT");
						Log.d("at","at set ");
						at=1;
					}
					}
		
			}
			
					
					}
					}

}
public void pacificNorthJourney(){
	b=0;int bb=1,bbb=0,bbbb=0;int dd=1,ddd=0,dddd=0;
	Log.d("pnbug", "entered");
	if(((Arrays.asList(southAmerica).contains(initialPlace))&&(Arrays.asList(southwestpacific).contains(finalPlace)))||((Arrays.asList(southAmerica).contains(finalPlace))&&(Arrays.asList(southwestpacific).contains(initialPlace)))){
		Log.d("pnbug", "if entered");
		for(int i=1;i<limitArray-1;i++){
			Log.d("pnbug1", "for loop entered");
			
			if((Arrays.asList(southAmerica).contains(words[i]))){
				bb++;
				Log.d("pnbug", "for loop entered bb "+bb+"word[i] "+words[i]);
			}
		}
		Log.d("pnbug2", bb+"for loop entered");
		for(int i=bb;i<limitArray-1;i++){
			Log.d("pnbug2", "for loop entered");
			
			if((Arrays.asList(NorthAmerica).contains(words[i]))){
				bbb++;
				Log.d("pnbug", "for loop entered bbb "+bbb+"word[i] "+words[i]);
			}
		}
		for(int i=(bbb+bb);i<limitArray-1;i++){
			Log.d("pnbug3", "for loop entered");
			
			if((Arrays.asList(southwestpacific).contains(words[i]))){
				bbbb++;
				Log.d("pnbug", "for loop entered b "+b+"word[i] "+words[i]);
			}
		}
		//////////reverse pn
		for(int i=1;i<limitArray-1;i++){
			Log.d("pnbug1", "for loop entered");
			
			if((Arrays.asList(southwestpacific).contains(words[i]))){
				dd++;
				Log.d("pnbug", "for loop entered dd "+dd+"word[i] "+words[i]);
			}
		}
		Log.d("pnbug2", dd+"for loop entered");
		for(int i=dd;i<limitArray-1;i++){
			Log.d("pnbug2", "for loop entered");
			
			if((Arrays.asList(NorthAmerica).contains(words[i]))){
				ddd++;
				Log.d("pnbug2", "for loop entered ddd "+ddd+"word[i] "+words[i]);
			}
		}
		int ddddd=ddd+dd;
		for(int i=ddddd;i<(limitArray-1);i++){
			Log.d("pnbug3",ddd+"ddd"+dd+"dd for loop entered");
			Log.d("pnbug3",(words[i])+" i for loop entered");
			if((Arrays.asList(southAmerica).contains(words[i]))){
				dddd++;
				Log.d("pnbug3", "for loop entered dd "+dddd+"word[i] "+words[i]);
			}
		}
		
		
		///////////
		Log.d("pnbug", "above txt entered bbb "+bbb+"ddd"+ddd+" limitArray "+limitArray);
		if(((limitArray>2)&&(bbb!=0))||((limitArray>2)&&(ddd!=0))){
		if(((bb+bbb+bbbb)==(limitArray-1))||((dd+ddd+dddd)==(limitArray-1))){
			tv2.setText("PN");
			pn=1;
			Log.d("pnbug", "if txt entered b "+b+" limitArray "+limitArray);
		}}
	}
	pacificRouth();
}
public void pacificRouth(){
	Log.d("bug_pa", "pa entered");
	int bpa1=0,bpa2=0,pac1=0,pac2=0;
	if((at==0)&&(pn==0)){
		Log.d("bug_pa", " not at pn -> pa entered");
		for(int i=0;i<limitArray-1;i++){
			if(((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
					(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
					(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
					(Arrays.asList(southAtlantic_SubArea).contains(words[i])))&&
					((Arrays.asList(southEastasia).contains(words[i+1]))
							||Arrays.asList(Japan_Korea_subarea).contains(words[i+1])
							||Arrays.asList(SouthAsian_subcontinent).contains(words[i+1])
							||Arrays.asList(southwestpacific).contains(words[i+1]))){
				
				bpa1=i+1;
				Log.d("bug_pa", "bpa1 "+bpa1);
				
			}
		}
		Log.d("bug_pa", "bpa1 exit "+bpa1);
		for(int i=0;i<limitArray-1;i++){
			Log.d("bug_pa", "for bpa2 i "+i);
			if(((Arrays.asList(NorthAmerica).contains(words[i+1]))||(Arrays.asList(CentralAmerica).contains(words[i+1]))||
					(Arrays.asList(carreabeanIsland).contains(words[i+1]))||(Arrays.asList(southAmerica).contains(words[i+1]))||
					(Arrays.asList(northAtlantic_SubArea).contains(words[i+1]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i+1]))||
					(Arrays.asList(southAtlantic_SubArea).contains(words[i+1])))&&
					((Arrays.asList(southEastasia).contains(words[i]))
							||Arrays.asList(Japan_Korea_subarea).contains(words[i])
							||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
							||Arrays.asList(southwestpacific).contains(words[i]))){
				
				bpa2=i+1;
				Log.d("bug_pa", "bpa2 "+bpa2);
				
			}
		}
		Log.d("bug_pa", "bpa2 exit "+bpa2);
		if(bpa1>0){
			Log.d("bug_pa", "if bpa1>0 "+bpa1);
			for(int i=0;i<bpa1;i++){
				Log.d("bug_pa", "for bpa1>0 "+bpa1);
				if(((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
						(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
						(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
						(Arrays.asList(southAtlantic_SubArea).contains(words[i])))){
					pac1++;
					Log.d("bug_pa", "pac1 "+pac1);
				}
			}
			if(pac1==bpa1){
				Log.d("bug_pa", "pac1=bpa1 "+bpa1);
				for(int i=bpa1+1;i<limitArray;i++){
					Log.d("bug_pa", "for pac1=bpa1 "+bpa1);
					if((Arrays.asList(southEastasia).contains(words[i]))
							||Arrays.asList(Japan_Korea_subarea).contains(words[i])
							||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
							||Arrays.asList(southwestpacific).contains(words[i])){
						pac2++;
						Log.d("bug_pa", "pac2 "+pac2);
						
					}
				}
				Log.d("bug_pa", "pac2 "+pac2+"limitArray-bpa1 "+limitArray+"-"+bpa1);
				if(pac2==(limitArray-bpa1-1)){
					tv2.setText("PA");
				}
			}
		}
		pac1=0;
		pac2=0;
		Log.d("bug_pa", "if bpa2>0 "+bpa2);
		if(bpa2>0){
			for(int i=0;i<bpa2;i++){
				if((Arrays.asList(southEastasia).contains(words[i]))
						||Arrays.asList(Japan_Korea_subarea).contains(words[i])
						||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
						||Arrays.asList(southwestpacific).contains(words[i])){
					pac1++;
					Log.d("bug_pa", "pac1 "+pac1);
					
				}
			}
			Log.d("bug_pa", "pac1==bpa2-1 "+pac1+" bpa2 "+bpa2);
			if(pac1==bpa2){
				for(int i=bpa2;i<limitArray;i++){
					if(((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
							(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
							(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
							(Arrays.asList(southAtlantic_SubArea).contains(words[i])))){
						pac2++;
						Log.d("bug_pa", "pac2 "+pac2);
						
					}
				}
				Log.d("bug_pa", "pac2== "+pac2+" bpa2 "+bpa2+" limitArray "+limitArray);
				if(pac2==(limitArray-bpa2)){
					tv2.setText("PA");
				}
			}
			
		}
	}
	Log.d("pabug", "pa bug exit");
	atlanticPacific();
}
public void atlanticPacific(){
	int c=0,cc=0,ccc=0;
	for(int i=0;i<limitArray-1;i++){
	if(((Arrays.asList(europe).contains(words[i]))||(Arrays.asList(europeancomm_aviaArea).contains(words[i]))||
			(Arrays.asList(europeancomm_monit).contains(words[i]))||(Arrays.asList(central_africa).contains(words[i]))
			||(Arrays.asList(eastern_africa).contains(words[i]))||(Arrays.asList(southern_africa).contains(words[i]))
			||(Arrays.asList(indian_oceanisland).contains(words[i]))||(Arrays.asList(western_africa).contains(words[i]))
			||(Arrays.asList(middleEast).contains(words[i])))&&((Arrays.asList(NorthAmerica).contains(words[i+1]))||(Arrays.asList(CentralAmerica).contains(words[i+1]))||
					(Arrays.asList(carreabeanIsland).contains(words[i+1]))||(Arrays.asList(southAmerica).contains(words[i+1]))||
					(Arrays.asList(northAtlantic_SubArea).contains(words[i+1]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i+1]))||
					(Arrays.asList(southAtlantic_SubArea).contains(words[i+1])))){
		
		for(int k=0;k<=i;k++){
			if(((Arrays.asList(europe).contains(words[k]))||(Arrays.asList(europeancomm_aviaArea).contains(words[k]))||
					(Arrays.asList(europeancomm_monit).contains(words[k]))||(Arrays.asList(central_africa).contains(words[k]))
					||(Arrays.asList(eastern_africa).contains(words[k]))||(Arrays.asList(southern_africa).contains(words[k]))
					||(Arrays.asList(indian_oceanisland).contains(words[k]))||(Arrays.asList(western_africa).contains(words[k]))
					||(Arrays.asList(middleEast).contains(words[k])))){
				c++;
				Log.d("bug_ap", "ap set c "+c);
				
			}
		}
		for(int k=i+1;k<limitArray;k++){
			if((Arrays.asList(NorthAmerica).contains(words[k]))||(Arrays.asList(CentralAmerica).contains(words[k]))||
					(Arrays.asList(carreabeanIsland).contains(words[k]))||(Arrays.asList(southAmerica).contains(words[k]))||
					(Arrays.asList(northAtlantic_SubArea).contains(words[k]))||(Arrays.asList(midAtlantic_SubArea).contains(words[k]))||
					(Arrays.asList(southAtlantic_SubArea).contains(words[k]))){
				cc++;
				Log.d("bug_ap", "ap set cc "+cc);
				
			}
		}
		if((c+cc)<limitArray){
			for(int k=(c+cc);k<limitArray;k++){
			if((Arrays.asList(southEastasia).contains(words[k]))
					||Arrays.asList(Japan_Korea_subarea).contains(words[k])
					||Arrays.asList(SouthAsian_subcontinent).contains(words[k])
					||Arrays.asList(southwestpacific).contains(words[k])){
				ccc++;
				Log.d("bug_ap", "ap set ccc "+ccc);
				
			}}
			if((c+cc+ccc)==limitArray){
				tv2.setText("AP");
				Log.d("bug_ap", "ap set");
			}
		}
		
	}
	
	}
	Log.d("bug-ap", "exit ap set");
	/***************************rev ap*****************************/
	for(int i=0;i<limitArray-1;i++){
		Log.d("bug-ap-rev", "enter ap set");
		if(((Arrays.asList(southEastasia).contains(words[i]))
				||Arrays.asList(Japan_Korea_subarea).contains(words[i])
				||Arrays.asList(SouthAsian_subcontinent).contains(words[i])
				||Arrays.asList(southwestpacific).contains(words[i]))&&((Arrays.asList(NorthAmerica).contains(words[i+1]))||(Arrays.asList(CentralAmerica).contains(words[i+1]))||
						(Arrays.asList(carreabeanIsland).contains(words[i+1]))||(Arrays.asList(southAmerica).contains(words[i+1]))||
						(Arrays.asList(northAtlantic_SubArea).contains(words[i+1]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i+1]))||
						(Arrays.asList(southAtlantic_SubArea).contains(words[i+1])))){
			
			for(int k=0;k<=i;k++){
				if((Arrays.asList(southEastasia).contains(words[k]))
						||Arrays.asList(Japan_Korea_subarea).contains(words[k])
						||Arrays.asList(SouthAsian_subcontinent).contains(words[k])
						||Arrays.asList(southwestpacific).contains(words[k])){
					c++;
					Log.d("bug_ap_rev", "ap set c "+c);
					
				}
			}
			for(int k=i+1;k<limitArray;k++){
				if((Arrays.asList(NorthAmerica).contains(words[k]))||(Arrays.asList(CentralAmerica).contains(words[k]))||
						(Arrays.asList(carreabeanIsland).contains(words[k]))||(Arrays.asList(southAmerica).contains(words[k]))||
						(Arrays.asList(northAtlantic_SubArea).contains(words[k]))||(Arrays.asList(midAtlantic_SubArea).contains(words[k]))||
						(Arrays.asList(southAtlantic_SubArea).contains(words[k]))){
					cc++;
					Log.d("bug_ap_rev", "ap set cc "+cc);
					
				}
			}
			if((c+cc)<limitArray){
				for(int k=(c+cc);k<limitArray;k++){
				if(((Arrays.asList(europe).contains(words[k]))||(Arrays.asList(europeancomm_aviaArea).contains(words[k]))||
						(Arrays.asList(europeancomm_monit).contains(words[k]))||(Arrays.asList(central_africa).contains(words[k]))
						||(Arrays.asList(eastern_africa).contains(words[k]))||(Arrays.asList(southern_africa).contains(words[k]))
						||(Arrays.asList(indian_oceanisland).contains(words[k]))||(Arrays.asList(western_africa).contains(words[k]))
						||(Arrays.asList(middleEast).contains(words[k])))){
					ccc++;
					Log.d("bug_ap", "ap set ccc "+ccc);
					
				}}
				if((c+cc+ccc)==limitArray){
					tv2.setText("AP");
					Log.d("bug_ap_rev", "ap set");
				}
			}
			
		}
		
		}
	westernhemisp();
}
public void westernhemisp(){
	int c=0;
	for(int i=0;i<limitArray;i++){
if((Arrays.asList(NorthAmerica).contains(words[i]))||(Arrays.asList(CentralAmerica).contains(words[i]))||
		(Arrays.asList(carreabeanIsland).contains(words[i]))||(Arrays.asList(southAmerica).contains(words[i]))||
		(Arrays.asList(northAtlantic_SubArea).contains(words[i]))||(Arrays.asList(midAtlantic_SubArea).contains(words[i]))||
		(Arrays.asList(southAtlantic_SubArea).contains(words[i]))){
	c++;
	Log.d("bug_wh", "wh c "+c);
	
}}
	if(c==limitArray){
		tv2.setText("WH");
	}
}
private void loadSpinnerData() {
	 
	
	
   ListAdapter dataAdapter = new CustomList2(this, words);
    
    lv1.setAdapter(dataAdapter);
	               
}
/*private List<String> getAllLabels() {
	
    List<String> labels = new ArrayList<String>();
    labels=words;
    return labels;

}*/
}
