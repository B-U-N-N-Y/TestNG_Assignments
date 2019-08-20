package Calculator;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		try {
			cal();
		} catch (Exception e) {
			System.out.println("Please give integer or Double values");
			try {
				cal();
			} catch (Exception r) {
				System.out.println("Please give integer or Double values");
				try {
					cal();
				} catch (Exception t) {
					System.out.println("Operation Break 3 Times Wrong Input");
					System.exit(0);
				}

			}
		}

	}

	public static void cal() {
		int k = 1;
		while (k > 0) {
			Input i = new Input();
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the first Number: ");
			i.setfirst(in.nextDouble());
			System.out.print("Enter the second Number: ");
			i.setsecond(in.nextDouble());

			System.out.print("Which Operation you want to do(+,-,*,/,%):");
			in.nextLine();
			String s = in.nextLine();
			if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*") || s.equals("%")) {
			} else {
				System.out.println("Please select the right Operation");
			}
			Operation o = new Operation(i.getfirst(), i.getsecond());
			o.operation(s);
			int k1 = 1;
			while (k1 > 0) {
				System.out.print(
						"Press 1 for continue with previous result or 2 for new Calculation or 3 for stop operation: ");
				try {
					int q = in.nextInt();
					if (q == 1) {
						System.out.print("Enter the Value: ");
						i.setContinue(in.nextDouble());
						System.out.print("Which Operation you want to do(+,-,*,/,%):");
						in.nextLine();
						o.conti(i.getContinue(), in.nextLine());
					} else if (q == 2) {
						k1 = 0;

					} else if (q == 3) {
						System.out.println("Opertion Succefully Finished Calculator is now OFF");
						System.exit(0);

					} else {
						System.out.println("Please select the given options");
					}
				} catch (Exception e) {
					System.out.println("You enter Wrong input please enter correct input");
					cal();
				}
			}
		}
	}

}
