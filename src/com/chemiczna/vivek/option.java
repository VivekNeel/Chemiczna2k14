package com.chemiczna.vivek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class option extends Activity {
	
	
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stubor
		MenuInflater me = getMenuInflater();
		me.inflate(R.menu.men, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
		case R.id.about: 
			Intent ab = new Intent(option.this ,about.class);
			startActivity(ab);
			return true;
		
		
		
		default:
		return super.onOptionsItemSelected(item);
	}
	
	
	}
	

}
