package com.sevincemre.wordhunt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaslangicAktivity extends Activity {
	
	Button oyunaBaslaButon,yuksekSkorButon,cikisButon;
	public static Veritabani veritabaný;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.baslangic_ekrani);
		tanimlamalariYap();
		
		oyunaBaslaButon.setOnClickListener(new View.OnClickListener() {
			
			private Intent intent;
			@Override
			public void onClick(View v) {
				intent = new Intent(getApplicationContext(),FirstActivity.class);
				startActivity(intent);
			}
		});
		yuksekSkorButon.setOnClickListener(new View.OnClickListener() {
			private Intent intent;
			@Override
			public void onClick(View arg0) {
				intent = new Intent(getApplicationContext(),skorlarActivity.class);
				startActivity(intent);
			}
		});
		
		cikisButon.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			/*	String delete = "DELETE FROM scores where score in (select score from scores)";
				SQLiteDatabase dbs = BaslangicAktivity.veritabaný.getWritableDatabase();
				dbs.execSQL(delete); */
				finish();
			}
		});
	}

	private void tanimlamalariYap() {
		oyunaBaslaButon = (Button) findViewById(R.id.oyunaBaslaButon);
		yuksekSkorButon = (Button) findViewById(R.id.yuksekSkorButon);
		cikisButon = (Button) findViewById(R.id.cikisButon);
		veritabaný = new Veritabani(this);
	}
}
