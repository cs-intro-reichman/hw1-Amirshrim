public class NumWords
 {
    
    public static void main(String args[])
    {
        if (args.length == 0) {
            System.out.println("Error: Please provide a number as a command-line argument.");
            return;
        }
        
        int number = Integer.parseInt(args[0]);
        
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;
        
        if (hundreds > 0) {
            System.out.print(hundreds + " hundreds ");
        }
        
        if (tens > 0) {
            System.out.print(tens + " tens ");      
        }
        
        if (units > 0) {
            System.out.print(units + " units");
        }
        
        System.out.println(); 
    } 
    
} 