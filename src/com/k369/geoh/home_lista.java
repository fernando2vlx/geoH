package com.k369.geoh;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class home_lista extends Activity
{
   private Button maps, rangeout,rangein, buscar;
   private ListAdapter adaptador_instituciones;
   private ListView lista_instituciones;
   private String[] db_instituciones; 
   
   public void onCreate(Bundle savedInstance)
   {
	   super.onCreate(savedInstance);
	   setContentView(R.layout.home_lista);
	   db_instituciones=null;
	   maps = (Button) findViewById(R.id.maps);
	   rangeout= (Button) findViewById(R.id.rangeout);
	   rangein=(Button) findViewById(R.id.rangein);
	   buscar=(Button) findViewById(R.id.buscar);
	   
	   
	   //prueba
	   setInstituciones(new String[] {"uno","dos","tres","cuatro","cinco","seis","siete","ocho"});
	   createAdapterInst();
   }
   
   public void setInstituciones(String[] inst)
   {
	   db_instituciones=inst;
   }
   
   public void createAdapterInst()
   {
	   if(db_instituciones != null)
	   {
		   adaptador_instituciones=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,db_instituciones);
		   lista_instituciones = (ListView)findViewById(R.id.lista_instituciones);
		   lista_instituciones.setAdapter(adaptador_instituciones);
		   
	   }
   }
}
