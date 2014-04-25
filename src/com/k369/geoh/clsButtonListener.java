package com.k369.geoh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;

public class clsButtonListener implements OnClickListener
{

	private final int btnMaps,btnSearch,btnRangeOut,btnRangeIn;
	private Context context;
	
	public clsButtonListener(Context c,int m,int s,int ro,int ri)
	{
		context=c;
		btnMaps=m;
		btnSearch=s;
		btnRangeOut=ro;
		btnRangeIn=ri;
	}
	
	public void onClick(DialogInterface bt, int arg1)
	{
	   Button btn = (Button) bt;
	  
	   if(btn.getId()==btnSearch)
	   {
		   
	   }
	
	}

}
