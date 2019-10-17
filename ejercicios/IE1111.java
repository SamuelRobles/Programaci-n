package ejercicios;

import java.util.Scanner;

public class IE1111 {

	public static void main(String[] args) {
		//Definir variables
		int n1,n2,c,z=0,x=0;
		
		//Introducir número
		System.out.println("Introduzca dos números");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		Scanner sf = new Scanner(System.in);
		n2 = sf.nextInt();
		
		//Valor de c
		c=n1/2;
		while (c!=0) {
			if (n1%c==0) {
				z+=n1/c;
				c-=1;
			}
			else {
				c-=1;
			}
		}
		c=n2/2;
		while (c!=0) {
			if (n2%c==0) {
				x+=n2/c;
				c-=1;
			}
			else {
				c-=1;
			}
		}
		if (z==n2 && x==n1) {
			System.out.println("Son amigos");
		}
		else {
			System.out.println("No son amigos");
		}
	}

}
