package ejercicios;

import java.util.Scanner;

public class IE1114 {

	public static void main(String[] args) {
		//Definir variables
		float s,v,k,d;
		d=0;
		//Valores a variables
		System.out.println("Introduzca el sueldo fijo, dietas, kilometros que haces y ventas");
		Scanner sueldo = new Scanner(System.in);
		s = sueldo.nextInt();
		Scanner ventas = new Scanner(System.in);
		v = ventas.nextInt();
		Scanner kilometros = new Scanner(System.in);
		k = kilometros.nextInt();
		Scanner dietas = new Scanner(System.in);
		k = dietas.nextInt();
		
		//Calculos
		s=(s*18)/100;
		v=(v*5)/100;
		d=d*60;
		s+=d+k+v-150;
		//Salida 
		System.out.println("El sueldo liquido es de " + s);
	}

}
