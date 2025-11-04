public class FVCalc {
    public static void main(String[] args)
    {
        int currentValue = Integer.parseInt(args[0]);
        double rateInput = Double.parseDouble(args[1]); 
        int years = Integer.parseInt(args[2]);
        double rateFactor = rateInput / 100.0; 
        double futureValueCalc = currentValue * Math.pow( (1 + rateFactor), years);
        int futureValue = (int) Math.round(futureValueCalc);
        System.out.println("After " + years + " years, $" + currentValue +  " saved at " + rateInput + "% will yield $" + futureValue);
    }
}