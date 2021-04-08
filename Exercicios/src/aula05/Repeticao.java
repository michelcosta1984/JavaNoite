package aula05;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		
	//parouImpar();
	//sinal();
	//exibeNome();
		//exibe5vezes();
	   // nomeQtVezes();
		//contaAteNum();
		//tabuada();
		//somaAteNum();
		//fatorial();
		potencia();
	}
	
public static void potencia() {
	
		Scanner sc = new Scanner(System.in);
		// entrada
		System.out.print(" Base : ");		
		double base = sc.nextDouble();		
		System.out.print(" Expoente : ");		
		int exp = sc.nextInt();	
		
		//processamento
		
		double total = 1;		
		for (int i=1 ; i<=exp ; i++) {
			total *= base;			
		
		}
		//saida
		
		System.out.println(base + "^" + exp + " = " + total);	

		}
	
public static void fatorial() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print(" Numero : ");
		
		int num = sc.nextInt();		
		double total = 1;		
		for (int i=1 ; i<=num ; i++) {
			total *= i;			
		
		}
		System.out.println(num + " ! =  "  + total );		
		}
		
public static void tabuada() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Numero : ");
		int num = sc.nextInt();
		
		
		for (int i=1 ; i<=10; i++) {
			
			System.out.println(num + " x " + i + " = " + (num*i) );
			
				
		}
	}
	
	
	public static void contaAteNum() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print(" Numero : ");
		int qt = sc.nextInt();
		
		
		for (int i=1 ; i<=qt ; i++) {
			
			System.out.print(i );
		if (i < qt) System.out.print(" - ");
		}
	}
	public static void nomeQtVezes() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print(" Quantas Repetições : ");
		int qt = sc.nextInt();
		
		
		for (int i=0 ; i<=qt ; i++) {
			
			System.out.println(i +  " ª " + nome );
		}	
			}
		
	
	public static void exibe5vezes() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Digite seu numero : ");
		String num = sc.nextLine();
		
		for (int i=0 ; i<5 ; i ++) {
			System.out.println( i + ")" + num );
				}
		System.out.println("********* fim da rotina *********");		
	}
	
	public static void exibeNome() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Digite seu nome: ");
		String nome = sc.nextLine();
		
		for (int i=0 ; i<10 ; i ++) {
			System.out.println(" Seu nome é " + nome );
				}
		System.out.println("********* fim da rotina *********");		
	}
	
        public static void sinal() {
		
		int num;		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Digite 1 inteiros: ");
		num = sc.nextInt();		
		if (num > 0) System.out.println(num + " é positivo! " );
		else if (num < 0) System.out.println(num + " é negativo! ");
		else System.out.println(num + " nulo! " );
		}while (num != 0);
		
		System.out.println("********* fim da rotina *********");
		
}
	public static void parouImpar() {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		while (num != 0){		
		System.out.print("digite um numero: ");
		num = sc.nextInt();
		if (num%2 == 0) System.out.println( num + " é par. ");
		else System.out.println( num + " é impar. ");
		} 
	
		System.out.println("********* fim da rotina *********");
	}
				
	}
	


