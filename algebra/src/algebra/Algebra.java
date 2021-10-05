/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Algebra  {

    public void operacion (){
        Scanner teclado=new Scanner (System.in);
        int a=0, b=0;
        System.out.println("ingrese la primera variable a = ");
        a=teclado.nextInt();
        System.out.println("ingrese la segunda variable b = ");
        b=teclado.nextInt();
        
        
        if (a>b){
            System.out.println("\n a es mayor que b");
        }
        else if (a<b){
                System.out.println("\n a es menor que b");
            }
            else{
                System.out.println("\n a es igual que b");
            }
    }
    
  
    public static void main(String[] args) {
        Algebra resul=new Algebra ();
       resul.operacion ();
       //resul.Sistemaecuaciones2x2();

    }
    
}
