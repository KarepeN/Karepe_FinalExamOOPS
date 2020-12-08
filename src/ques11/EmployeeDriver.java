/**
 * 
 */
package ques11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * @author Nithya Karepe
 *
 */
public class EmployeeDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Employee> employeelist = new ArrayList<>();

		employeelist.add(new Employee(4, "John", 3000));
		employeelist.add(new Employee(1, "Jay", 8000));
		employeelist.add(new Employee(3, "Kim", 4000));
		employeelist.add(new Employee(5, "Joe", 6000));
		employeelist.add(new Employee(2, "Jack", 5000));
		for (Employee e : employeelist) {
			System.out.println(e.toString());
		}
		Collections.sort(employeelist);
		System.out.println();
		for (Employee e : employeelist) {
			System.out.println(e.toString());
		}
		Comparator<Employee> compareBySalary = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getEmpSalary() > e2.getEmpSalary())
					return 1;
				if (e1.getEmpSalary() < e2.getEmpSalary())
					return -1;
				else
					return 0;
			}
		};
		Collections.sort(employeelist, compareBySalary);
		System.out.println();
		for (Employee e : employeelist) {
			System.out.println(e.toString());
		}
		Comparator<Employee> compareByName = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		};
		Collections.sort(employeelist, compareByName);
		System.out.println();
		for (Employee e : employeelist) {
			System.out.println(e.toString());
		}
	}
}
