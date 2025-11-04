// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        String name = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double amount = Double.parseDouble(args[3]); 
        double split = Math.ceil(amount / 3.0);      

        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name + 
                           ": pay " + split + " Shekels each.");
    }
}