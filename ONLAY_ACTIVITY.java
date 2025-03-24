
package onlay_it13a;
//
///**
// *
// * @author User
// */
//public class ONLAY_ACTIVITY {
//  public static void main (String[] args){
//      String[] array = {"A", "B", "C", "D", "F", "G"};
//      for (String letter : array){
//          System.out.print(letter + ",");
//      }
//      
//  }  
//}
public class ONLAY_ACTIVITY {
    public static void main(String[] args) {
       int[][] array = {
           {1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}
           
       };
      
    
           for (int i = 0; i < array.length; i++){
               
    System.out.print("The elements in row" + (i + 1) + ":");
    for(int j = 0; j < array[i].length; j++)
    {
        System.out.print (array[i][j] + " ");
    }
        
     System.out.println();
    }
}
               
    }         
               
 
    
