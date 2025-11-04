
public class Ascend {
	public static void main(String[] args)
	 {
		double a = Math.random() * 100 ;
		double b = Math.random() * 100 ;
		double c = Math.random() * 100 ;
		double Getmax = Math.max(a, Math.max(b, c ));
		double Getmin = Math.min(a, Math.min(b, c ));
		double Getmid = a + b + c - Getmax - Getmin;
		System.out.println("The numbers in ascending order are: " + Getmin + ", " + Getmid + ", " + Getmax);
	}
}
