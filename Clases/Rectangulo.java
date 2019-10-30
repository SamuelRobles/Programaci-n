package Clases;

public class Rectangulo {
	private int x,y,x2,y2,x3,y3,x4,y4;
	private int base,altura;
	
	Rectangulo() {
		x=0;
		y=0;
		base=0;
		altura=0;
	}
	
	public void puntos (int x,int y,int x1,int  y1,int x2,int y2) {
		int alt=this.x+x;
		int largo=this.y+y1;
		int area=largo*alt;
		this.x2=x;
		this.y2=y;
		this.x3=x1;
		this.y3=y1;
		this.x4=x2;
		this.y4=y2;
		System.out.println("El rectángulo tiene sus vertices en: (" + this.x + "," + this.y + ")"+ "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
		System.out.println("La superficie es de: " + area);
	}
	
	public void BaseAltura (int b,int a) {
		base=b;
		altura=a;
		int area=base*altura;
		System.out.println("Las coordenados son:");
		System.out.println("(o,o),(0,"+altura+"),("+base+",0),("+base+","+altura+")");
		
		System.out.println("El rectangulo de base " + base + " y altura " + altura);
		System.out.println("El superficie es de " + area);
	}
}
