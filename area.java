package practice_programs;
import java.util.*;
class Shape{
	void getarea() {
		int y = 0;
		int m = 0;
		int x = y*m;
		System.out.println(x);
	}
}
class rectangle extends Shape{
	void getarea() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int a = scan.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		int b = scan.nextInt();
		int x = a*b;
		System.out.println("Area = "+x);
	}
}
public class area {

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		r1.getarea();
	}

}
