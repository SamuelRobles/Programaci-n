package ejercicios;

public class IE114 {

	public static void main(String[] args) {
		
		//Declaración y valor inicial de variables
		int cont;
		String c;
		c = "";
		cont=5;
		
		//ejecución
		while (cont>0) {
			c = c + "*";
			System.out.println(c);
			cont-=1;
		}
		
	}

}
