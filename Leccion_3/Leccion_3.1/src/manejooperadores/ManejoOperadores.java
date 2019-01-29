package manejooperadores;

public class ManejoOperadores {

	public static void main(String[] args) {		
		
		//Operadores Aritmeticos basicos.
		System.out.println("Operadores Aritmeticos");
		int A = 1 + 2;
		int B = A + 4;
		int C = B / 2;
		int D = C - A;
		int E = -D;
		
		System.out.println("Valor de Variable A: "+A);
		System.out.println("Valor de Variable B: "+B);
		System.out.println("Valor de Variable C: "+C);
		System.out.println("Valor de Variable D: "+D);
		System.out.println("Valor de Variable E: "+E);
		
		//Modulo
		System.out.println("\nUsando Modulos");
		System.out.println("Modulo de A mod 2: "+A%2);
		//Operador compuesto
		//A = A +2
		A += 2;
		B -= 4;
		C *= A;
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		
		//Incrementos
		//A = A + 1
		int d = 1;
		System.out.println(++d);
		System.out.println(d);
		
		//Operadores Relacionales
		System.out.println("\nOperadores Relacionales");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		boolean rex = A > B;
		System.out.println("Res = "+rex);
		
		
		
		

	}

}
