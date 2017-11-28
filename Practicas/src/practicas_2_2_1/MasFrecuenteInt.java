package practicas_2_2_1;

import java.util.Arrays;

/**
 * MasFrecuenteInt.java
 * Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros. 
 * Devuelve el valor del elemento más frecuente, si hay coincidencia devolvería el primero de ellos.
 * Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} devolvería 4
 * Una forma sería recorrer el vector anidar un bucle que averigüe la frecuencia del valor de cada elemento 
 * utilizando un par de variables auxiliares para retener la frecuencia máxima y el valor asociado.
 * @author dam17-06 - 2017.11.22
 */

public class MasFrecuenteInt {

	public static int masFrecuenteInt(int[] array) {
		
	
		int x;
		int frecuencia = 1;
		int num = 0;
		int nummayor = 0;
		int frecuenciamayor = 1;
		
		Arrays.sort(array);
		
		for (x = 1; x < array.length; x++) {
			for (int y = 0; y < array.length; y++) {
				if ((array[x]) == array[x-1]) {
					frecuencia++;
					if(num != array[x]) {
					if (frecuenciamayor < frecuencia) {
						frecuenciamayor = frecuencia;
						num = array[x];
						
					}
					}
					
				}// 1,1,2,2,3,3,4,4,4,6,6,7,7,7,7,7,7,8,8
			
			}
			
		}
		 
	return num;
	
	}
		
	
	
	
	public static void main(String[] args) {
		int[] array = new int[] {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 9};
		System.out.println(masFrecuenteInt(array));
	}

}
