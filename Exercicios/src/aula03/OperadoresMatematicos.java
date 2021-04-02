package aula03;

import java.util.Scanner;

public class OperadoresMatematicos {

	public static void main(String[] args) {
		// soma();
		// sub();
		// mult();
		div();
		// divd();
	}

	public static void soma() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("Soma = " + soma);
	}

	public static void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sub = n1 - n2;
		System.out.println("Sub = " + sub);
	}

	public static void mult() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int mult = n1 * n2;
		System.out.println("Mult = " + mult);
	}

	public static void div() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int div = n1 / n2;
		System.out.println("Div = " + div);

	}

	

	public static void divd() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 2 numeros: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double resp = n1 / n2;
		double resto = n1 % n2;
		System.out.println(n1 + " / " + n2 + " = " + resp);
		System.out.println(n1 + " % " + n2 + " = " + resto);

	}

}
