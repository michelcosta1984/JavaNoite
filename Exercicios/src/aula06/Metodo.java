package aula06;

import javax.swing.JOptionPane;

import util.Converte;
import util.Converte.*;

public class Metodo {

		public static void main(String[] args) {
			//escolhaDia
			listaTodos();
		}
		public static void escolhaDia() {
			//entrada
			String str = JOptionPane.showInputDialog(" Digite um numero de 1 a 7 :");
			int num = Integer.parseInt(str);
			str = util.Converte.diaDaSemana(num);
			//saida
			JOptionPane.showMessageDialog(null, "Hoje é " + str + "!");
			
		}
		
		public static void listaTodos() {
			for(int i=1  ; i < 8 ;  i ++);{
			//System.out.println( i  + ")" + Converte.diaDaSemana(i));
		}	
		}
}
		

			
			
			
			

	


