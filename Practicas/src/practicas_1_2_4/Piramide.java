package practicas_1_2_4;


/**
* Piramide.java
* Programa que recibe un numero entero como parámetro y muestre por pantalla una pirámide.
* @author dam17-06 2017.11.07
*/

public class Piramide {
	
	public static void piramide(int tamano) {
		
		// Declaracion de variables
		int x2;
	
		for(int x = 1; x <= tamano; x++){

		for(x2 = 0; x2 < tamano - x; x2++)
		{
		System.out.print(' '); // Imprime los espacios
		}
		for( ; x2 < (tamano + x) -1; x2++)
		{
		System.out.print('*'); // Imprime los asteriscos
		}
		System.out.println(); // Cambio de lienea
		}
		}
		
		
	
	public static void main(String arguments[]) {
		piramide(5);	// Llama al metodo
	}
	}