package Clases;

import java.util.Scanner;

public class Personas {
	
	//objetos
	private String nombre;
	private String apellidos;
	private int nif;
	
	Personas(){
		nombre=apellidos="";
		nif=0;
	}
	
	Personas (String n, String a, int nif) {
		this.nombre=n;
		this.apellidos=a;
		this.nif=nif;
	}

	//Metodo get y set nombre
	public String isNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodo get y set Apellidos
	public String isApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//Metodo get y set nif
	public int getNif() {
		return nif;
	}
	
	public void setNif(int nif) {
		this.nif = nif;
	}
	
	public void printPersona() {
		System.out.println("La persona se llama " + nombre + " " + apellidos + " con nif " + nif);
	}
	
	public static void main(String[] args) {
		Personas persona;
		String nombre,apellido;
		int ni;
		
		System.out.println("Introduce los datos de la persona");
		Scanner sc = new Scanner(System.in);
		nombre=sc.next();
		apellido=sc.next();
		ni=sc.nextInt();
		persona = new Personas(nombre , apellido , ni);
		persona.printPersona();
		
	}
	
}
