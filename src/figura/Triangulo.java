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
public class Triangulo {

    private double base;
    private double altura;

    // Constructor de la clase
    public Triangulo(double base, double altura) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("\t >>> AREA DEL TRIANGULO <<<");
        System.out.println(" Ingrese la longitud de la base");
        base = teclado.nextInt();
        System.out.println(" Ingrese la longitud de la altura");
        altura = teclado.nextInt();
        this.base = base;
        this.altura = altura;
    }

    public double GetAltura() {
        return this.altura;
    }

    public double GetBase() {
        return this.base;
    }

}
