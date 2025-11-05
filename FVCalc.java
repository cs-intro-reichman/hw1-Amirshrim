public class FVCalc {
public static void main(String[] args)
{
		int currentValue = Integer.parseInt(args[0]);  		
		Double rate = Double.parseDouble(args[1]);  
		int years = Integer.parseInt(args[2]);  		
		double pow1= Math.pow(1+(rate/100),years);	
		double futureValue = (currentValue * (pow1));
		System.out.println("After " + years + " years, " + "$" + currentValue + " saved at " + rate + "% " + "will yield " + "$" + ((int)futureValue));
}
}