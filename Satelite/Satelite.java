package Satelite;

public class Satelite {
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	Satelite(){
		meridiano=paralelo=distancia_tierra=0;
	}
	
	Satelite(double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	public void setPosicion(double m, double p, double d) {
		
	}

}