package ejercicios;

import java.util.Scanner;

public class IE115 {

	public static void main(String[] args) {
		
		int n=0,p=0,p1=0,neg=0,neg1=0,c=0,cont=10;
		while (cont>0) {
			System.out.println("Introduzca un número");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if (n>0) {
				p+=n;
				p1+=1;
				cont-=1; 
			}
			else if (n==0) {
				c++;
				cont-=1;
			}
			else {
				neg+=n;
				cont-=1;
				neg1++;
			}
		}
		System.out.println("Media p: " + p/p1);
		System.out.println("Media n: " + neg/neg1);
		System.out.println("Cantidad de ceros: " + c);
	}

}
