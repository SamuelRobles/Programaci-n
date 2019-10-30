package Clases;

import java.util.Scanner;

public class Numero {
	private int number;
	private int añadido;
	private int sumaT;
	private int restaT;

	Numero(){
		añadido=number=0;
	}
	
	Numero(int n,int a) {
		number=n;
		añadido=a;
	}
	
	public void printsuma() {
		sumaT=number+añadido;
		System.out.println(sumaT);
	}
	
	public void printresta() {
		sumaT=number-añadido;
		System.out.println(sumaT);

	}

	public int getValor() {
		System.out.println(number);
		return number;
	}
	
	public int getDoble() {
		System.out.println(number*2);
		return number*2;
	}
	
	public int getTriple() {
		System.out.println(number*3);
		return number*3;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		Numero calculo;
		int numero,añadir,eleccion;
		
		System.out.println("Introduce dos números");
		Scanner sc = new Scanner(System.in);
		numero=sc.nextInt();
		añadir=sc.nextInt();
		
		calculo=new Numero(numero,añadir);
		do {
		System.out.println("Seleccione opción deseada:");
		System.out.println("1.- Suma del valor interno");
		System.out.println("2.- Resta del valor interno");
		System.out.println("3.- Mostrar del valor interno");
		System.out.println("4.- Doble del valor interno");
		System.out.println("5.- Tripe del valor interno");
		System.out.println("6.- Cambiar valor interno");
		System.out.println("Otro.- Cambiar valor interno");
		eleccion=sc.nextInt();
		switch (eleccion) {
		case 1:
			calculo.printsuma();
			break;
		case 2:
			calculo.printresta();
			break;
		case 3:
			calculo.getValor();
			break;
		case 4:
			calculo.getDoble();
			break;
		case 5:
			calculo.getTriple();
			break;
		case 6:
			System.out.println("Introduce valor interno");
			numero=sc.nextInt();
			eleccion=1;
		default:
			eleccion=0;
			break;
		}
		}while (eleccion!=0);
	}
}
