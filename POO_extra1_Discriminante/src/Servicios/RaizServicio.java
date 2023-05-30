/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaizServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raiz rz = new Raiz();

    public Raiz crearRaiz() {
        System.out.println("Ingrese los coeficientes a, b y c");
        rz.setA(leer.nextDouble());
        rz.setB(leer.nextDouble());
        rz.setC(leer.nextDouble());
        return rz;
    }

    public double getDiscriminate(Raiz raiz) {
        double aux = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return aux;//(b^2)-(4*a*c)
    }

    public boolean tieneRaices(Raiz raiz) {
        return (getDiscriminate(raiz) > 0);
    }

    public boolean tieneRaiz(Raiz raiz) {
        return (getDiscriminate(raiz) == 0);
    }

    public void calcular(Raiz raiz) {

        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No existe solución real");
        }

    }

    public void obtenerRaiz(Raiz raiz) {
        System.out.print("La raiz es: ");
        System.out.println(-(raiz.getB()) / (2 * raiz.getA()));
        //-b/(2*a)
    }

    public void obtenerRaices(Raiz raiz) {
        //(-b±√((b^2)-(4*a*c)))/(2*a) = (-b±√(discriminante))/(2*a)
        System.out.print("Las raices son: ");
        System.out.print((-(raiz.getB()) + Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA()));
        //(-b+√(discriminante))/(2*a)
        System.out.print(" y ");
        System.out.println((-(raiz.getB()) - Math.sqrt(getDiscriminate(raiz))) / (2 * raiz.getA()));
        //(-b-√(discriminante))/(2*a) 
    }

}
