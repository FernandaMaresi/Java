/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author ferfe
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean r,ra,rb,rc,rd,re;
        //&&-E
        r = (x < y && y < z)?true:false;
        System.out.println(r);
        ra= (x < y && y == z)?true:false;
        System.out.println(ra);
        
        //||-OU
        rb = (x < y || y < z)?true:false;
        System.out.println(rb);
        rc= (x < y || y == z)?true:false;
        System.out.println(rc);
        
        //^-OU (Exclusivo)
        rd = (x < y ^ y < z)?true:false;
        System.out.println(rd);
        re= (x < y ^ y == z)?true:false;
        System.out.println(re);
        
        
    }
    
}
