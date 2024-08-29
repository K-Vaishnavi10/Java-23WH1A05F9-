package practice_programs;

class Computer{
	class processor{
		void displaydetails() {
			System.out.println("Brand = "+ "HP");
			System.out.println("Speed = "+ "125Mpx");
		}
	}
}
public class inner_class {
	
	public static void main(String[] args) {
		Computer myObj1 = new Computer();
		Computer.processor myObj2 = myObj1.new processor();
		myObj2.displaydetails();

	}

}
