package aula05;

import javax.swing.JOptionPane;

public class calculaIRPF {

	public static void main(String[] args) {
		calculoIrrp();

	}
	
	
 
	public static void calculoIrrp() {
		//entrada
	String nome = JOptionPane.showInputDialog(" Informe nome :");
	String str = JOptionPane.showInputDialog("Informe o salario :");
	Double salario = Double.parseDouble(str);
	//processamento
	double irrp = 0;	
	if (salario <= 1903.93) irrp =  0 ;
	else if (salario <= 2826.65) irrp = ( salario * 7.5 / 100.0 ) - 142.80;
	else if (salario <= 3751.05) irrp = ( salario * 15 / 100.0 ) - 354.80;
	else if (salario <= 4664.68) irrp = ( salario * 22.5 / 100.0 ) - 636.13;
	else if (salario >= 4664.68) irrp = ( salario * 27.5 / 100.0 ) - 869.36;
		
	
	
	// saida 
	
	JOptionPane.showMessageDialog(null, "Valor do IRRF : R$ " + irrp);
	
	
		
	}	
}
