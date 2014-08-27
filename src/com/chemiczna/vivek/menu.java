package com.chemiczna.vivek;


import com.chemiczna.vivek.menu;
import com.chemiczna.vivek.Utils;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class menu extends Activity  {
    Button paper,poster,mystery,idp,treasure,material,cinema,ad,gaming,ev,tquiz ,cquest , workshop , workmodel ,shortfilm , taboo;
	private Object MenuInflator;
	ImageButton abou;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		paper = (Button)findViewById(R.id.testbutton1);
		poster = (Button)findViewById(R.id.testbutton2);
		mystery = (Button)findViewById(R.id.testbutton3);
		idp = (Button)findViewById(R.id.testbutton4);
		treasure = (Button)findViewById(R.id.testbutton5);
		material = (Button)findViewById(R.id.testbutton6);
		cinema = (Button)findViewById(R.id.testbutton7);
		ad = (Button)findViewById(R.id.testbutton8);
		gaming = (Button)findViewById(R.id.testbutton9);
		// new 
		tquiz = (Button)findViewById(R.id.testbutton10);
		cquest = (Button)findViewById(R.id.testbutton11);
		workshop = (Button)findViewById(R.id.testbutton12);
		workmodel = (Button)findViewById(R.id.testbutton13);
		shortfilm = (Button)findViewById(R.id.testbutton14);
		taboo = (Button)findViewById(R.id.testbutton15);
		abou= (ImageButton)findViewById(R.id.fb);
		
		
		
		
		paper.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(menu.this , paper.class);
				startActivity(i);
				
	   	
				
			}
		});
			
			
			
		poster.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stu
				Intent p = new Intent(menu.this , poster.class);
				startActivity(p);
				
			}
		});	
		
		mystery.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent m = new Intent(menu.this , mystery.class);
				startActivity(m);
				
			}
		});
		
		idp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent (menu.this , idp.class);
				startActivity(i);
				
				
			}
		});
		
		treasure.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub 
				Intent t = new Intent(menu.this , treasure.class);
				startActivity(t);
				
				
			}
		});
		
		material.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ma = new Intent(menu.this , material.class);
				startActivity(ma);
				
			}
		});
		
		cinema.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ci = new Intent(menu.this , cinema.class);
				startActivity(ci);
				
			}
		});
		
		ad.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent aa = new Intent(menu.this , adz.class);
				startActivity(aa);
				
			}
		});
		
		gaming.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent gam = new Intent(menu.this , gaming.class);
				startActivity(gam);
				
			}
		});
		
		tquiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent tq = new Intent(menu.this , tquiz.class);
				startActivity(tq);
				
				
			}
		});
		
		cquest.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent cq = new Intent(menu.this , crazy.class);
				startActivity(cq);
				
			}
		});
			workshop.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent wo = new Intent(menu.this , wor.class);
					startActivity(wo);
					
				}
			});
			
			workmodel.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent workk = new Intent(menu.this, workingmodel.class);
					startActivity(workk);
					
				}
			});
			
			shortfilm.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent sh = new Intent(menu.this , shortfilm.class);
					startActivity(sh);
					
				}
			});
			
			taboo.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stubaboo
					Intent tab = new Intent(menu.this , taboo.class);
					startActivity(tab);
					
				}
			});
		}

	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	       
	        MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.men, menu);
	        return true;
	    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch(item.getItemId()){
		
		case R.id.about:
			
			Intent aa = new Intent(menu.this , about.class);
			startActivity(aa);
			break;
			
		case R.id.exit:
			finish();
			break;
			
		 case R.id.share:
     		Intent shareIntent = new Intent(Intent.ACTION_SEND);
     	    shareIntent.setType("text/plain");
     	    shareIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.link));
     	    startActivity(Intent.createChooser(shareIntent, "Share Via :D"));
             break;
			
			
			
			
			
			
		
		
		
		
		
		}

		
		return super.onOptionsItemSelected(item);
	}

	
	
	
	
	}
	

	
	


	
	
			
		
		
	

