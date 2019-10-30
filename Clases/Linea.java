package Clases;

import java.util.Scanner;

public class Linea {
	private double puntoAx,puntoAy;
	private double puntoBx,puntoBy;
	
	Linea () {
		puntoAx=0.0;
		puntoBx=0.0;
		puntoAy=0.0;
		puntoBy=0.0;
	}
	
	Linea (double x1,double x2,double y1,double y2){
		puntoAx=x1;
		puntoBx=x2;
		puntoAy=y1;
		puntoBy=y2;
	}
	
	public void moverDerecha(int c) {
		puntoAy=puntoAy+c;
		puntoBy=puntoBy+c;
	}
	
	public void moverIzquierda(int c) {
		puntoAy=puntoAy-c;
		puntoBy=puntoBy-c;
	}
	
	public void moverArriba(int c) {
		puntoAx=puntoAx+c;
		puntoBx=puntoBx+c;
	}
	
	public void moverAbajo(int c) {
		puntoAx=puntoAx-c;
		puntoBx=puntoBx-c;
	}
	
	public void posicion() {
		System.out.println("[("+puntoAx+","+puntoAy+"),("+puntoBx+","+puntoBy+")]");
	}
	
public static void main(String[] args) {		
		
		Linea line;
		double x1,x2,y1,y2;
		int elec,c;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la posición del punto 1");
		x1=sc.nextDouble();
		y1=sc.nextDouble();

		System.out.println("Introduce la posición del punto 2");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		
		line= new Linea(x1,y1,x2,y2);
		
		do {
			System.out.println("¿Quieres hacer algo con la linea?");
			System.out.println("1.- Mover a la Derecha");
			System.out.println("2.- Mover a la Izquierda");
			System.out.println("3.- Mover a la Arriba");
			System.out.println("4.- Mover a la Abajo");
			System.out.println("Otro.- Salir");
			elec=sc.nextInt();
			
			switch (elec) {
			case 1:
				System.out.println("Cuanto vas a querer mover a la derecha");
				c=sc.nextInt();
				line.moverDerecha(c);
				break;
			case 2:
				System.out.println("Cuanto vas a querer mover a la izquierda");
				c=sc.nextInt();
				line.moverIzquierda(c);
				break;
			case 3:
				System.out.println("Cuanto vas a querer mover a la arriba");
				c=sc.nextInt();
				line.moverArriba(c);
				break;
			case 4:
				System.out.println("Cuanto vas a querer mover a la abajo");
				c=sc.nextInt();
				line.moverAbajo(c);
				break;
			}
		} while (5>elec && elec>0);
		
		line.posicion();
	}
}
