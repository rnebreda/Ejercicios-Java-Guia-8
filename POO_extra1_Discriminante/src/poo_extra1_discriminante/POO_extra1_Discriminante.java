/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_extra1_discriminante;

import Entidades.Raiz;
import Servicios.RaizServicio;

/**
 *
 * @author Usuario
 */
public class POO_extra1_Discriminante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaizServicio rs = new RaizServicio();
        Raiz rz= rs.crearRaiz();
        rs.calcular(rz);
        
        
    }
    
}
