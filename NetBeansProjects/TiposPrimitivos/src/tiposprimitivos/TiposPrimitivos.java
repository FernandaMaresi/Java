/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author ferfe
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
        int idade = teclado.nextInt();
        
        /*String nome = "Gustavo";
        
        float nota = 8.5f;
        
        float nota1 = 8.5f;
        
        System.out.println("A nota é "+nota);
        
        System.out.printf("Sua nota é %.4f \n",nota);
        
        System.out.printf("A nota de  é %s é %.2f \n",nome, nota);
        
        System.out.format("A nota de  é %s é %.1f \n",nome, nota1);*/
        
        
    }
    
}
