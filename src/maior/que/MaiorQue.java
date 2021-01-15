
package maior.que;

import java.util.Scanner;


public class MaiorQue {

        public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero=0;
    int res=0;
    
    
    System.out.println("Informe um número: ");
     numero = entrada.nextInt();
    if(numero>=50){            
    System.out.println("O numero informado é maior que 50!");}
    else{                     
    System.out.println("O numero informado é menor que 50!");
    
    }
}
}  
