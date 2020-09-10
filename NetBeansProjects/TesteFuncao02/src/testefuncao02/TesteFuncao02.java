/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author fernanda.maresi
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    //n%2 = 2/2 = 1
    static int f1(int n){
        return n%2;
    }
    //n*2 = 5*2 = 10
    static int f2(int n){
        return n*2;
    }
    //10+1 = 11
    static int f3(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1,5));
        
        System.out.println(f3(f1(3), f2(5)));
    }
    
    
}
