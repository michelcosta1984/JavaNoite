package aula02;

import java.util.Scanner;

public class Contanto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Seu nome é: " + nome);	
		
		
		System.out.print("Digite o seu Celular: ");
		String celular = sc.nextLine();
		System.out.println("Meu celular é: " + celular);		
		
		System.out.print("Digite o seu email: ");
		String email = sc.nextLine();
		System.out.println("Meu email é: " + email);
		System.out.println(nome +  " - " + celular +  " - "+  email );
		
		
		
	}

}

