package practicas_1_2_4;



/**
* Inicial.java
* Programa que muestra tus iniciales en la pantalla.
* Cada inicial se compone sobre una celda en pantalla de 7x7:
* @author dam17-06 2017.11.06
*/


public class Inicial 	{
	
	public static void banner() {

		
		// Escribimos los caracteres necesarios para que salga mis iniciales
		System.out.println("M     M         CCCCCCC         JJJJJJJ");
		System.out.println("MM   MM         C                     J");
		System.out.println("M M M M         C                     J");
		System.out.println("M  M  M         C                     J");
		System.out.println("M     M         C               J     J");
		System.out.println("M     M         C               J     J");
		System.out.println("M     M         CCCCCCC          JJJJJ");
	}
		
	public static void main(String arguments[]) {
		banner();	// Llama al metodo
	}
		}
