import java.util.Date;

public class FormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello";
		int index = greeting.offsetByCodePoints(0, 1);
		int codePoint = greeting.codePointAt(index);
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println(cpCount);
		System.out.println("\u0061\u0061");
//		System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due Date:", new Date());
	}

}
