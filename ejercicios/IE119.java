package ejercicios;

import java.util.Scanner;

public class IE119 {

	public static void main(String[] args) {
		//Definir variables
		int n1,n2,s=0;
		
		//Introducir número
		System.out.println("Introduze 2 números");
		Scanner sr = new Scanner(System.in);
		n1 = sr.nextInt();
		Scanner sc = new Scanner(System.in);
		n2 = sc.nextInt();
		
		//Menú
		while (s!=6) {
		System.out.println("Elija opción");
		System.out.println("1.- Sumarlos");
		System.out.println("2.- Restarlos");
		System.out.println("3.- Multiplicarlos");
		System.out.println("4.- Dividirlos");
		System.out.println("5.- Salir");
		Scanner sf = new Scanner(System.in);
		s = sf.nextInt();
		
		//operaciones
		switch (s) {
		case 1:
			s=n1+n2;
			System.out.println(n1 + " + " + n2 + " = " + s);
			break;
		case 2:
			s=n1-n2;
			System.out.println(n1 + " - " + n2 + " = " + s);
			break;
		case 3:
			s=n1*n2;
			System.out.println(n1 + " * " + n2 + " = " + s);
			break;
		case 4:
			if (n2==0) {
				System.out.println("Introduce otro número");
				Scanner sg = new Scanner(System.in);
				n2 = sg.nextInt();
				s=n1/n2;
				System.out.println(n1 + " / " + n2 + " = " + s);
				break;
			}
			else {
				s=n1/n2;
				System.out.println(n1 + " / " + n2 + " = " + s);
				break;
			}
		case 5:
			s++;
		}
		}
	}

}
