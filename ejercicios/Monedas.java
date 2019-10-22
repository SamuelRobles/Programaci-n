package ejercicios;

import java.util.Scanner;

public class Monedas {

	public static void main(String[] args) {
		// Definir variables
		int cantidad;
		
		//Pedida de dinero
		System.out.println("Introduce la cantidad de dinero");
		Scanner sc = new Scanner(System.in);
		cantidad = sc.nextInt();
		
		//Billetes de 500
		if ((cantidad/500)>0) {
		System.out.println("hay " + cantidad/500 + " billetes de 500");
		}
		cantidad/=500;
		
		//Billetes de 200
		if ((cantidad/200)>0) {
		System.out.println("hay " + cantidad/200 + " billetes de 200");
		}
		cantidad/=200;
		
		//Billetes de 100
		if ((cantidad/100)>0) {
		System.out.println("hay " + cantidad/100 + " billetes de 100");
		}
		cantidad/=100;
		
		//Billetes de 50
		if ((cantidad/50)>0) {
		System.out.println("hay " + cantidad/50 + " billetes de 50");
		}
		cantidad/=50;
		
		//Billetes de 20
		if ((cantidad/20)>0) {
		System.out.println("hay " + cantidad/20 + " billetes de 20");
		}
		cantidad/=20;
		
		//Billetes de 10
		if ((cantidad/10)>0) {
		System.out.println("hay " + cantidad/10 + " billetes de 10");
		}
		cantidad/=10;
		
		//Billetes de 5
		if ((cantidad/5)>0) {
		System.out.println("hay " + cantidad/5 + " billetes de 5");
		}
		cantidad/=5;
		
		//Monedas de 2
		if ((cantidad/2)>0) {
		System.out.println("hay " + cantidad/2 + " monedas de 2");
		}
		cantidad/=2;
		
		//Monedas de 1
		if ((cantidad/1)>0) {
		System.out.println("hay " + cantidad + " monedas de 1");
		}

	}
}
