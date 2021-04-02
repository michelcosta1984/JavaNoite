package aula03;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite as tres palavras: ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		System.out.println("s1 = " +  s1);
		System.out.println("s2 = " +  s2);
		System.out.println("s3 = " +  s3);
	}
}
