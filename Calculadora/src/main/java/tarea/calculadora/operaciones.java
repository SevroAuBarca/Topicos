/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.calculadora;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class operaciones {

    double num1, num2;

    public operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma() {
        return this.num1 + this.num2;
    }

    public double resta() {
        return this.num1 - this.num2;
    }

    public double multiplicacion() {
        return this.num1 * this.num2;
    }

    public double division() {
        return this.num1 / this.num2;
    }

    public double raiz() {
        return Math.sqrt(num1);
    }

    public double cuadrado() {
        return Math.pow(num1, 2);
    }

    public double potencia() {
        return Math.pow(num1, num2);
    }

    public double inverso() {
        return 1/num1;
    }

    public double seno() {
        return Math.sin(num1);
    }

    public double coseno() {
        return Math.cos(num1);
    }

    public double tangente() {
        return Math.tan(num1);
    }

    public double factorial() {
        double fact = 1;
        while (num1 != 0) {
            fact *= num1;
            num1--;
        }
        return fact;
    }
}
