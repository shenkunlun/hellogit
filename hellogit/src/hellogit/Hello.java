package hellogit;

public class Hello {
	public static void main(String[] args) {
		String[] names = {"mic","jen","ben","heng"};
		for (String name : names) {
			System.out.println("Hello " + name +"!ssss");
			System.out.format("Hi! %s\n",  name);
		}
	}
}
