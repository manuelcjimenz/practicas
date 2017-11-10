package practicas_1_2_4;


/**
* Multiplo2.java
* Crea un método dentro de la clase que se llame mostrarMultiplos2() especializado en mostrar los múltiplos de 2 hasta el TOPE. Recibe un valor tope como parámetro de entrada..
* @author dam17-06 2017.10.25
*/


public class Multiplo2 	{
	
	public static void mostrarMultiplos2(int TOPE) {

		// Declaración de variables
	
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
			mostrarMultiplos2(16);
		}
}
