package ejercicios;

import java.util.Scanner;

public class IE1112 {

	public static void main(String[] args) {
		//Definir variables
		int d,d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,c,c2;
		
		//cantidad de dados
		System.out.println("Cuantos datos vas a tirar");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		c2=c;
		
		//Lanzar dados
		while (c!=0) {
		d=(int) (Math.random()*6+1);
		if (d==1) {
			d1++;
		}
		else if (d==2) {
			d2++;
		}
		else if (d==3) {
			d3++;
		}
		else if (d==4) {
			d4++;
		}
		else if (d==5) {
			d5++;
		}
		else {
			d6++;
		}
		c-=1;
	}
	//Resultados en porcentajes
	System.out.println("1: " + d1*100/c2 + "%");
	System.out.println("2: " + d2*100/c2 + "%");
	System.out.println("3: " + d3*100/c2 + "%");
	System.out.println("4: " + d4*100/c2 + "%");
	System.out.println("5: " + d5*100/c2 + "%");
	System.out.println("6: " + d6*100/c2 + "%");
	}
	

}
