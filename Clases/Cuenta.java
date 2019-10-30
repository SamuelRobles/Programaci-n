package Clases;

import java.util.Scanner;

public class Cuenta {
	private int cuentaBancaria;
	private long dni;
	private int saldo,interes;
	
	Cuenta (int c,int saldo, int interes, long dni) {
		cuentaBancaria=c;
		this.saldo=saldo;
		this.interes=interes;
		this.dni=dni;
	}
	
	//Actualización del saldo
	public void actualizacionSaldo() {
		double fSaldo=((this.saldo*this.interes)/100)/365;
		System.out.println("El sueldo final diario es de " + fSaldo);
	}
	
	//Ingreso
	public void ingresar(int c) {
		this.saldo=saldo+c;
		System.out.println("El saldo actual es de " + saldo);
	}
	
	//retirar
	public void retirar(int r) {
		this.saldo=saldo-r;
		System.out.println("El saldo actual es de " + saldo);
	}
	
	public void datos() {
		System.out.println("Cuenta Bancaria: " + cuentaBancaria);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
		System.out.println("Interes anual: " + interes + "%");
	}
	
public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		Cuenta banco;
		int nc,s,i,elec;
		long d;
		
		System.out.println("Introduzca el número de cuenta");
		nc=sc.nextInt();
		
		System.out.println("Introduce saldo actual");
		s=sc.nextInt();
		
		System.out.println("Introduce interes anual");
		i=sc.nextInt();
		
		System.out.println("Introduce DNI");
		d=sc.nextLong();
		
		banco=new Cuenta(nc,s, i, d);
		System.out.println("¿Deseas ingresar o retirar? 1=si otro=no");
		elec=sc.nextInt();
		
		if (elec==1) {
			System.out.println("¿Que deseas hacer? 1=ingresar otro=retirar");
			elec=sc.nextInt();
			if (elec==1) {
				System.out.println("Introduzca cantidad");
				int c=sc.nextInt();
				banco.ingresar(c);
			}
			else {
				System.out.println("Introduzca cantidad");
				int c=sc.nextInt();
				banco.retirar(c);
			}
		}
		banco.datos();
	}
}
