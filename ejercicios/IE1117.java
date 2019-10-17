package ejercicios;

import java.util.Scanner;

public class IE1117 {

	public static void main(String[] args) {
		//Definir variables
		int n1,n2,ns,c,c1,c2,c3,s;
		
		//Valores a variables
		System.out.println("Introduzca la baliza y la cantidad de numeros a comparar");
		Scanner numero1 = new Scanner(System.in);
		n1 = numero1.nextInt();
		Scanner numero2 = new Scanner(System.in);
		n2 = numero2.nextInt();
		c=1;
		c1=0;
		c2=0;
		c3=0;
		s=0;
		
		//Comparación e integración de los números
		while (c<=n2) {
			System.out.println("Introduzca " + c + "º numero");
			Scanner numero3 = new Scanner(System.in);
			ns = numero3.nextInt();
			if (ns>n1) {
				c1++;
				s+=ns;
				c++;
			}
			else if (ns==n1) {
				c2++;
				c++;
			}
			else {
				c3++;
				c++;
			}
		}
		System.out.println("Hay " + c1 + " mayores, " + c2 + " iguales y " + c3 +  " menores a la baliza. La suma de los mayores es: " + s);
	}

}
