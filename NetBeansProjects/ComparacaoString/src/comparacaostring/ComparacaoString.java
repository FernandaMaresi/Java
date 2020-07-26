/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author ferfe
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Fernanda";
        String nome2 = "Fernanda";
        String nome3 = new String("Fernanda");
        String res;
        
        //igual
        res = (nome1 == nome2)?"igual":"diferente";
        System.out.println(res);
        
        //diferente
        String resa;
        resa = (nome1 == nome3)?"igual":"diferente";
        System.out.println(resa);
        
        //String com objeto usa o equals
        String resb;
        resb = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resb);
    }
    
}
