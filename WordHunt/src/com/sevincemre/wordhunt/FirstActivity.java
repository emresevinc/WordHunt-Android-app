package com.sevincemre.wordhunt;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Random;
import java.util.Set;

import android.app.Activity;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class FirstActivity extends Activity {

    private EditText kelimeTexti;
    private TextView turkceKelimeTexti;
    private TextView puanTexti;
    private TextView countDownTimer;
    Random randomator= new Random();
    private Map <String,String> myMap = null;
    int puan = 0;
    boolean ipucuIstemismi = false;
    MediaPlayer mp;
    CountDownTimer cdt;
    long kalanSure, baslangicSuresi=30000;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        
        tanimlamalariYap();
        
        final Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b1.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b2.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b3.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b4.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b5.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b6.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b7.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b8.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b9.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b10.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b11.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b12 = (Button) findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b12.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b13 = (Button) findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b13.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b14 = (Button) findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b14.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b15 = (Button) findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b15.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b16 = (Button) findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b16.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b17 = (Button) findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b17.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b18 = (Button) findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b18.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b19.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b20.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b221 = (Button) findViewById(R.id.button21);
        b221.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b221.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b22 = (Button) findViewById(R.id.button22);
        b22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b22.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b23 = (Button) findViewById(R.id.button23);
        b23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b23.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b24 = (Button) findViewById(R.id.button24);
        b24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b24.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button b25 = (Button) findViewById(R.id.button25);
        b25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String textTemp =kelimeTexti.getText().toString() +b25.getText();
				kelimeTexti.setText(textTemp);
			}
		});
        final Button bSil = (Button) findViewById(R.id.buttonSil);
        bSil.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int i = kelimeTexti.getText().length();
				if (i>0) {
					String temp = kelimeTexti.getText().toString();
					kelimeTexti.setText(temp.substring(0, i-1));
				}
			}
		});
        final Button bIpucu = (Button) findViewById(R.id.buttonIpUcu);
        bIpucu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				ipucuIstemismi = true;
				String key = turkceKelimeTexti.getText().toString();
				String value = myMap.get(key).toString();
				int uzunluk = value.length();
				Toast.makeText(getApplicationContext(), "Word Length : "+String.valueOf(uzunluk), Toast.LENGTH_LONG).show();
			}
		});
        elemanlarýEkle();
        kelimeBelirle();
        
        kelimeTexti.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				String keyKelime = turkceKelimeTexti.getText().toString();
				String valueKelime = myMap.get(keyKelime);
				String girilenKelime = kelimeTexti.getText().toString();
				
				if (girilenKelime.equals(valueKelime)) {
					mp.start();
					Toast.makeText(getApplicationContext(), "It's true.", Toast.LENGTH_LONG).show();
					kelimeTexti.setText("");
					puanVesureEkle();
					if(myMap.size()>1)
					{
						myMap.remove(keyKelime);
						kelimeBelirle();
					}else
					{
						Toast.makeText(getApplicationContext(), "Oyun bitti, yeni oyuna baþlayýn.", Toast.LENGTH_LONG).show();
						elemanlarýEkle();
						kelimeBelirle();
						puanTexti.setText("Puan : 0");
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				
			}
		});
       
        createCountDownTimer();

		//cdt.start();
    }
	
	private void puanVesureEkle() {
		if (ipucuIstemismi) {
			puan+=3;
			puanTexti.setText("Puan : "+ String.valueOf(puan));
		}else {
			puan+=5;
			puanTexti.setText("Puan : "+ String.valueOf(puan));
		}
		ipucuIstemismi = false;
		cdt.cancel();
		baslangicSuresi = kalanSure + 7000;
		createCountDownTimer();
	}
	
	List liste;Set set;
	Boolean bln = true;
	private void kelimeBelirle() {
	  if(myMap.size()>0){
		if(bln){
			liste = new ArrayList<String>();
			bln = false;
		}
		liste.clear();
		set = myMap.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			liste.add(it.next());
		}
		int i = randomator.nextInt(liste.size());
		String text = liste.get(i).toString();
		turkceKelimeTexti.setText(text);
	  }
	}

	private void elemanlarýEkle() { // oyun içinde sorulacak kelimeler
		myMap = new HashMap<String, String>();
		myMap.put("haricinde, dýþýnda","EXCEPT");
		myMap.put("baþarý","SUCCESS");
		myMap.put("dev, kocaman","HUGE");
		myMap.put("ilgi","INVOLVEMENT");
		myMap.put("gerekli","NECESSARY");
		myMap.put("anlam","MEANING");
		myMap.put("içerik","CONTENT");
		myMap.put("ayýrt etmek","DISTUNGUISH");
		myMap.put("var olan, mevcut","EXISTING");
	}
	@Override
	protected void onPause() {
		super.onPause();
		mp.release();
		cdt.cancel();
		finish();
	}
	
	private void tanimlamalariYap() // Component id eþleþtirmelerini burada yap...
	{
		kelimeTexti = (EditText) findViewById(R.id.kelimeTexti);
        turkceKelimeTexti = (TextView)findViewById(R.id.turkceKelimeTexti);
        puanTexti = (TextView) findViewById(R.id.puanTexti);
        mp = MediaPlayer.create(FirstActivity.this, R.raw.true_auido);
        countDownTimer = (TextView) findViewById(R.id.countDownTextView);
	}
	
	
	public void createCountDownTimer()
	{
        cdt = new CountDownTimer(baslangicSuresi,1000) {
    		
    		@Override
    		public void onTick(long millisUntilFinished) {
    			countDownTimer.setText("Kalan : "+millisUntilFinished/1000);
    			kalanSure = millisUntilFinished;
    		}
		
    		@Override
    		public void onFinish() {
    			Cursor okunanlar = Veritabani.verileriCek();
    			int yapilanPuan = Integer.valueOf(puanTexti.getText().toString().substring(7));
    			if(okunanlar.getCount()<4)
    			{
    				BaslangicAktivity.veritabaný.degerEkle(yapilanPuan);
    				Toast.makeText(getApplicationContext(), "Congratulations!", Toast.LENGTH_LONG);
    			}
    			else
    			{
    				int okunanPuan;
    				while(okunanlar.moveToNext())
    				{
    					okunanPuan = okunanlar.getInt(okunanlar.getColumnIndex("score"));
						if(yapilanPuan > okunanPuan ){
							BaslangicAktivity.veritabaný.degerEkle(yapilanPuan);
							Toast.makeText(getApplicationContext(), "Congratulations!", Toast.LENGTH_LONG);
							break;
						}
    				}
    			}
    			Veritabani.veritabaniniDuzenle();
    			finish();
    		}
    	};
		cdt.start();
	}
}
