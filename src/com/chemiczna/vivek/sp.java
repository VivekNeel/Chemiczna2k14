package com.chemiczna.vivek;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class sp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.sp);
		Thread spt = new Thread(){
		public void run(){
			try{
				
				sleep(3000);
			}catch(InterruptedException e){
				
				e.printStackTrace();
			}finally{
				
				Intent spr = new Intent("com.chemiczna.vivek.MENU");
				startActivity(spr);
			}
		}
		};
			spt.start();
			
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	

}
