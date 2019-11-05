package Clases;

import java.util.Scanner;

public class Linea {
	private puntoA puntoA;
	private puntoB puntoB;
	
	
	
	Linea (double x1,double y1,double x2,double y2) {
		this.puntoA=new puntoA(x1,y1);
		this.puntoB=new puntoB(x2,y2);
	}

	public String getPuntoA() {
		return (this.puntoA.getX()+","+this.puntoA.getY());
	}

	public void setPuntoA(puntoA puntoA) {
		this.puntoA = puntoA;
	}

	public String getPuntoB() {
		return (this.puntoB.getX()+","+this.puntoB.getY());
	}

	public void setPuntoB(puntoB puntoB) {
		this.puntoB = puntoB;
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
				x1+=c;
				x2+=c;
				break;
			case 2:
				System.out.println("Cuanto vas a querer mover a la izquierda");
				c=sc.nextInt();
				x1-=c;
				x2-=c;
				break;
			case 3:
				System.out.println("Cuanto vas a querer mover a la arriba");
				c=sc.nextInt();
				y1+=c;
				y2+=c;
				break;
			case 4:
				System.out.println("Cuanto vas a querer mover a la abajo");
				c=sc.nextInt();
				y1-=c;
				y2-=c;
				break;
			}
		} while (5>elec && elec>0);
		
		line= new Linea(x1,y1,x2,y2);
		
		System.out.println("[("+line.getPuntoA()+"),("+line.getPuntoB()+")]");
	}
	
}
