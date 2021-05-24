
class User extends Object {
	public User(String name) {
		this.name = name;
	}

	@Override
	public java.lang.String toString() {
		return this.name;
	}
	String name;
}
public class Day6 {
	public static void main(String[] args) {
		User user = new User("Ram");
		System.out.println(user);
//		memoryFun();
//		cpuFun();
	}
	private static void cpuFun() {
		for (;;) {

		}
	}

	private static void memoryFun() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 500000; i++) {
//			String s1 = "Pariwesh"; //string literal => String pool
			String s2 = new String("Pariwesh"); // normal string object
		}
	}
}