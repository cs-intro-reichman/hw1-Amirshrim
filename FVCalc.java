public class FVCalc {
	public static void main(String[] args)
	{
		int Currentvalue = Integer.parseInt(args[0]);
		double Rate = Double.parseDouble(args[1]);
		int Years = Integer.parseInt(args[2]);

		if (Rate >= 0 && Rate <= 100 && Years >= 0 )
		{			
		Rate= Rate/100;	
		double feautreValue = Currentvalue * Math.pow( (1+Rate), Years);
		System.out.println("The future value is: " + feautreValue);
		}
		


	}
}