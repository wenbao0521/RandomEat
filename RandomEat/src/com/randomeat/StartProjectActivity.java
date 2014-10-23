package com.randomeat;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class StartProjectActivity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	super.loadUrl("file:///android_asset/www/index.html");
	 	
		
	}

}
