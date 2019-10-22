package Satelite;

public class EjSat {

	public static void main(String[] args) {
		Satelite s1, s2;
		s1=new Satelite();
		s2=new Satelite(4, 2, 9);
		s1.setPosicion(5, 7, 3);
		s1.printPosicion();
		s2.printPosicion();
	}

}
