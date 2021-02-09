package CreationalDesignPattern;

public class DoubleCheckedLocking {

	public static void main(String[] args) {
		SingletonDoubleChecked singletonExample = SingletonDoubleChecked.getInstance();

		singletonExample.sayHello();

	}

}

class SingletonDoubleChecked {

	private static SingletonDoubleChecked singletonExample = null;

	private SingletonDoubleChecked() {
	}

	public static synchronized SingletonDoubleChecked getInstance() {
		if (singletonExample == null) {
			synchronized (SingletonDoubleChecked.class) {
				if (singletonExample == null) {
					singletonExample = new SingletonDoubleChecked();
				}

			}
		}
		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}
