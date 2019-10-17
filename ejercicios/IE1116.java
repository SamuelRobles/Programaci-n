package ejercicios;

import java.util.Scanner;

public class IE1116 {

	public static void main(String[] args) {
		//definir variables
		int n;
		
		//menu
		do {
		System.out.println("Introduzca  el numero del tipo de semilla:");
		System.out.println("1.- Tomate");
		System.out.println("2.- Repollo");
		System.out.println("3.- Patata");
		System.out.println("4.- Cebolla");
		System.out.println("otro.- Salir");
		Scanner numero1 = new Scanner(System.in);
		n = numero1.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Introduzca el numero del tipo de tomate:");
			System.out.println("1.- Pera");
			System.out.println("Otro.- Ensalada");
			Scanner numero2 = new Scanner(System.in);
			n = numero2.nextInt();
			switch (n) {
			case 1:
				System.out.println("Cantidad de semillas usadas:");
				Scanner numero3 = new Scanner(System.in);
				n = numero3.nextInt();
				n*=15;
				System.out.println("El coste es de " + n);
				break;

			default:
				System.out.println("Cantidad de semillas usadas:");
				Scanner numero4 = new Scanner(System.in);
				n = numero4.nextInt();
				n*=20;
				System.out.println("El coste es de " + n);
				break;
			}
			break;
		
		case 2:
			System.out.println("Cantidad de semillas:");
			Scanner numero3 = new Scanner(System.in);
			n = numero3.nextInt();
			n*=10;
			System.out.println("El coste es de " + n);
			break;
		
		case 3:
			System.out.println("Introduzca el numero del tipo de patata:");
			System.out.println("1.- Criolla");
			System.out.println("2.- Pastusa");
			System.out.println("Otro.- Salentuna");
			Scanner numero4 = new Scanner(System.in);
			n = numero4.nextInt();
			switch (n) {
			case 1:
				System.out.println("Cantidad de semillas:");
				Scanner numero5 = new Scanner(System.in);
				n = numero5.nextInt();
				n*=8;
				System.out.println("El coste es de " + n);
				break;
				
			case 2:
				System.out.println("Cantidad de semillas:");
				Scanner numero6 = new Scanner(System.in);
				n = numero6.nextInt();
				n*=9;
				System.out.println("El coste es de " + n);
				break;

			default:
				System.out.println("Cantidad de semillas:");
				Scanner numero7 = new Scanner(System.in);
				n = numero7.nextInt();
				n*=11;
				System.out.println("El coste es de " + n);
				break;
			}
			break;
			
		case 4:
			System.out.println("Introduzca el numero del tipo de tomate:");
			System.out.println("1.- Larga");
			System.out.println("Otro.- Vieja");
			Scanner numero5 = new Scanner(System.in);
			n = numero5.nextInt();
			switch (n) {
			case 1:
				System.out.println("Cantidad de semillas usadas:");
				Scanner numero6 = new Scanner(System.in);
				n = numero6.nextInt();
				n*=15;
				System.out.println("El coste es de " + n);
				break;

			default:
				System.out.println("Cantidad de semillas usadas:");
				Scanner numero7 = new Scanner(System.in);
				n = numero7.nextInt();
				n*=13;
				System.out.println("El coste es de " + n);
				break;
			}
			break;
			
		default:
			n=5;
			break;
		}
		}
		while (n!=5);
	}

}
