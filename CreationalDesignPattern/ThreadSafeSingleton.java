package CreationalDesignPattern;

public class ThreadSafeSingleton {

	public static void main(String[] args) {
		SingletonThreadSafe singletonExample = SingletonThreadSafe.getInstance();

		singletonExample.sayHello();

	}

}

class SingletonThreadSafe {

	private static SingletonThreadSafe singletonExample = null;

	private SingletonThreadSafe() {
	}

	public static synchronized SingletonThreadSafe getInstance() {
		if (singletonExample == null) {
			singletonExample = new SingletonThreadSafe();
		}
		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}
