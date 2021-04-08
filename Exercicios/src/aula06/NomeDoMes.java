package aula06;

import javax.swing.JOptionPane;

import util.Converte;

public class NomeDoMes {

	public static void main(String[] args) {
		//entrada
		String str = JOptionPane.showInputDialog(" Digite um numero de 1 a 12 :");
		int num = Integer.parseInt(str);
		str = Converte.NomeDoMes(num);
		//saida
		JOptionPane.showMessageDialog(null, "O Mês é " + str + "!");
	}	
	}
