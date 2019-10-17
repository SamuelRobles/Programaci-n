package ejercicios;

import java.util.Scanner;

public class IE111 {

	public static void main(String[] args) {
		
		//Definir Variables
		int n,S=0,C=6;
		
		//bucle mientras 
		while (C > 0) {
			
			//Pedida del valor para la variable N
			System.out.println("Intoduzca una nota de una asignatura");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			//Suma a la variable S el valor de la variable N
			S+=n;
			
			//Reducción del contador
			C-=1;
		};
		
		//Mostrado del resultado de la media
		System.out.println("La nota media es:" + S/6);
		
	}

}
