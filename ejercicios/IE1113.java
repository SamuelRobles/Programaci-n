package ejercicios;

import java.util.Scanner;

public class IE1113 {

	public static void main(String[] args) {
		//Definir variables
		int año1,año2,mes1,mes2,f1,f2,h1,h2,m1,m2;
		
		//Meter día de salida
		do {
		System.out.println("Introduzca año salida");
		Scanner sc = new Scanner(System.in);
		año1 = sc.nextInt();
		
		//Calculo del año
		System.out.println("Introduzca año de llegada");
		año2 = sc.nextInt();
		}
		while (año1>año2);
		año1=(año2-año1)*12;
				
		//---------------------
		//Calculo del mes
		System.out.println("Introduzca el mes de salida");
		Scanner sc = new Scanner(System.in);
		mes1 = sc.nextInt();

		System.out.println("Introduzca mes de llegada");
		Scanner sf = new Scanner(System.in);
		mes2 = sf.nextInt();
		
		if (mes1>mes2) {
			mes1=(((mes2-mes1)+12)+año1)*30;
		}
		else {
			mes1=((mes2-mes1)+año1)*30;
		}
		
		//-----------------------
		//Calculo de día
		System.out.println("Introduzca el día de salida");
		Scanner sp = new Scanner(System.in);
		f1 = sp.nextInt();

		System.out.println("Introduzca día de llegada");
		Scanner sg = new Scanner(System.in);
		f2 = sg.nextInt();
		
		if (f1>f2) {
			f1=(((f2-f1)+30)+mes1)*24;
		}
		else {
			f1=((f2-f1)+mes1)*24;
		}
		
		//----------------------
		//calculo de hora
		System.out.println("Introduzca el hora de salida");
		Scanner sq = new Scanner(System.in);
		h1 = sq.nextInt();

		System.out.println("Introduzca hora de llegada");
		Scanner so = new Scanner(System.in);
		h2 = so.nextInt();
		if (h1>h2) {
			h1=(((h2-h1)+24)+f1);
		}
		else {
		h1=((h2-h1)+f1);
		}
		
		//---------------------
		//Calculo de minutos
		System.out.println("Introduzca el minuto de salida");
		Scanner sm = new Scanner(System.in);
		m1 = sm.nextInt();

		System.out.println("Introduzca minuto de llegada");
		Scanner sd = new Scanner(System.in);
		m2 = sd.nextInt();
		if (m1>m2) {
			m1=(m2-m1)+60;
		}
		else {
		m1=(m2-m1)+60;
		}
		System.out.println(h1 + " horas y " + m1 + " minutos");
	}

}
