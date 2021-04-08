package util;

public class CalculaFolha {
	
	public static double inss(double salario) {
	double inss = 0;	
	if (salario <= 1.100) inss = ( salario * 7.5 / 100.0 ) - 0;
	else if (salario <= 2203.48) inss = ( salario * 9 / 100.0 ) - 16.5;
	else if (salario <= 3305.22) inss = ( salario * 12 / 100.0 ) - 82.604;
	else if (salario <= 6433.57) inss = ( salario * 14 / 100.0 ) - 148.708;
	else inss = 751.97;	
	return inss;
	}
	public static double irrf (double salario)	{
		
		double irrp = 0;	
		if (salario <= 1903.93) irrp =  0 ;
		else if (salario <= 2826.65) irrp = ( salario * 7.5 / 100.0 ) - 142.80;
		else if (salario <= 3751.05) irrp = ( salario * 15 / 100.0 ) - 354.80;
		else if (salario <= 4664.68) irrp = ( salario * 22.5 / 100.0 ) - 636.13;
		else if (salario >= 4664.68) irrp = ( salario * 27.5 / 100.0 ) - 869.36;
	    return irrp;
	}
	
	

}
