package ejercicios;

import java.util.Scanner;

public class IE113 {

	public static void main(String[] args) {
		
		//Definiendo variables
		int n;
		
		//Introducir número valido
		do {
			System.out.println("Introduce un número positivo menor a o igual a 100");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		}
		while (n<0 && n>100); 
		
		//Primos
		System.out.println("Los números primos son:");
		
		while (n>=0) {
		if ((n%2)==0 || (n%3)==0 || (n%5)==0 || (n%7)==0 || (n%11)==0) {
			n-=1; 
		}
		else {
			System.out.println(n);
			n-=1;
		}
		}
		
	}

}
