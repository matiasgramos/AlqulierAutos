/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerautos;

import java.util.Scanner;
/**
 *
 * @author Guada
 */
public class AlquilerAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km =-1, cobro = 0;

        while (km != 0){
            Scanner entrada = new Scanner(System.in);

            
            System.out.println("Ingrese km recorridos");
            km = entrada.nextInt();
            if (km <= 200){
                cobro = 300;
            }
            else if (km <= 1000){
                cobro = 300 + (km - 200)*5;
            }
            else if (km > 1000){
                cobro = 300 + (1000 - 200)*5 + (km-1000)*10;
                        
            }
            
            

            System.out.println("el precio a cobrar es:");
            
            System.out.println(cobro);
        }

    }
    
}
