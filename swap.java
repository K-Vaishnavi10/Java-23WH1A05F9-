package practice_programs;

public class swap {
	public static void swap(int x,int y) {
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping : " + x  + "," + y);
	}
	public static void main(String[] args) {
		int a = 13;
		int b=17;
		System.out.println("Before swapping : " + a  + "," + b);
		swap(a,b);

	}

}
