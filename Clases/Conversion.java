package Clases;

import java.util.Scanner;

public class Conversion {
	private double milla;

	Conversion (double m) {
		milla=m;
	}
	
	public void millasAMetros () {
		double metros;
		metros=milla*1852;
		System.out.println(milla + " millas son " + metros + " metros");
	}
	
	public void millasAKilometros () {
		double metros;
		metros=(milla*1852)/1000;
		System.out.println(milla + " millas son " + metros + " metros");
	}
	
	public static void main(String[] args) {
		Conversion resultado;
		double millas;
		int select;
		
		
		System.out.println("Introduzca millas");
		Scanner sc = new Scanner(System.in);
		millas=sc.nextDouble();
		
		resultado = new Conversion(millas);
		
		System.out.println("Introduce 1 para cambiar a metros u otro para cambiar a kilometros");
		select=sc.nextInt();
		if (select==1) {
			
			resultado.millasAMetros();
		}
		else {
			resultado.millasAKilometros();
		}
		
	}
}

