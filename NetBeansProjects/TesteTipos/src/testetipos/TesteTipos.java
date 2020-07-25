/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author ferfe
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 31;
        String valor = Integer.toString(idade);
        System.out.println("idade = "+valor);*/
        
        String valor = "30.5";
        //int idade = (int)valor;
        //int idade = Integer.parseInt(valor);
        //System.out.println(idade);
        
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f \n",idade);
    }
    
}
