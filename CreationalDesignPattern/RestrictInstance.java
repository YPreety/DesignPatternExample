package CreationalDesignPattern;

public class RestrictInstance {

	public static void main(String[] args) {
		Singleton singletonExample1 = Singleton.getInstance();
		Singleton singletonExample2 = Singleton.getInstance();
		Singleton singletonExample3 = Singleton.getInstance();
		Singleton singletonExample4 = Singleton.getInstance();
		Singleton singletonExample5 = Singleton.getInstance();
		Singleton singletonExample6 = Singleton.getInstance();
		System.out.println(singletonExample1.hashCode());
		System.out.println(singletonExample2.hashCode());
		System.out.println(singletonExample3.hashCode());
		System.out.println(singletonExample4.hashCode());
		System.out.println(singletonExample5.hashCode());
		System.out.println(singletonExample6.hashCode());


	}

}

class Singleton {

	private static Singleton singletonExample = null;
	static int count = 0;

	private Singleton() {
		System.out.println("Singleton : private constructor");
		count++;
	}

	public static synchronized Singleton getInstance() {
		if (count < 3) {
			singletonExample = new Singleton();
		}
		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");

	}
}