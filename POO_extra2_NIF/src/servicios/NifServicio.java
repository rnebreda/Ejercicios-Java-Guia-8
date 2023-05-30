/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NifServicio {
        private Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] letra= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        
        
        public Nif crearNif(){
            Nif nif = new Nif();
            System.out.println("Ingrese el DNI");
            long dni = leer.nextLong();
            int aux = (int)(dni%23);
            nif.setDni(dni);            
            nif.setLetra(letra[aux]);
            return nif;
        }
        
        public void mostrar (Nif nif){
            System.out.println("El NIF es "+nif.getDni()+"-"+nif.getLetra());
        }
}


