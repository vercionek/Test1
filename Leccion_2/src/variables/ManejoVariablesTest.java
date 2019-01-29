package variables;

public class ManejoVariablesTest {
	public static void main(String[] args) {
		//Variables boolean, declaracion
		boolean bool1;
		//Inicialitation
		bool1 = true;
		//Declaracion e Inicializacion
		boolean bool2 = false;
		System.out.println("Valor Bool1: "+bool1);
		System.out.println("Valor Bool2: "+bool2);
		
		//Variable byte
		byte b1 = 10;
		//Literal en Hexadecimal
		byte b2 = 0xa;
		System.out.println("Valor byte1: "+b1);
		System.out.println("Valor byte2: "+b2);
		
		//Variable Short
		short s1 = 2;
		System.out.println("Valor Short: "+s1);
		
		//Variable char, declaracion e iniciliazacion en una sola linea
		//La primera declaracion es un UNICODE
		//http://www.icursos.net/referencias/TablaUnicode.html
		
		char ch1 = 65, ch2 = 'A';
		System.out.println("Valor char1: "+ch1);
		System.out.println("Valor char2: "+ch2);
		
		//Variables Enteras
		int decimal = 100;
		int octal = 0144;
		int hexa = 0x64;
		System.out.println("Valor int decimal: "+decimal);
		System.out.println("Valor int octal: "+octal);
		System.out.println("Valor int hexa: "+hexa);
		
		//Variables Long
		long long1 = 10, long2 = 20L;
		System.out.println("Valor long1: "+long1);
		System.out.println("Valor long2: "+long2);
		
		//Valor Float
		float f1 = 15;
		float f2 = 22.3F;
		System.out.println("Valor float f1: "+f1);
		System.out.println("Valor float f2: "+f2);
		
		//Variables Doubles
		double d1 = 14.33, d2 = 15.33;
		System.out.println("Valor Double d1; "+d1);
		System.out.println("Valor Double d2; "+d2);
		
	}

}
