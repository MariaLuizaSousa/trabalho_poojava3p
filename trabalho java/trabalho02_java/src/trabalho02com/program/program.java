package trabalho02com.program;
import java.util.Locale;
import java.util.Scanner;
public class program {
	

	 public static void main (String [] args) {
     // QUEST�O 02
		 
	 Locale.setDefault ( Locale.US );
	 Scanner input = new Scanner ( System.in);
	 double a, b, c, pi;
	 double triangulo, circulo , trapezio, quadrado, retangulo;
	 	 pi = 3.14159;
	 a = input.nextDouble( );
	 b = input.nextDouble( );
	 c = input.nextDouble( );
	 
	 triangulo = a * c /2;
     circulo  =  pi * c * c;
     trapezio = ( a + b ) * c /2;
     quadrado = b * b;
   	 retangulo = a * b ;
   	 
   	System.out.println("�rea do triangulo : " + String.format( " %.3f ", triangulo ) );
   	System.out.println("�rea do circulo : " + String.format( " %.3f ", circulo ) );
   	System.out.println("�rea do trapezio : " + String.format( " %.3f ", trapezio ) );
   	System.out.println("�rea do quadrado : " + String.format( " %.3f ",  quadrado ) );
   	System.out.println("�rea do retangulo  : " + String.format( " %.3f ", retangulo ) );
}
}