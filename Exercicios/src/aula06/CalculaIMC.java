package aula06;

import java.util.Scanner;

import javax.swing.JOptionPane;

import util.Converte;

public class CalculaIMC {
	
	

	public static void main(String[] args) {		
			calculaIMC();	
			
		}
		public static void calculaIMC() {
			//entrada
				Scanner sc = new Scanner(System.in);
				System.out.print(" nome: ");		
				String nome = sc.nextLine();		
				System.out.print(" peso (kg): " );
				int peso = sc.nextInt();							
				System.out.print(" altura: " );
				double altura = sc.nextDouble();		
				Double imc = peso / (altura * altura);
			    System.out.println("seu IMC" + imc);
			    //saida
			    System.out.println("seu imc é " + imc);
				//	System.out.println("Sua classificacao IMC é " + classe );
			    
			//processamento
			String classe = Converte.classeIMC(imc);
			
			
			System.out.println("seu imc é " + imc);
					System.out.println("Sua classificacao IMC é " + Converte.classeIMC(imc));
				
		}
			
	}
		
	

