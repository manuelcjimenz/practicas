package practicas_1_2_4;



/**
* Escribe un programa que muestre las tablas de multiplicar.
* Para la visualización utiliza un método llamado calcularMostrarTabla().java
* @author dam17-06 2017.10.25
*/


public class Tablas_Multiplicar	{
	
	public static void calcularMostrarTabla(int num){
		


		// Declaración de variables
	
		int mult = 0;							// Almacena el múltiplo calculado
		int cont = 0;							// Contador utilizado en el cálculo
		final int tope = 15;
	
		
		System.out.println("\t Multiplos de" + " " + num);
		while (mult < tope)		// Bucle de cálculo y visualización
		{
			mult = cont * num;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

	
		public static void main(String argumentos[]) {
			calcularMostrarTabla(5);	// Llama al metodo
		}
		
	}

