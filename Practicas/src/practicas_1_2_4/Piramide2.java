package practicas_1_2_4;


/**
* Piramide2.java
* Programa que recibe un numero entero como parámetro y devuelve una cadena de caracteres con el texto formateado de una piramide de asteriscos.
* @author dam17-06 2017.11.07
*/

public class Piramide2 {
	
	public static String piramide2(int tamano) {
		
		// Transforma la variable int en String
		String piramide2 = Integer.toString(tamano);
		
		// Declaracion de variables
		int x2;
	
		for(int x = 1; x <= tamano; x++){

		for(x2 = 0; x2 < tamano - x; x2++)
		{
		System.out.print(' '); //imprime los espacios
		}
		for( ; x2 < (tamano + x) -1; x2++)
		{
		System.out.print('*'); //imprime los asteriscos
		}
		System.out.println(); //cambio de lienea
		}
		
	// Devuelve el valor a String piramide2
	return piramide2;	
	
		}
		
		
	
	public static void main(String arguments[]) {
		piramide2(5);
	}
	}