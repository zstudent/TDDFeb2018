package lesson180219;

public class FizzBuzz {

	public String fizzBuzz(int i) {
		
		if (i < 0) {
			throw new IllegalArgumentException();
		}

		String result = "";

		if (i % 3 == 0)
			result += "fizz";

		if (i % 5 == 0) {
			result += "buzz";
		}

		return "".equals(result) ? Integer.toString(i) : result;

	}
}
