package hellogit;

public class Hello {
	public static void main(String[] args) {
		String[] names = {"mic","jen","ben"};
		for (String name : names) {
			System.out.println("Hello " + name +"!");
			System.out.format("Hi! %s\n",  name);
		}
	}
}
