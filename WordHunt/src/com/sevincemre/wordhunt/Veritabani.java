package com.sevincemre.wordhunt;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class Veritabani extends SQLiteOpenHelper {

	private static final String VERITABANI_ADI = "ScoreDatabase";
	private static final int SURUM = 1;
	
	public Veritabani(Context context) {
		super(context, VERITABANI_ADI, null, SURUM);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE scores (id INTEGER PRIMARY KEY AUTOINCREMENT, score INTEGER)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(Veritabani.class.getName(),
			        "Upgrading database from version " + oldVersion + " to "
			            + newVersion + ", which will destroy all old data");
	    db.execSQL("DROP TABLE IF EXISTS scores");
		onCreate(db);
	}
	
	public static Cursor verileriCek()
	{
		veritabaniniDuzenle();
		SQLiteDatabase db = BaslangicAktivity.veritabaný.getReadableDatabase();
		Cursor okunanlar = db.rawQuery("select distinct score from scores",null);
		//db.close();
		return okunanlar;
	}
	
	public static void veritabaniniDuzenle()
	{
		SQLiteDatabase db = BaslangicAktivity.veritabaný.getWritableDatabase();
		Cursor cur = db.rawQuery("select score from scores", null);
		int sayi = cur.getCount();
		if(sayi > 3){
		db.execSQL("DELETE FROM scores WHERE score NOT IN " +
				"(SELECT score FROM scores ORDER BY score DESC LIMIT 0,3);");
		}
		cur = db.rawQuery("select score from scores", null);
		db.close();
	}
	
	public static void degerEkle(int deger)
	{
		String str = "select score from scores where score = "+deger;
		SQLiteDatabase rdb = BaslangicAktivity.veritabaný.getReadableDatabase();
		Cursor cr = rdb.rawQuery(str, null);
		if(cr.getCount()<1){
			String commnd = "insert into scores (score) values ('"+deger+"');";
			SQLiteDatabase dbs = BaslangicAktivity.veritabaný.getWritableDatabase();
			dbs.execSQL(commnd);
		}
	}

}
