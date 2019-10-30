package Clases;

import java.util.Scanner;

public class Vehículo {
	
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	Vehículo() {
		modelo="";
	}
	//Get and Set
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public boolean iscRuedas() {
		return cRuedas;
	}
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	Vehículo(String m , double p , boolean c) {
		modelo=m;
		potencia=p;
		cRuedas=c;
	}
	
	public void printVehiculo() {
		if (cRuedas==true) {
			System.out.println("El vehículo de modelo " + modelo + " con potencia " + potencia + " y con atracción a cuatro ruedas");
		}
		else {
			System.out.println("El vehículo de modelo " + modelo + " con potencia " + potencia + " y no con atracción a cuatro ruedas");
		}
	}
	public static void main(String[] args) {
		Vehículo vehiculo;
		String modelo;
		int cuenta;
		boolean cuatroR;
		double potencia;
		
		System.out.println("Introduce los datos del vehículo");
		Scanner sc = new Scanner(System.in);
		modelo=sc.next();
		potencia=sc.nextDouble();
		
		System.out.println("¿Cuenta con tracción a cuatro ruedas?");
		System.out.println("1.- tiene");
		System.out.println("Otro.- no tiene");
		cuenta=sc.nextInt();
		
		if (cuenta==1) {
			cuatroR=true;
		}
		else {
			cuatroR=false;
		}
		
		vehiculo = new Vehículo(modelo,potencia,cuatroR);
		vehiculo.printVehiculo();
		
	}
}