/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.Scanner;
public class Circulo {
    // propiedades
    private int radio;
    // metodo statico que no cambia en el tiempo
    public static double PI = 3.141516;
    // metodos.
    
    public void set_Radio(int value){
        int c1=0,c2=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("\t >>> AREA DEL CIRCULO <<<");
        System.out.println(" => Ingrese la longitud del Radio(circulo)");
       int radio = teclado.nextInt();
      
        this.radio = radio;          
    }
    public int get_Radio(){
           return this.radio;
    }
    
}
