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
	
	public void print(double m, double p, double d) {
		System.out.println("El parelelo se encuentra en el paralero "+paralelo+
				" merididano "+meridiano+" y a la distancia de la tierra de "
				+distancia_tierra);
	}
}
