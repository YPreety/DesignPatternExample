package CreationalDesignPattern;

public class StaticBlockInitialization {

	public static void main(String[] args) {
		SingletonStaticBlock singletonExample = SingletonStaticBlock.getInstance();

		singletonExample.sayHello();

	}

}

class SingletonStaticBlock {

	private static SingletonStaticBlock singletonExample = null;

	private SingletonStaticBlock() {
	}

	static {
		try {
			singletonExample = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("exception occurred");
		}
	}

	public static SingletonStaticBlock getInstance() {

		return singletonExample;
	}

	public void sayHello() {
		System.out.println("Hello");
	}
}
