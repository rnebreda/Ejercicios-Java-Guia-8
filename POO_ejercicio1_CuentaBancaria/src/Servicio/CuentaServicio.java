/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaServicio {

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cb;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de cuenta");
        int nroCuenta = leer.nextInt();
        System.out.println("ingrese el DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el primer depósito");
        double saldoActual = leer.nextDouble();
        cb = new CuentaBancaria(nroCuenta, dniCliente, saldoActual);
        return cb;
    }

    public void Ingresar(CuentaBancaria cb, double cantDinero) {
        double nuevoSaldo = cb.getSaldoActual() + cantDinero;
        cb.setSaldoActual(nuevoSaldo);
    }

    public void Retirar(CuentaBancaria cb, double cantDinero) {
        double nuevoSaldo;
        if (cantDinero > cb.getSaldoActual()) {
            System.out.println("Saldo insuficiente. Retira " + cb.getSaldoActual());
            nuevoSaldo = 0;
        } else {
            nuevoSaldo = cb.getSaldoActual() - cantDinero;
            System.out.println("Su nuevo Saldo es: "+ nuevoSaldo);
        }
        cb.setSaldoActual(nuevoSaldo);
    }
        
        

    public void ExtraccionRapida(CuentaBancaria cb, double cantDinero) {
        double nuevoSaldo;
        if (cantDinero > (cb.getSaldoActual()*0.2)) {
            System.out.println("Cantidad supera el límite. Retira " + (cb.getSaldoActual()*0.2));
            nuevoSaldo = cb.getSaldoActual()*0.8;
        } else {
            nuevoSaldo = cb.getSaldoActual() - cantDinero;
            System.out.println("Su nuevo Saldo es: "+ nuevoSaldo);            
        }
        cb.setSaldoActual(nuevoSaldo);

    }
    
    public void ConsultarSaldo (CuentaBancaria cb){
        System.out.println("El saldo Actual de su Cuenta es: "+ cb.getSaldoActual());
        
    }
 
        public void ConsultarDatos (CuentaBancaria cb){
        System.out.println("Datos de la Cuenta ");
            System.out.println( cb.toString());
            System.out.println("");
            System.out.println("El numero de la Cuenta es: " + cb.getNroCuenta());
            System.out.println("El DNI es: " + cb.getDniCliente());
            System.out.println("El Saldo Actual es: "+ cb.getSaldoActual());
    }
    
}
