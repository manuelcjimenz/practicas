package practicas_2_2_1;

/**
* VectoresIntIguales.java
* Escribe un método que se llame vectoresIntIguales() que recibe dos vectores de enteros. 
* Devuelve true si son iguales.
* Dos vectores son iguales si tienen la misma longitud y los valores, elemento a elemento, son iguales. 
* La segunda condición se puede comprobar con un bucle.
* @author dam17-06 - 2017.11.17
*/

public class VectoresIntIguales {
	
	public static boolean vectoresIntIguales(int[] array, int[] array2) {
		
		int x = 0;					// Variable entera
		boolean iguales = true;		// Variable booleana
		
		
		// Si el tamaño de los array es diferente, devuelve !iguales (false)
		if(array.length != array2.length) {
			return !iguales;
		}
		else {
		// Recorre los elementos del array
		for(x = 0; x < array.length; x++) {
			
			// Si los elementos de los arrays no coinciden, devuelve !iguales (false)
			if (array[x] != array2[x]) {
				return !iguales;
				
				}
			}
		}
		// Devuelve iguales (true)
		return iguales;
	}
	
	
	public static void main(String arguments[]) {
		
		int [] array = new int[] {1,2,3};							// Declara los elementos del array
		int [] array2 = new int[] {1,2,5,4};						// Declara los elementos del array
		System.out.println(vectoresIntIguales(array, array2));		// Llama al metodo
	}
}

