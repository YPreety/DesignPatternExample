package CreationalDesignPattern;

public class EagerInitailization {

	public static void main(String[] args) {
		SingletonEagerInitailization singletonExample = SingletonEagerInitailization.getInstance();

		singletonExample.sayHello();

	}

}

class SingletonEagerInitailization {

	private static SingletonEagerInitailization singletonExample = new SingletonEagerInitailization();

	private SingletonEagerInitailization() {
	}

	public static SingletonEagerInitailization getInstance() {

		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}