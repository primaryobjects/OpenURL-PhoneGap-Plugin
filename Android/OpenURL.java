//
//  OpenURL.java
//
//  Created by Kory Becker on 11/08/11.
//
package com.phonegap.openurl;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;

import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import com.phonegap.api.PluginResult.Status;

public class OpenURL extends Plugin {

	public static final String ACTION="open";
	
	@Override
	public PluginResult execute(String arg0, JSONArray arg1, String arg2) {
		PluginResult result = null;
		
		if (ACTION.equals(arg0)) {
			try {
				String url = arg1.getString(0);
				
	    		Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url)); 
	    		ctx.startActivity(myIntent); 
				
				result = new PluginResult(Status.OK, "");
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block				
				e.printStackTrace();
				result = new PluginResult(Status.JSON_EXCEPTION);
			}		
		}
		
		return result;
	}

}
