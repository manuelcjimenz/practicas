package practicas_2_2_1;

/**
* FrecuenciaNumero.java
* Escribe un método que se llame frecuenciaNumero() que recibe un vector de enteros y un número. 
* Devuelve la frecuencia entre los elementos del vector del número recibido.
* @author dam17-06 - 2017.11.17
*/

public class FrecuenciaNumero {
	
	public static int frecuenciaNumero(int[] array, int num) {
		
		int frecuencia = 0;		// Variable entera
		int x;					// Variable entera
		
		
		// Recorre los elementos del array
		for (x = 0; x < array.length; x++) {
			
			// Si el numero buscado esta en el array, lo guarda en frecuencia
			if (array[x] == num) {
				frecuencia++;
			}
		}
		// Devuelve frecuencia al metodo
		return frecuencia;
	}
	
	
	public static void main(String arguments[]) {
		int[] array = new int[] {1,1,1,1};		// Declara los elementos del array
		System.out.println(frecuenciaNumero(array,1));	// Llama al metodo
	}
}