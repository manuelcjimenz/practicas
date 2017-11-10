package practicas_1_2_4;


/**
* Rombo2.java
* Programa que recibe un número entero como parámetro y devuelve una cadena de caracteres con el texto formateado de un rombo de asteriscos.
* @author dam17-06 2017.11.07
*/

public class Rombo2 {
	
	public static String rombo2 (int tamano) {
		
		String rombo2 = Integer.toString(tamano);
	
	
		    
		 for (int i= 1; i<=tamano; i++){
		           for (int espacios = tamano - i; espacios >0; espacios--)      
		                System.out.print(' ');
		                 for (int lineas = 1; lineas < 2 * i; lineas++)
		                   System.out.print('*');
		                    System.out.println("");
		        }
		 for (int i= 4; i>=1; i--){
		       for (int espacios = tamano - i; espacios >0; espacios--)      
		                System.out.print(' ');
		                 for (int lineas = 1; lineas < 2 * i; lineas++)
		                   System.out.print('*');
		                    System.out.println("");
		        }
		 return rombo2;
		    } 
		
	public static void main(String arguments[]) {
		rombo2(5);
	}
	}