/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihanexceptioni;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Willy
 */
public class Exc11 {
     public static void main (String [] args){
        int n = 0;
         try {
             n = System.in.read();
         } catch (IOException ex) {
             Logger.getLogger(Exc11.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println("Hasil :"+(char)n);
    }
}
