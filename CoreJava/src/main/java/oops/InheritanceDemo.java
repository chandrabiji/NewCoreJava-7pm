package oops;

class Employee {
	public double salary = 5000;
}
class PartTimeEmployee extends Employee {
	public double bonus = 500;
}
class RegularEmployee extends Employee {
	public double bonus = 1000;
}
public class InheritanceDemo {

	public static void main(String[] args) {
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		RegularEmployee regularEmployee = new RegularEmployee();
		System.out.println("---------------PartTimeEmployee Pay Slip--------------------");
		System.out.println("   PartTimeEmployee Salary     :     "+partTimeEmployee.salary);
		System.out.println("   PartTimeEmployee Bonus      :     "+partTimeEmployee.bonus);
		System.out.println("-------------------------------------------------------------");
		System.out.println("   Total Salary                :     "+(partTimeEmployee.salary+partTimeEmployee.bonus));
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		System.out.println("--------------RegularEmployee Pay Slip--------------------");
		System.out.println("   RegularEmployee Salary     :     "+regularEmployee.salary);
		System.out.println("   RegularEmployee Bonus      :     "+regularEmployee.bonus);
		System.out.println("-------------------------------------------------------------");
		System.out.println("   Total Salary                :     "+(regularEmployee.salary+regularEmployee.bonus));
		System.out.println("-------------------------------------------------------------");

	}

}
