
package Prelim;


public class Act1_Arithmetic_Operators {
     public static void main(String[] org){
             
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3; 
        
        
        
        int ONLAY1 = numb1 * numb3 + numb2;
        int depends1 = numb1 - numb3;
        int ONLAY2 = depends1 % numb2;
        int depends2 = numb1 + numb3 + numb2;
        int ONLAY3 = depends2 / numb4;
        int depends3 = numb3 * numb3;
        int ONLAY4 = numb1 * numb2 - depends3;
        
          System.out.println("10 * 4 + 6 ="+ ONLAY1);
         System.out.println("(10-4) % 6 = "+ ONLAY2);
            System.out.println("(10 + 4 + 6)/3 = "+ ONLAY3);
               System.out.println("10 * 6 -(4 * 4 ) = "+ ONLAY4);
               
     }
}
