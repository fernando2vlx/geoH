package com.k369.geoh.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
	private static final String DB_NAME="geoH.sqlite";
	private static final int DB_VERSION=1;	
	private static String TBL_INSTITUCIONES="Instituciones";
	private static String SQL_TBL_INSTITUCIONES = "CREATE TABLE Instituciones (" + 
		"id_inst INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE," + 
		"nombre_inst VARCHAR(45), direccion_inst VARCHAR(100), tipo_inst VARCHAR(15)," + 
		"telefono_inst VARCHAR(22), telefono_alt_inst VARCHAR(22), emai_inst VARCHAR(30)," +
		"website_inst VARCHAR(30), ciuidad_inst VARCHAR(30), provincia_inst VARCHAR(30)," +
		"horario_atencion_inst TEXT, obras_sociales_inst TEXT, gps_latitud_inst REAL," +
		"gps_longitud_inst REAL)";
	
	
	public DataBaseHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
	}
	
	
	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		db.execSQL(SQL_TBL_INSTITUCIONES);
		
	}
	

	@Override
	public void onUpgrade(SQLiteDatabase db, int old_version, int new_vesion) 
	{
		//borrar todo y crear la Base de Datos de Nuevo
		db.execSQL("DROP TABLE IF EXIST " + this.TBL_INSTITUCIONES);		 
		onCreate(db);
	}
	
}
