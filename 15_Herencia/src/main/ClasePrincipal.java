package main;

import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
	public static void main (String[]args) {
		
		ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
		mensajeroSuma.PedirDatos();
		mensajeroSuma.Sumar();
		System.out.println("El resultado de la sumas es: ");
		mensajeroSuma.MostrarResultado();
		
		
		ClaseHija_Resta mensajeroResta = new ClaseHija_Resta ();
		mensajeroResta.PedirDatos();
		mensajeroResta.Restar();
		System.out.println("El resultado de tu resta: ");
		mensajeroResta.MostrarResultado();
	}

}
