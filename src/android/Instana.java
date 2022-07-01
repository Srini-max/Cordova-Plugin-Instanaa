
package com.cordova.Instana;

import org.apache.cordova.*;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import android.net.Uri;
import android.content.ContentUris;

import com.instana.android.Instana;
import com.instana.android.core.InstanaConfig;

public class Instana extends CordovaPlugin {
    private static final String TAG = "InstanaAgent";
    private static final String INIT_CONFIG = "initconfig";
	private static final String SET_SCREEN_NAME = "setscreenname";
    private CallbackContext callback;

  @Override
   public void pluginInitialize() {
        InstanaConfig instanaConfig = new InstanaConfig(
                "2rmPehr3QzeqVXOM_xt51Q",
                "https://eum-green-saas.instana.io/mobile"
        );
        Instana.setup(this, instanaConfig);
		Log.i(TAG, "Initializing ImageCompressor Plugin");
    }

    public boolean execute(final String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        this.callback = callbackContext;      
        if (action.equals(INIT_CONFIG)) {
            initconfig(callbackContext);
        } else if (action.equals(SET_SCREEN_NAME)) {
            setscreenname(data.getString(0));
        } else {
            Log.i(TAG, "This action doesn't exist");
            return false;
        }
        return true;
    }
  
    public void setscreenname(String screenname) {     
		Instana.setView(screenname);
		Log.i(TAG, "Screen Name Captured" + screenname);
		callbackContext.success(compressedBase64);         
    }
}
