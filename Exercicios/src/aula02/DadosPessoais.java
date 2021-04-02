package aula02;

import java.util.Scanner;

public class DadosPessoais{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");		
		String nome = sc.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.print("Digite um idade: ");
		int idade = sc.nextInt();
		System.out.println("idade: " + idade );
		
		System.out.print("Digite sua altura: " );
		double altura = sc.nextDouble();
		System.out.println("altura: " + altura);
		
		System.out.println("Nome: " + nome +  " - Idade: " + idade +  " anos "
				+ "- Altura: "+  altura + " Metros de Altura");
			
		
}
}