package aula06;

import javax.swing.JOptionPane;

public class NomeDoMes {

	public static void main(String[] args) {
		//entrada
		String str = JOptionPane.showInputDialog(" Digite um numero de 1 a 12 :");
		int num = Integer.parseInt(str);
		str = diaDaSemana(num);
		//saida
		JOptionPane.showMessageDialog(null, "O Mês é " + str + "!");
		
	}
public static String  diaDaSemana(int num) {
	String str;
		//processamento
		if   (num == 1) str = "Janeiro"; 
		 else if (num == 2) str = "Fevereiro"; 
		 else if (num == 3) str = "Março"; 
		 else if (num == 4) str = "Abril"; 
		 else if (num == 5) str = "Maio"; 
		 else if (num == 6) str = "Junho"; 
		 else if (num == 7) str = "Julho"; 
		 else if (num == 8) str = "Agosto";
		 else if (num == 9) str = "Setembro";
		 else if (num == 10) str = "Outubro";
		 else if (num == 11) str = "Novembro";
		 else if (num == 12) str = "dezembro";
		 else str = "invalido";
		 return str;
		 
		}
		
		
		
		

}