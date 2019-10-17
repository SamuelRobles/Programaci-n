package ejercicios;

public class IE118 {

	public static void main(String[] args) {
		//Definir variables
		int c=100,p=0,n=0;
		
		//Cálculo
		while (c>=0) {
			if (c%2==0) {
				p+=c;
				c-=1;
			}
			else {
				n+=c;
				c-=1;
			}
		}
		
		//Solución
		System.out.println("La suma total positiva es " + p + " y la negativa " + n);
	}

}
