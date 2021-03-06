package practicas_1_2_4;



/**
* Multiplo1.java
* Programa que escribe en pantalla los multiplos de 2 por debajo de un TOPE, 16.
* @author dam17-06 2017.10.25
*/


public class Multiplo1 	{
	
	public static void mostrarMultiplos1() {

		// Declaración de variables
		final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		
	}
		public static void main(String argumentos[]) {
			mostrarMultiplos1();
		}
}
