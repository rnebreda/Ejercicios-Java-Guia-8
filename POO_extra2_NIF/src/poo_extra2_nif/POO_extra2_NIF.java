/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra2_nif;

import entidades.Nif;
import servicios.NifServicio;

/**
 *
 * @author Usuario
 */
public class POO_extra2_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        Nif nif = ns.crearNif();
        ns.mostrar(nif);


    }

}
