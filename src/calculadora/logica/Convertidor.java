package calculadora.logica;


public class Convertidor extends Logica{
String oct="";
String binary="";
String hexa="", deci="";
int x;
		public String binario(){	
			binary = Integer.toBinaryString(getresultado());
			System.out.println(binary);
		return binary;	
		
	}	
		
		public String octal(){
			oct = Integer.toOctalString(getresultado());
			System.out.println(oct);
		return oct;
		}
		
		public String hexadecimal(){
			hexa = Integer.toHexString((int) resultado);
			System.out.println(hexa);
			System.out.println("\n"+resultado);
			return hexa;
			
		}
		
		public String decimal(){
			deci=String.valueOf(resultado);
			System.out.println(resultado);
			return deci;
		}
}
