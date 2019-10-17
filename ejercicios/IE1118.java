package ejercicios;

import java.util.Scanner;

public class IE1118 {

	public static void main(String[] args) {
		//Definir variables
		//Modificación en rama1, n = number
		//modificación de rama1
		int number,centro,hastaCentro,suma,suma2,desdeCentro;
		
		//Valor variables
		System.out.println("Introduzca maximo para encontrar numeros centro");
		Scanner numero1 = new Scanner(System.in);
		number = numero1.nextInt();
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
					desdeCentro=number;
				}
				desdeCentro++;
				if (suma==suma2) {
					System.out.println(centro);
				}
			}
			while (desdeCentro<number);
			suma=0;
			suma2=0;
			hastaCentro=0;
			centro++;
		}
		while (centro<=number);
	}

}
