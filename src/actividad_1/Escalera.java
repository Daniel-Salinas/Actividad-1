/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1;

/**
 *
 * @author Daniel Salinas
 */
public class Escalera {
     public static int Escalon (int n){
         if (n==0) {
                            System.out.println("has concluido tu viaje");
                                return 0;
			} else {
                           System.out.println("bajaste al escalon " + n);
                                return Escalon (n-1);
                                
			}
     }
}
