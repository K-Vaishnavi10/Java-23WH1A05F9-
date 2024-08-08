package practice_programs;

public class prime {
	public static void prime(int x) {
		int count = 0;
		for(int i=2;i<x;i++) {
			if (x%i==0) {
				count+=1;
			}
		}
		if(count==0) {
			System.out.println("Given integer " + x + " is prime");
		}
		else {
			System.out.println("Given integer " + x + " is not prime");
		}
		}
	public static void main(String[] args) {
		int a = 13;
		prime(a);

	}

}
