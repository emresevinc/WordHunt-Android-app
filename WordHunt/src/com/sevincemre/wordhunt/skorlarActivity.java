package com.sevincemre.wordhunt;

import java.util.Arrays;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;

public class skorlarActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skorlar);
		tanýmlamalariYap();
		skorlariCek();
	}
	
	EditText skorEditTexti1,skorEditTexti2,skorEditTexti3;
	private void tanýmlamalariYap() {
		skorEditTexti1 = (EditText) findViewById(R.id.enIyiSkor);
		skorEditTexti2 = (EditText) findViewById(R.id.enIyiSkor2);
		skorEditTexti3 = (EditText) findViewById(R.id.enIyiSkor3);
	}
	
	
	private int[] puanDizisi = {0,0,0};
	private void skorlariCek() {
		int i = 0;
		Cursor okunanlar = Veritabani.verileriCek();
		if (okunanlar.getCount()>0) {
			while (okunanlar.moveToNext()) {
				int puan = okunanlar.getInt(okunanlar.getColumnIndex("score"));
				puanDizisi[i] = puan;
				i = i + 1;
			}
			Arrays.sort(puanDizisi);
			skorEditTexti1.setText(String.valueOf(puanDizisi[2]));
			skorEditTexti2.setText(String.valueOf(puanDizisi[1]));
			skorEditTexti3.setText(String.valueOf(puanDizisi[0]));
		}
	}
}
