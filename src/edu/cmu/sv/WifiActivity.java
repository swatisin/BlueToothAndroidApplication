package edu.cmu.sv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class WifiActivity extends Activity {
 
	Button bluetoothScreenButton;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wifi_main);
		addListenerOnButton();
	}
	 public void addListenerOnButton() {
		   
			final Context context = this;

			bluetoothScreenButton = (Button) findViewById(R.id.bluetooth);

			bluetoothScreenButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {

				    Intent intent = new Intent(context, MainActivity.class);
	                           startActivity(intent);   

				}

			});

		}
	 
 
}