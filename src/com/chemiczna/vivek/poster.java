package com.chemiczna.vivek;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class poster extends Activity {
	
	Button reg , more ;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.poster);
		reg = (Button) findViewById(R.id.button6);
		more = (Button) findViewById(R.id.button7);
		reg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent re = new Intent (android.content.Intent.ACTION_SEND);
				re.putExtra(android.content.Intent.EXTRA_EMAIL, new String[] 
						{getResources().getString(R.string.email_address)});
				re.putExtra(android.content.Intent.EXTRA_SUBJECT, 
						getResources().getText(R.string.email_subject));
				re.putExtra(android.content.Intent.EXTRA_TEXT ,
						getResources().getText(R.string.email_subject3));
			
				re.setType("plain/text");
				startActivity(Intent.createChooser(re, "Contact Event Incharge"));
				
			}
		});
		
		more.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent mo = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.chemiczna2k14.com/"));
				startActivity(mo);
				
				
			}
		});
		
		
	}
	
	

}
