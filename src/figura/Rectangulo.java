/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import java.util.Scanner;

/**
 *
 * @author Diego Ramirez Villanueva (*)
 */
public class Rectangulo {
     private double base1;
    private double altura1;
public Rectangulo(double base, double altura) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("\t >>> AREA DEL RECTANGULO <<<");
        System.out.println(" Ingrese la longitud de la base");
        base = teclado.nextInt();
        System.out.println(" Ingrese la longitud de la altura");
        altura = teclado.nextInt();
        this.base1 = base;
        this.altura1 = altura;
    }

 public double GetAltura() {
        return this.altura1;
    }

    public double GetBase() {
        return this.base1;
}
}
