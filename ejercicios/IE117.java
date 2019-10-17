package ejercicios;

import java.util.Scanner;

public class IE117 {

	public static void main(String[] args) {
		//Definir variables
		int n, c=0;
		
		//Introducir número válido
		do {
			System.out.println("Introduzca numero maximo de busqueda");
			Scanner sr = new Scanner(System.in);
			n = sr.nextInt();
			if (n>0) {
				System.out.println("Valido");
			}
			else {
				System.out.println("Error");
			}
		}
		while (n<0);
		
		//Calculo
		while (n>0) {
			if (n%3==0) {
				System.out.println(n);
				n-=1;
				c++;
			}
			else {
				n-=1;
			}
		}
		
		//Resultado
		System.out.println("Se han mostrado " + c + " números");
	}

}
