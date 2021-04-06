package aula03;

import java.util.Scanner;

public class Condicionais {
	public static void main(String[] args) {
		//div();
        //maior();
		//crescente();
		sinal();
	}
	
public static void sinal() {
		
		int num;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 1 inteiros: ");
		num = sc.nextInt();		
		if (num > 0) System.out.println(num + " é positivo! " );
		else if (num < 0) System.out.println(num + " é negativo! ");
		else System.out.println(num + " nulo! " );
		
	}
	
public static void crescente() {
		
		int n1, n2;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1 < n2) System.out.println(n1 + " - " + n2 );
		else if (n2 < n1) System.out.println(n2 + " - " + n1);
		else if (n1 == n2) System.out.println(n1 + " - " + n2 );
		
	}

	public static void maior() {
		
		int n1, n2;
		int resp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1 > n2) System.out.println("o maior é " + n1);
		else if (n2 > n1) System.out.println("o maior é " + n2);
		else if (n1 == n2) System.out.println("os dois sao iguais." );
		
	}
	

	public static void imc() {

		int n1, n2;
		int resp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n2 != 0) {
			resp = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + resp);
		} else {
			System.out.println("Não pode dividir por zero");
		}
	}
}
