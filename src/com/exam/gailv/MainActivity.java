package com.exam.gailv;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	
	private TabHost tabHost; 
    
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost = this.getTabHost(); 
		tabHost.addTab(tabHost.newTabSpec("试题").setIndicator("试题").setContent(new Intent(this,ExamActivity.class)));
		tabHost.addTab(tabHost.newTabSpec("个人中心").setIndicator("个人中心").setContent(new Intent(this,MyIndexActivity.class)));
		tabHost.addTab(tabHost.newTabSpec("更多").setIndicator("更多").setContent(new Intent(this,MoreActivity.class)));
		
		RadioGroup radioGroup = (RadioGroup) this.findViewById(R.id.rg_main_tabs); 
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub

				switch (checkedId){
				case R.id.rb_main_tab1:
					tabHost.setCurrentTabByTag("试题");
					break;
				case R.id.rb_main_tab2:
					tabHost.setCurrentTabByTag("个人中心");
					break;
				case R.id.rb_main_tab3:
					tabHost.setCurrentTabByTag("更多");
					break;
			    }
				
			}
		});}
	protected void onResume() {
		super.onResume();
		
		 }
	protected void onPause()
	  {
	    super.onPause();
	   
	  }


}	
		
	        	
	        	
	        	
	        	
	        	
	         		
			
			
			
		
		
				
				
				
			
		
	

	
	

