package practicas_1_2_4;

import java.util.Scanner;

/**
* Multiplo4.java
* Crea una sola clase llamada Multiplo4.
* En main(), escribe la llamada:
* mostrarMultiplos2(pedirTope());.
* ajs. 2017.10.25
*/


public class Multiplo4 	{
	
	public static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame el tope");
		int tope = teclado.nextInt();
		teclado.close();
		return tope;
		}
	
	
	public static void mostrarMultiplos4(int tope) {

		// Declaración de variables
	
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < tope)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

	
		public static void main(String argumentos[]) {
			mostrarMultiplos4(pedirTope());
		}
		
	}


