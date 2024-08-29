package practice_programs;

public class dog {
	String name;
	String color;
	public dog(String s,String x) {
		name = s;
		color = x;
	}
	public static void main(String[] args) {
		dog myObj = new dog("Ajju","Black");
		System.out.println(myObj.name);
		System.out.println(myObj.color);
	}

}
