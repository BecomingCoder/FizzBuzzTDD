
public class FizzBuzzClass {

	public static String FizzBuzzMethod(int input) {
	
		String output = "";
		
		if (isDiv(input, 3))
			output += "Fizz";
		
		if (isDiv(input, 5))
				output += "Buzz";
		
//		return Integer.toString(input);
		return output.equals("") ? Integer.toString(input) : output;
		
//		if (input %3 == 0 && input %5 == 0)
//			return "FizzBuzz";
//		
//		if (input %3 == 0)
//			return "Fizz";
//		
//		if (input %5 == 0)
//			return "Buzz";
		

	}
	
	public static boolean isDiv(int num, int div) {
		return (num % div == 0);
	}
	
}