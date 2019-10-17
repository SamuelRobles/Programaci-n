package ejercicios;

import java.util.Scanner;

public class IE116 {

	public static void main(String[] args) {
		
		//Definir variable
		float n=0;
		
		//Control de la nota
		do {
			System.out.println("Introduzca nota del alumno (entre 0 y 10)");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if (n>=0 && n<=10) {
				System.out.println("valida");
			}
			else {
				System.out.println("Nota no válida");
			}
		}
		while (n<0 && n>10);
		
		//Calculo
		if (n>=0 && n<=4) {
			System.out.println(n + " Suspenso");
		}
		else if (n>=5 && n<=6) {
			System.out.println(n + " Bien");
		}
		else if (n>=7 && n<=8) {
			System.out.println(n + " Notable");
		}
		else {
			System.out.println(n + " Sobresaliente");
		}
		
		
	}

}
