package ejercicios;

import java.util.Scanner;

public class IE1118 {

	public static void main(String[] args) {
		//Definir variables
		//Modificación en la rama principal
		int n,centro,hastaCentro,suma,suma2,desdeCentro;
		
		//Valor variables
		System.out.println("Introduzca maximo para encontrar numeros centro");
		Scanner numero1 = new Scanner(System.in);
		n = numero1.nextInt();
		centro=1;
		hastaCentro=0;
		suma=0;
		suma2=0;
		
		//Calculo
		do {
			//Suma de los numeros por la izquierda del centro
			do {
				suma+=hastaCentro;
				hastaCentro++;
			}
			while (hastaCentro<centro);
			
			//Suma de los numeros por la derecha del centro
			desdeCentro=centro+1;
			do {
				suma2+=desdeCentro;
				//Comprobador para aligerar
				if (suma2>suma) {
					desdeCentro=n;
				}
				desdeCentro++;
				if (suma==suma2) {
					System.out.println(centro);
				}
			}
			while (desdeCentro<n);
			suma=0;
			suma2=0;
			hastaCentro=0;
			centro++;
		}
		while (centro<=n);
	}

}
