package util;

public class Converte {

	public static String diaDaSemana(int num) {
		String str;
		// processamento
		if (num == 1)
			str = "domingo";
		else if (num == 2)
			str = "segunda-feira";
		else if (num == 3)
			str = "terca-feira";
		else if (num == 4)
			str = "quarta-feira";
		else if (num == 2)
			str = "quinta-feira";
		else if (num == 2)
			str = "sexta-feira";
		else if (num == 2)
			str = "sabado";
		else
			str = "dia invalido";
		return str;

	}

	public static String NomeDoMes(int num) {
		String str;
		// processamento
		if (num == 1)
			str = "Janeiro";
		else if (num == 2)
			str = "Fevereiro";
		else if (num == 3)
			str = "Março";
		else if (num == 4)
			str = "Abril";
		else if (num == 5)
			str = "Maio";
		else if (num == 6)
			str = "Junho";
		else if (num == 7)
			str = "Julho";
		else if (num == 8)
			str = "Agosto";
		else if (num == 9)
			str = "Setembro";
		else if (num == 10)
			str = "Outubro";
		else if (num == 11)
			str = "Novembro";
		else if (num == 12)
			str = "dezembro";
		else
			str = "invalido";
		return str;

	}
/**
 * O método classeIMC informa a classicação do 
 * Indice de massa corporal de uma pessoa conforme
 * a tabela da Organização Mundial da Saúde.
 * @param imc O indice IMC da pessoa.
 * @return A classifição do IMC da pessoa.
 */
	public static String classeIMC(double imc) {

	String classe;
	if (imc < 18.5 ) classe = " peso baixo";
	else if (imc <= 24.9) classe = "peso normal";
	else if (imc <= 29.0)  classe = "sobre peso";
	else if (imc <= 34.9)  classe = "obesidade 1";
	else if (imc <= 39.9)  classe = "obesidade 2";
	else classe = "obesidade 3";
	return classe;
	}
}