
public class StringBuilderTest {
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("j");
		builder.append("oey");
		
		String completedString = builder.toString();
		
		System.out.println(completedString);
		
		String greetings = "Hello";
		greetings = greetings.substring(0, 2);
		
		System.out.println(greetings);
	}
}
