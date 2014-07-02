/**
 * 
 */
package br.com.android3.c3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author VictorSampaio
 * 
 */
public class ExemploDois extends Activity {
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.layout_exemplo_dois);

		// Create the 'TextView' to display on the screen
		TextView view = new TextView(this);
		view.setText("Example using TextView on Android");
		setContentView(view);

		
	}

}
