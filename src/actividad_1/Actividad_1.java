/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_1;
import java.util.Scanner;

/**
 *
 * @author Daniel Salinas
 */
public class Actividad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        Scanner lee = new Scanner(System.in);
        System.out.println("¿cuantos escalones vas a bajar?");
        x =  lee.nextInt();
        Escalera.Escalon(x);
        
    }
    
}
