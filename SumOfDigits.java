package day2;

public class SumOfDigits {
	public static void main(String arg[]) {
		int num = 123;
		int digit1 = num % 10;
		int n2 = num / 10;
		int digit2 = n2 % 10;
		int n3 = n2 / 10;
		int digit3 = n3 % 10;
		int sum = digit1 + digit2 + digit3;
		System.out.println(n3);
		System.out.println(digit3);

		System.out.println(sum);

	}

}
