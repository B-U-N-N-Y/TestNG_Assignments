package Calculator;

public class Operation {
	double s;
	private double x;
	private double y;
	private String v;

	public Operation(double x, double y) {
		this.x = x;
		this.y = y;
		
	}


	public double operation(String v) {

		switch (this.v=v) {
		case "+":
			s = x + y;
			System.out.print("The Result of(" + x + " + " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "-":
			s = x - y;
			System.out.print("The Result of(" + x + " - " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "*":
			s = x * y;
			System.out.print("The Result of(" + x + " * " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		case "/":
			s = x / y;
			System.out.print("The Result of(" + x + " / " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();
			break;
		default:
			s = x % y;
			System.out.print("The Result of(" + x + " % " + y + ")= ");
			System.out.printf("%.2f", s);
			System.out.println();

		}
		return s;
	}

	public void conti(double y, String v) {
		x = s;
		this.y = y;
		operation(v);

	}

}
