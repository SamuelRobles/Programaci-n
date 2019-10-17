package ejercicios;

import java.util.Scanner;

public class IE1115 {

	public static void main(String[] args) {
		//Definir variables
		int n1,n2,n3,n4;
		
		//Valores
		System.out.println("Introduzca 4 números");
		Scanner numero1 = new Scanner(System.in);
		n1 = numero1.nextInt();
		Scanner numero2 = new Scanner(System.in);
		n2 = numero2.nextInt();
		Scanner numero3 = new Scanner(System.in);
		n3 = numero3.nextInt();
		Scanner numero4 = new Scanner(System.in);
		n4 = numero4.nextInt();
	
		//Comprobación
		if (n1>=n2 && n1>=n3 && n1>=n4) {
			System.out.println(n1 + " es mayor");
			if (n2>=n3 && n2>=n4) {
				System.out.println(n2 + " es el siguiente mayor");
			}
			else if (n3>=n4) {
				System.out.println(n3 + "es el siguiente mayor");
				}
			else {
				System.out.println(n4 + "es el siguiente mayor");
				}
			}
		else if (n2>=n3 && n2 >= n4) {
			System.out.println(n2 + "es el más grande");
			if (n1>=n3 && n1>=n4) {
			System.out.println(n1 + " es el siguiente mayor");
			}
			else if (n3>=n4) {
				System.out.println(n3 + " es el siguiente mayor");
		}
			else {
				System.out.println(n4 + " es el siguiente mayor");
			}
		}
		else if (n3>=n4) {
			System.out.println(n3 + " es el mayor");
			if (n1>=n2 && n1>=n4) {
				System.out.println(n1 + " es el siguiente mayor");
			}
			else if (n2>=n4) {
				System.out.println(n2 + " es el siguiente mayor");
			}
			else {
				System.out.println(n4 + " es el siguiente mayor");
			}
		}
		else {
			System.out.println(n4 + " es el mayor");
			if (n1>=n2 && n1>=n3) {
				System.out.println(n1 + " es el siguente mayor");
			}
			else if (n2>=n3) {
				System.out.println(n2 + " es el siguiente mayor");
			}
			else {
				System.out.println(n3 + " el el siguiente mayor");
			}
		}
}
}
