package CreationalDesignPattern;

public class ThreadSafeSingleton2 {

	public static void main(String[] args) {
		SingletonThreadSafe2 singletonExample = SingletonThreadSafe2.getInstance();

		singletonExample.sayHello();

	}

}

class SingletonThreadSafe2 {

	private static SingletonThreadSafe2 singletonExample = null;

	private SingletonThreadSafe2() {
	}

	public static SingletonThreadSafe2 getInstance() {
		if (singletonExample == null) {
			synchronized (SingletonThreadSafe2.class) {
				singletonExample = new SingletonThreadSafe2();
			}
		}
		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}