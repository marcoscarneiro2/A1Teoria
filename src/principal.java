import java.util.Scanner;
import java.util.regex.Pattern;

public class principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s,a,b;
		
		System.out.printf("\n=========CONCATENAÇÃO=========\n\n");
	    System.out.printf("Informe o primeiro valor ");
	    a = ler.next(); 
	    
	    System.out.printf("Informe o segundo valor ");
	    b = ler.next(); 
		
		 s = a + b ;  
		   System.out.println (s);
		
	}
	
}
