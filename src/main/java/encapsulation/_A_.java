package encapsulation;

public class _A_ {

	public String name;

	public String id;

	public String age;

	public String Dep;

	private int salary;

	public _A_(String name, String id, String age, String dep, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		Dep = dep;
		this.salary = salary;
	}

	public void getEmployName() {

		System.out.println("get employ name");

	}

	private void getEmployBonus() {

		System.out.println("get em bonus");

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		
		this.salary=salary;

	}

	public static void main(String[] args) {

	}

}
