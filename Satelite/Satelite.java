package Satelite;

//Creamos una clase
public class Satelite {
	
	//Creamos atributos privados
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//Constructores
	Satelite(){
		meridiano=paralelo=distancia_tierra=0;
	}
	
	Satelite(double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	//Metodos
	public void setPosicion(double m, double p, double d) {
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	public double getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(double meridiano) {
		this.meridiano = meridiano;
	}

	public double getParalelo() {
		return paralelo;
	}

	public void setParalelo(double paralelo) {
		this.paralelo = paralelo;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	public void printPosicion() {
		System.out.println("El parelelo se encuentra en el paralero "+paralelo+
				" merididano "+meridiano+" y a la distancia de la tierra de "
				+distancia_tierra);
	}
	
}

public class Central{
	//Main
		public static void main(String[] args) {
			Satelite s1, s2;
			s1=new Satelite();
			s2=new Satelite(4, 2, 9);
			s1.setPosicion(5, 7, 3);
			s1.printPosicion();
			s2.printPosicion();
		}
}
