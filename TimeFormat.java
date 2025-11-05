public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int mins = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String whatpart= "";
		if (hours >= 0 && hours < 12) {
			whatpart = "AM";
			if (args[0].charAt(0) == '0') {
				hours = Character.getNumericValue(args[0].charAt(1));	}
		}
		if (hours >= 12) {
			whatpart = "PM";
			if (hours != 12)
			{
			hours = (hours -12);
			}
		}
		System.out.println(hours + ":" + String.format("%02d", mins) + " " + whatpart);

		
	}
}