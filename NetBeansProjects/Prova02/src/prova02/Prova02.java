/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova02;

/**
 *
 * @author fernanda.maresi
 */
public class Prova02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 5; i++) {
	if (i==2) continue;
            System.out.println(i);
	System.out.println(" i = " + i); 
        }
    }
    
}