package practicas_1_2_4;

import java.util.Scanner;

/**
* Multiplo3.java
* Crea un método dentro de la clase que se llame pedirTope(). Este método está especializado en pedir un valor por teclado y devolverlo para ser usado en main().
* Como el tope es ahora variable; habría que modificar la declaración correspondiente para que no sea final.
* @author dam17-06 2017.10.25
*/


public class Multiplo3 	{
	
	public static void pedirTope() {

		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		final int TOPE; 				// Constante, el máximo valor del múltiplo
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;
		
		// Pide que se introduzca el tope
		System.out.println("Introduce el tope de multiplos");
		TOPE = teclado.nextInt();

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}
		public static void main(String argumentos[]) {
			pedirTope();
		}
}
