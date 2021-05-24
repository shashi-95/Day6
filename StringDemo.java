public class StringDemo {
	public static void main(String[] args) {
//		String s1 = new String("Test"); // immutable
//		s1 = s1.concat(" me");
//		System.out.println(s1);
////		System.out.println(s2);
		
		//Stringbuffer
		String value1 = "Test";
		String s1 = new String(value1); // immutable
		StringBuffer sb = new StringBuffer(value1); //mutable, thread safe, use when multiple threads.
		sb.append(" me");
		System.out.println(sb);
		System.out.println(s1 == sb.toString());
		
		StringBuilder  sb1 = new StringBuilder("Test");  //mutable, not thread-safe, use if only one thread
	}
}