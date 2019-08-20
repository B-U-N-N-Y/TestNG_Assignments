package Calculator;
import java.util.*;

public class Input {
	private double x1;
	private double y1;
	Scanner in = new Scanner(System.in);

	public void setfirst(double x1) {
		this.x1 = x1;
	}

	public void setsecond(double y1) {
		this.y1 = y1;
	}

	public double getfirst() {
		return x1;
	}

	public double getsecond() {
		return y1;
	}

	public void setContinue(double y1) {
		this.y1 = y1;
	}

	public double getContinue() {
		return y1;
	}


}
