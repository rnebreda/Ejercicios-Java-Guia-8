/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio1_cuentabancaria;

import Servicio.CuentaServicio;
import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_ejercicio1_CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        CuentaBancaria cb=null;

        String opcion;

        do {
            double aux;
            System.out.println("1 - Crear Cuenta");
            System.out.println("2 - Ingresar Dinero");
            System.out.println("3 - Retirar Dinero");
            System.out.println("4 - Extracción Rápida");
            System.out.println("5 - Mostrar Datos de Cuenta");
            System.out.println("6 - Saldo Actual");
            System.out.println("99 - Salir");
            System.out.println("Ingrese una opción");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    cb = cs.crearCuenta();
                    break;
                case "2":
                    System.out.println("Ingrese cantidad de dinero a depositar");
                    aux = leer.nextDouble();
                    cs.Ingresar(cb, aux);
                    break;
                case "3":
                    System.out.println("Ingrese cantidad de dinero a retirar");
                    aux = leer.nextDouble();
                    cs.Retirar(cb, aux);
                    break;
                case "4":
                    System.out.println("Ingrese cantidad de dinero a retirar");
                    aux = leer.nextDouble();
                    cs.ExtraccionRapida(cb, aux);
                    break;
                case "5":
                    cs.ConsultarDatos(cb);
                    break;
                case "6":
                    cs.ConsultarSaldo(cb);
                    break;
                default:
                    break;

            }

        } while (!opcion.equals("99"));

    }

}
