package ejercicios;

import java.util.Scanner;

public class IE112 {

	public static void main(String[] args) {
		//Definir variables
		int n,c;
		c=0;
		
		//Pedir número
		System.out.println("Introduzca un numero de 4 cifras");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		//Sacando cifras
		while (c<4) {
			System.out.println(c+1 + "º cifra: " + n%10);
			n/=10;
			c+=1;
		}
	}

}
