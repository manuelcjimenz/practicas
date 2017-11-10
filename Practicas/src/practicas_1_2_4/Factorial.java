package practicas_1_2_4;



/**
* Factorial.java
* Programa que muestra el factorial de un número leído por teclado.
* Para el cálculo del factorial utiliza un método llamado factorial() que recibe el número para el cálculo y devuelve el resultado.
* @author dam17-06 2017.11.06
*/


public class Factorial 	{
	
	public static void factorial(int num) {

		
		// Declaramos las variables de tipo entero
		int acumulador;
		int factorial = 1;
		
		acumulador = num;
		
		// Si el numero introducido es negativo, no se realiza la factorizacion
		if (num < 0)
			System.out.println("No se puede, el numero introducido es negativo");
		
		// Si el numero es positivo, se realiza la factorizacion
		else {
		while ( num != 0){
			factorial = factorial * num;
			num--;
			
			}
		}
			// Muestra el resultado
			System.out.println("El factorial es" + " " + factorial);	
	}
	
	public static void main(String argumentos[]) {
		factorial(4);
	}
	}