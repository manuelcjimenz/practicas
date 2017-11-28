package practicas_2_2_1;

/**
 * MaximoIntConsecutivos.java
 * Escribe un método que se llame maximoIntConsecutivos() que recibe un vector de enteros. 
 * Devuelve cuantos valores son consecutivos entre sus elementos. 
 * Si devuelve 1 todos los elementos son diferentes.
 * @author dam17-06 - 2017.11.21
*/

public class MaximoIntConsecutivos {
	
	public static int maximoIntConsecutivos(int[] array) {
	
		int contador = 1;	// Variable entera
		
		// Recorre los elementos del array
		for (int x = 1; x < array.length; x++) {
			
			// Busca los numeros consecutivos y los guarda en contador
			if ((array[x])-1 == array[x-1]) {
			contador++;
			
			}
			
		}
			// Devuelve contador al metodo
			return contador;
	}
	
	public static void main(String arguments[]) {
		int[] array = new int[] {4,8,3,7,0,9,4,3,6};	// Declara los elementos del array
		System.out.println(maximoIntConsecutivos(array));	// Llama al metodo
	}
	
}