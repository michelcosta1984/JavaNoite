package aula06;

import javax.swing.JOptionPane;

public class Metodo {

		public static void main(String[] args) {
			//entrada
			String str = JOptionPane.showInputDialog(" Digite um numero de 1 a 7 :");
			int num = Integer.parseInt(str);
			str = diaDaSemana(num);
			//saida
			JOptionPane.showMessageDialog(null, "Hoje é " + str + "!");
			
		}
	public static String  diaDaSemana(int num) {
		String str;
			//processamento
			if   (num == 1) str = "domingo"; 
			 else if (num == 2) str = "segunda-feira"; 
			 else if (num == 3) str = "terca-feira"; 
			 else if (num == 4) str = "quarta-feira"; 
			 else if (num == 2) str = "quinta-feira"; 
			 else if (num == 2) str = "sexta-feira"; 
			 else if (num == 2) str = "sabado"; 
			 else str = "dia invalido";
			 return str;
			 
			}
			
			
			
			

	}


