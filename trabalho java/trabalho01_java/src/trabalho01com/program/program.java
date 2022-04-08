package trabalho01com.program;

import java.util.Scanner;
public class program {
  /// QUESTÃO 01
	
	public static void main(String [] args) {
    System.out.println(" digite o valor: ");
    Scanner scan = new Scanner (System.in);
    
    double raio = scan.nextFloat();
    double area = Math.PI * raio * raio;
     System.out.print( " área: ");
     System.out.print( String.format  (" % .4f" , area));
	}
}
