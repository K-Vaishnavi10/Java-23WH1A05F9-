package practice_programs;

public class const_parameters {
	int x;
	public const_parameters(int y) {
		x = y;
	}
	public static void main(String[] args) {
		const_parameters myObj = new const_parameters(95);
		System.out.println(myObj.x);
	}
}
