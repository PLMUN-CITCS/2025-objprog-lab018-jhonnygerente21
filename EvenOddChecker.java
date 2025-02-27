import.java.util.Scanner;

public class EvenOddChecker {
	public Int getUserInput() {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = scanner.nextInt();
	scanner.close();
	return number;

}
	public static boolean isEven(int number) {
	return number % 2 == 0;
}
	public static void main(String) args) {
	int number = getUserInput();
	if (isEven(number)) {
	System.out.printIn("The number" + number " + is even");

}	else {
	System.out.printIn("The number" + number " + is Odd");

}
}
}