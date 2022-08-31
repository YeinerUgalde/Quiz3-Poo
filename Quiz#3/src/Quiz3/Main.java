package Quiz3;
import java.util.Scanner;
import java.util.ArrayList;
import Quiz3.OtroClass;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
	    float number = input.nextShort();
	    System.out.println("Numero ingresado: " + number);
	    input.close();	
	    
	    //number = number << 1;
	    number *= 8.721;
	   
	    System.out.println("Multiplicado " + number);
	   
	    //number = number >> 1;
	    number= number / 2;
	    System.out.println("\nDividido " + number);
	    
	    number-=0.35f;
	    System.out.println("\nResta " + number);
	    
	    number%=1.63;
	    System.out.println("\nModulo " + number);
	    
	    //Clase que usa a otra clas----->
	    
	    ArrayList lista = new ArrayList();
	    OtroClass listanueva = new OtroClass();
	    listanueva.setElement(lista, 10);
	    
	    listanueva.setElement(lista, 20);
	    
	    lista=listanueva.getLista();
	    
	    System.out.println(lista.get(0));
	    
	    
	    
	}
	

}
