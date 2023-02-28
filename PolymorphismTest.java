

package chapter10;

import chapter8_9.*;

public class PolymorphismTest {

    public static void main(String[] args) {

        CommissionEmployee ce = new CommissionEmployee("migel", "cep",
         "4456544", 1050, .04);

        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("kdns", "sdnakl",
         "sdjksdnj", 2000, .5, 500);
        
         //thirrja e metodes toString ne objektin e superklases duke perdorur variabel superklase
         System.out.println(ce.toString());

         //e njejta gje por me nenklasen
         System.out.println(bce.toString());

         //thirja e toString ne nje objekt te nenklases duke perdorur ne variabel nga superklasa
         CommissionEmployee ce2 = bce; //vleredhenia
         System.out.println(ce2.toString());

    }
    
}
