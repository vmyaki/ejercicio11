import java.util.Scanner;

public class clase11 {

	public static void main(String[] args) {
		// Declaramos e inicializamos variables

			float gradoCelsius, gradoFaren;
		
		//Mostramos mensaje
			System.out.println("Introduce grados celsius:");

		//Creamos una clase o objeto para poder pedir por teclado
			Scanner teclado=new Scanner (System.in);
		
			gradoCelsius=teclado.nextFloat();
			
		//Calculo a grados Farenheit
		
			gradoFaren=(gradoCelsius*9/5)+32; //gradoFaren=(gradoCelsius*1.8f)+32f; se pone f para convertir el double a float
		
		System.out.println("Los grados Farenheit son "+gradoFaren);
	}

}
