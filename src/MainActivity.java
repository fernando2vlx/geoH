

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;




public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	public void onListLote(View v) {
		Intent _intent = new Intent(MainActivity.this, ShowLotesActivity.class);
		//Bundle b = new Bundle();

		startActivity(_intent);
	}
	
	/*
	 * Lanzar la Vista Para Crear un Lote
	 */
	public void onCreateLote(View v) {
		Intent _intent = new Intent(MainActivity.this, NewLoteActivity.class);
		//Bundle b = new Bundle();

		startActivity(_intent);
	}
	
	
	/*
	 * Lanza la vista Acerca De
	 */
	public void onAcercaDe(View v) {
		Intent _intent = new Intent(MainActivity.this, AcercaDeActivity.class);
		this.startActivity(_intent);
	}
	
	
	/*
	 * Salir al presionar el boton Salir
	 */
	public void onSalir(View v) {
		AlertDialog.Builder exit_dialog = new AlertDialog.Builder(this);
		exit_dialog.setTitle("Cerrar Aplicacion");
		exit_dialog.setMessage("Desea Salir de la Aplicacion");
		exit_dialog.setCancelable(false);
		exit_dialog.setPositiveButton("Si",
			new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					finish();
					System.exit(0);
				}
			}
		);
		
		exit_dialog.setNegativeButton("No",
			new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();
					
				}
			}
		);
		exit_dialog.show();
	}
	
	
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/
}
