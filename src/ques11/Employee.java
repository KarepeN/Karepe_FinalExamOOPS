
package ques11;
/**
 * @author Nithya Karepe
 *
 */
public class Employee implements Comparable<Employee> {
	private long empId;
	private String empName;
	private double empSalary;

    /**
     *
     * @param empId
     * @param empName
     * @param empSalary
     */
    public Employee(long empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

    /**
     *
     * @return
     */
    public long getEmpId() {
		return empId;
	}

    /**
     *
     * @return
     */
    public String getEmpName() {
		return empName;
	}

    /**
     *
     * @return
     */
    public double getEmpSalary() {
		return empSalary;
	}
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary;
	}
	@Override
	public int compareTo(Employee e) {
		if (this.empId > e.empId)
			return 1;
		if (this.empId < e.empId)
			return -1;
		else
			return 0;
	}

}
