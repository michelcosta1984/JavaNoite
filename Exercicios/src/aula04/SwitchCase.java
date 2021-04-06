package aula04;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		
		//diaDaSemana();
		mesesDoAno();
		
	}
	
	
	public static void mesesDoAno() {
		String str = JOptionPane.showInputDialog(" Qual o mês ?");
		int num = Integer.parseInt(str);
		switch (num) {
		case (1): str = "janeiro"; break;
		case (2): str = "fevereiro"; break;
		case (3): str = "março"; break;
		case (4): str = "abril"; break;
		case (5): str = "maio"; break;
		case (6): str = "junho"; break;
		case (7): str = "julho"; break;
		case (8): str = "agosto"; break;
		case (9): str = "setembro"; break;
		case (10): str = "outubro"; break;
		case (11): str = "novembro"; break;
		case (12): str = "dezembro"; break;
		default: str = "invalido"; break;
		}
		
		JOptionPane.showMessageDialog(null, "O Mês é " + str + "!");
		
		
		}
	
	
	
	public static void diaDaSemana() {
		String str = JOptionPane.showInputDialog(" Digite um numero de 1 a 7 :");
		int num = Integer.parseInt(str);
		switch (num) {
		case (1): str = "domingo"; break;
		case (2): str = "segunda-feira"; break;
		case (3): str = "terca-feira"; break;
		case (4): str = "quarta-feira"; break;
		case (5): str = "quinta-feira"; break;
		case (6): str = "sexta-feira"; break;
		case (7): str = "sabado"; break;
		default: str = "dia invalido";
		}
		
		JOptionPane.showMessageDialog(null, "Hoje é " + str + "!");
		
		
		}
	}
	
	
		


	


