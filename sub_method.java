package practice_programs;

public class sub_method {
	public static int sub(int x,int y) {
		int z = x-y;
		return z;	
	}
	public static void main(String[] args) {
		int a = 19;
		int b= 11;
		int c = sub(a,b);
		System.out.println("Difference = " + c);

	}

}
