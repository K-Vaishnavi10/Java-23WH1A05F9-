package practice_programs;
class person{
	private String firstname,lastname;
	public String getFirstname() {
		return firstname;
	}
	public String getLasttname() {
		return lastname;
	}
	public void setFirstname(String newfirstname) {
		this.firstname = newfirstname;
	}
	public void setLastname(String newlastname) {
		this.lastname = newlastname;
	}
}
class employee extends person{
	private String lastname;
	private int empid;
	public String getLasttname() {
		return lastname;
	}
	public void setLastname(String newlastname) {
		this.lastname = newlastname;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int newempid) {
		this.empid = newempid;
	}
}
public class empdetails {

	public static void main(String[] args) {
		employee A = new employee();
		A.setFirstname("Sai");
		A.setLastname("Sathwika");
		A.setempid(3);
		System.out.println(A.getFirstname());
		System.out.println(A.getLasttname());
		System.out.println(A.getempid());
	}

}
