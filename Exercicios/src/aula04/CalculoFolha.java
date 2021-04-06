package aula04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculoFolha {

	public static void main(String[] args) {
		calculoINSS();

	}
 
	public static void calculoINSS() {
		//entrada
	String nome = JOptionPane.showInputDialog(" Informe nome :");
	String str = JOptionPane.showInputDialog("Informe o salario :");
	Double salario = Double.parseDouble(str);
	//processamento
	double inss = 0;	
	if (salario <= 1.100) inss = ( salario * 7.5 / 100.0 ) - 0;
	else if (salario <= 2203.48) inss = ( salario * 9 / 100.0 ) - 16.5;
	else if (salario <= 3305.22) inss = ( salario * 12 / 100.0 ) - 82.604;
	else if (salario <= 6433.57) inss = ( salario * 14 / 100.0 ) - 148.708;
	else inss = 751.97;	
		
		
	
	
	// saida 
	
	JOptionPane.showMessageDialog(null, "Valor do INSS : R$ " + inss);
	
	
		
	}	
}

