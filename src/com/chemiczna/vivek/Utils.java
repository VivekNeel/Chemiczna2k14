package com.chemiczna.vivek;

import android.content.Context;
import android.content.pm.PackageManager;



public class Utils
{
	
	public static boolean isPackageInstalled(String packageName, Context context)
	{
		PackageManager pm = context.getPackageManager();
		
		try {
			pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
			return true;
		}
		catch (PackageManager.NameNotFoundException e) {
			return false;
		}
	}
}