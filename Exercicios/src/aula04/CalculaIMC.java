package aula04;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		calculaIMC();	
		
	}
	public static void calculaIMC() {
		
			Scanner sc = new Scanner(System.in);
			System.out.print(" nome: ");		
			String nome = sc.nextLine();			
					
			System.out.print(" peso (kg): " );
			int peso = sc.nextInt();
			
			
			System.out.print(" altura: " );
			double altura = sc.nextDouble();
			
			
		double imc = peso / (altura * altura);
		System.out.println("seu IMC" + imc);
		
		String classe;
		if (imc < 18.5 ) classe = " peso baixo";
		else if (imc <= 24.9) classe = "peso normal";
		else if (imc <= 29.0)  classe = "sobre peso";
		else if (imc <= 34.9)  classe = "obesidade 1";
		else if (imc <= 39.9)  classe = "obesidade 2";
		else if (imc >= 40.0)  classe = "obesidade 3";
		
		System.out.println("seu imc é " + imc);
			//	System.out.println("Sua classificacao IMC é " + classe );
			
	}
		
}
	
	
