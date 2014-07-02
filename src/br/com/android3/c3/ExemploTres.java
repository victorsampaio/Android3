/**
 * 
 */
package br.com.android3.c3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * @author VictorSampaio
 *
 */
public class ExemploTres extends Activity{
	
	@Override
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		
		// Open screen 'layout_exemplo_tres'
		setContentView(R.layout.layout_exemplo_tres);
		
		// Search the ImageView to id
		ImageView img2 =(ImageView) findViewById(R.id.imagem2);
		img2.setImageResource(R.drawable.smile2);
		
		
	}

}
