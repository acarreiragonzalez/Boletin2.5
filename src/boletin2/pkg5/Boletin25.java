
package boletin2.pkg5;

import java.util.Scanner;


 
public class Boletin25 {

  
    public static void main(String[] args) {
            float millas, kilometros;
    System.out.println("millas");
    Scanner dato = new Scanner (System.in);
    millas =dato.nextFloat();
    kilometros= (float) (millas *1.448);
    System.out.println("en quilometros es igual a" +kilometros);
       
    }
    
}
