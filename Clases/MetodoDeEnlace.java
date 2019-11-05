package Clases;

import java.util.Scanner;

public class MetodoDeEnlace {

/*	public static void main(String[] args) {
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
	
	public static void main(String[] args) {
		
		int x1;
		Rectangulo area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 1 para rectangulo en puntos u otro para rectángulo en base, altura");
		x1=sc.nextInt();
		if (x1==1) {
					
			int y1,x2,y2,x3,y3;
			
			System.out.println("Introduce las cordenadas del primer punto sin contar el (0,0)");
			x1=sc.nextInt();
			y1=sc.nextInt();
	
			System.out.println("Introduce las cordenadas del segundo punto");
			x2=sc.nextInt();
			y2=sc.nextInt();
			
			System.out.println("Introduce las cordenadas del tercer punto sin contar el (0,0)");
			x3=sc.nextInt();
			y3=sc.nextInt();
			
			area = new Rectangulo();
			
			area.puntos(x1, y1, x2, y2, x3, y3);

		}
		else {
			int base,altura;
			System.out.println("Introduce la base y la altura");
			base=sc.nextInt();
			altura=sc.nextInt();
			
			area = new Rectangulo();
			
			area.BaseAltura(base, altura);
		}
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
		
		System.out.println("[("+line.getPuntoA().getX()+","+line.getPuntoA().getY()+")"
				+ ",("+line.getPuntoB().getX()+","+line.getPuntoB().getY()+")]");
	}*/
}
		

