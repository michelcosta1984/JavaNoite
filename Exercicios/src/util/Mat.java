package util;

public interface Mat {
	/**
	 * O metodo fat calcula o fatorial de um numero.
	 * O fatorial de um numero pode ser expresso da seguinte forma:
	 * n! = n x (n-1) x (n-2) x ... x 2 x 1
	 * por definicao ; 1! = 1 e 0! = 1
	 * @param
	 *
	 */
     public static double fat(int num) {
    	 
    	
 		double total = 1;		
 		for (int i=1 ; i<=num ; i++) {
 			total *= i;			
 		
 		} 
 		return total;
     }
     
     /**
      * o metodo <b> pot calcula a potencia de um 
      * numero elevado a outro. o metodo retorna 0 para indefinicao 
      * matematica 0^0.
      *  @param base a base da potencia
      * @param exp o expoente da potencia
      * @return o valor base^exp
      */
    public static double pot(double base, int exp) {
 	double total = 1;
 	if (base == 0) return 0;
 	if (exp < 0) {
 		exp = - exp;
 		base = 1/ base;
 	}
	for (int i=1 ; i<=exp ; i++) {
		total *= base;		
		
	}	
		return total;
		
    }	
	/**
	 * calcula o mdc <b>mdc 
	 * @param a
	 * @param b
	 * @return
	 */
		public static int MDC(int a, int b) {
			int div;
			// acha qual e o menor
			if (a < b ) div = a;
			else div = b;
			//calcula o resto da divisao dos dois
			while (true) {
			int ra = a % div ;
			int rb = b % div;
			// se os dois restos forem zero -> achou			
			if ((ra == 0) && (rb == 0)) return div;
			// se nao forem zero , subtrai 1 do numero e volta ao passo 2
			else div --  ;
			
			}
			}
		/**
		 * calcula o minimo multico como entre dois inteiros
		 * @param a primeiro numero
		 * @param b segundo numero
		 * @return o MMC (a,b).
		 */
			public static int MMC(int a, int b) {
				int mult;
				// acha o maior dos dois
				if (a > b ) mult = a;
				else mult = b;
				//calcula o resto da divisao dos dois
				while (true) {
				int ra = mult % a ;
				int rb = mult % b ;
				// se os dois restos forem zero -> achou			
				if ((ra == 0) && (rb == 0)) return mult;
				// se nao forem zero , subtrai 1 do numero e volta ao passo 2
				else mult ++ ;
				
				
			}
			
			}		
			
		}
		

