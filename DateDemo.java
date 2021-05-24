import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date dob = new Date(10000);
		System.out.println(dob);
		Date d1 = new Date(10000);
		System.out.println(d1);
		System.out.println(dob == d1);
		System.out.println(dob.equals(d1));
		
		Date date1= new Date("11/10/28");
		System.out.println(date1);
		
	}
}