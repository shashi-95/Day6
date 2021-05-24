public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers =new  int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println(numbers);
		int[] clonedArray = numbers.clone(); //shallow cloning
		clonedArray[9]=0;
		System.out.println(numbers[9]);
		System.out.println(clonedArray[9]);
	}
}