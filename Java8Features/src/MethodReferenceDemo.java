import java.util.function.Function;
import java.util.function.IntConsumer;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		Function<Integer, Boolean> function = new MethodReferenceDemo()::isNumPositive;

		IntConsumer intConsumer = new MethodReferenceDemo() ::isNumPositive1;
	}

	public boolean isNumPositive(int num) {
		if (num > 0)
			return true;
		return false;
	}

	public void isNumPositive1(int num) {
		if (num > 0)
			System.out.println("num is positive");
		System.out.println("num is negative");
	}
}
