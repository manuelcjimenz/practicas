package practicas_1_2_4;


/**
* Rombo.java
* Programa que recibe un número entero como parámetro y muestra por pantalla un rombo de asteriscos.
* @author dam17-06 2017.11.07
*/

public class Rombo {
	
	public static void rombo(int tamano) {
	
		    
			tamano = (tamano + 1) / 2;
		
		 for (int i= 1; i<=tamano; i++){
		           for (int espacios = tamano - i; espacios >0; espacios--)      
		                System.out.print(' ');
		                 for (int lineas = 1; lineas < 2 * i; lineas++)
		                   System.out.print('*');
		                    System.out.println("");
		        }
		 for (int i= tamano - 1; i>=1; i--){
		       for (int espacios = tamano - i; espacios >0; espacios--)      
		                System.out.print(' ');
		                 for (int lineas = 1; lineas < 2 * i; lineas++)
		                   System.out.print('*');
		                    System.out.println("");
		        }
		    } 
		
	public static void main(String arguments[]) {
		rombo(8);
	}
	}