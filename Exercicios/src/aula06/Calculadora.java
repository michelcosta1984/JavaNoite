package aula06;


import util.Mat;

public class Calculadora {

  public static void main (String [] args)	{
	System.out.println(Mat.fat(2));
    System.out.println(Mat.pot(2, 3));
   //imprimir o MDC de 2 inteiros
    int resp = Mat.MDC(100,80);
    System.out.println( Mat.MDC(100,80));
    //imprimir o mmc de 2 inteiros
    //int resp = Mat.MMC(12.18);
    System.out.println( Mat.MMC(12,18));
	
	
}
}
