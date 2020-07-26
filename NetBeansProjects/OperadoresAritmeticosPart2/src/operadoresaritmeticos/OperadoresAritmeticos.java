/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author ferfe
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //floor arredonda pra baixo 8
          float v = 8.9f;
          int ar = (int)Math.floor(v);
          System.out.println(ar);
        
        //ceil arredonda pra cima 9
          float va = 8.9f;
          int ara = (int)Math.ceil(va);
          System.out.println(ara);
          
        //roud arredonda 
        //(menor que 5 para 8 5 ou mais para 9)
          float vb = 8.5f;
          int arb = (int)Math.round(vb);
          System.out.println(arb);
        
       
       //numero radomico entre 0 e 1
        double ale = Math.random();
        System.out.println(ale);
        
        //numero radomico entre 5 e 10
        double alea = Math.random();
        int na = (int)(5 + alea * (10-5));
        System.out.println(na);
        
        //numero radomico entre 15 e 50
        double aleb = Math.random();
        int nb = (int)(15 + aleb * (50-15));
        System.out.println(nb);

       //o resultado sera um inteiro 2.0
       int n1 = 2, n2 = 5 ;
       double resultado = n2/n1;
       System.out.println(resultado);
       
    }
    
}
