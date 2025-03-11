
    
package onlay_it3a;
    import java.util.Scanner;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("enter a word: ");
        String original = in.nextLine();
        
        String reversed= "";
        for(int i = original.length() -1; i>=0; i--) {
            reversed += original.charAt(i);
        }
      
        
        if (original.equalsIgnoreCase(reversed)){
            System.out.println("The word is Palindrome");
            
        } else{
            System.out.println("The word is Not Palindrome");
            
        }
        
        in.close();
    }
    
}
