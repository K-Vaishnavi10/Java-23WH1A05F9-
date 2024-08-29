package practice_programs;

public class cat {
	String Name;
	int Age;
	public cat(){
		Name = "Unknown";
		Age = 10;
	}

	public static void main(String[] args) {
		cat myObj = new cat();
		System.out.println(myObj.Name);
		System.out.println(myObj.Age);
	}

}
