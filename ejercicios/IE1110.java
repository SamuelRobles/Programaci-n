package ejercicios;

import java.util.Scanner;

public class IE1110 {

	public static void main(String[] args) {
		//Definir variables
		int n,e,c=0;
		n = (int) (Math.random()*100+1);
		do {
			System.out.println("Adivine el número");
			Scanner sc = new Scanner(System.in);
			e = sc.nextInt();
			c++;
			if (n>e) {
				System.out.println("El número es mayor");
			}
			else if (n<e) {
				System.out.println("El número es menor");
			}
			else {
				System.out.println("acertaste");
			}
		}
		while (n!=e);
		System.out.println(c + " intentos");
	}

}
