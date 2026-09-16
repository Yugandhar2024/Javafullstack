package demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
class Emp{
	String empName;
	double sal;
	String bloodGrp;
	long contactNo;
	Emp(String empName,double sal,String bloodGrp,long contactNo){
		this.empName=empName;
		this.sal=sal;
		this.bloodGrp=bloodGrp;
		this.contactNo=contactNo;
	}
	public String toString() {
		return "Employee Name : "+empName+" Salary : "+sal+" Blood Grp : "+bloodGrp+" Contact No :"+contactNo;	
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Emp("Sassank",45000,"O +ve",9988776655l));
		al.add(new Emp("Ravi",38000,"A +ve",9876543210l));
		al.add(new Emp("Priya",52000,"B +ve",9123456780l));
		al.add(new Emp("Kiran",41000,"AB +ve",9012345678l));
		al.add(new Emp("Anjali",47500,"O -ve",9345678901l));
		al.add(new Emp("Vikram",60000,"A -ve",9456789012l));
		al.add(new Emp("Deepa",39000,"B -ve",9567890123l));
		al.add(new Emp("Suresh",55000,"AB -ve",9678901234l));
		al.add(new Emp("Meena",43000,"O +ve",9789012345l));
		al.add(new Emp("Arjun",49000,"A +ve",9890123456l));
		//for-loop Implementation
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		System.out.print("----------------------------------------------------------------------------------------------------------");
		ArrayList ol=new ArrayList();
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
		    Emp e = (Emp) itr.next();
		    if(e.bloodGrp.equals("O +ve")) {
		        ol.add(e);
		    }
		}
		System.out.println("\nEmployees with Blood Group O +ve:");
		for(int i=0;i<ol.size();i++) {
			System.out.println(ol.get(i));
}
		//Calculate average salary of ALL employees
		double totalSal = 0;
	 	Iterator itr2 = al.iterator();
		while(itr2.hasNext()) {
			Emp e = (Emp) itr2.next();
			totalSal = totalSal + e.sal;
				}
		double avgSal = totalSal / al.size();
		System.out.println("\n----------------------------------------------------------------------------------------------------------");
		System.out.println("Total Salary of all employees : " + totalSal);
		System.out.println("Total number of employees     : " + al.size());
		System.out.print("Average Salary per employee    : " + avgSal);
		//employee who earning more salary
		Emp maxSalEmp = (Emp) al.get(0);   //assume first employee has max salary initially
		Iterator itr3 = al.iterator();
		while(itr3.hasNext()) {
		    Emp e = (Emp) itr3.next();
		    if(e.sal > maxSalEmp.sal) {
		        maxSalEmp = e;
		    }
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------");
		System.out.println("Employee with highest salary:");
		System.out.println(maxSalEmp);
}
}
/*Expected Output: 
Employee Name : Arjun Salary : 49000.0 Blood Grp : A +ve Contact No :9890123456
Employee Name : Meena Salary : 43000.0 Blood Grp : O +ve Contact No :9789012345
Employee Name : Suresh Salary : 55000.0 Blood Grp : AB -ve Contact No :9678901234
Employee Name : Deepa Salary : 39000.0 Blood Grp : B -ve Contact No :9567890123
Employee Name : Vikram Salary : 60000.0 Blood Grp : A -ve Contact No :9456789012
Employee Name : Anjali Salary : 47500.0 Blood Grp : O -ve Contact No :9345678901
Employee Name : Kiran Salary : 41000.0 Blood Grp : AB +ve Contact No :9012345678
Employee Name : Priya Salary : 52000.0 Blood Grp : B +ve Contact No :9123456780
Employee Name : Ravi Salary : 38000.0 Blood Grp : A +ve Contact No :9876543210
Employee Name : Sassank Salary : 45000.0 Blood Grp : O +ve Contact No :9988776655
----------------------------------------------------------------------------------------------------------
Employees with Blood Group O +ve:
Employee Name : Sassank Salary : 45000.0 Blood Grp : O +ve Contact No :9988776655
Employee Name : Meena Salary : 43000.0 Blood Grp : O +ve Contact No :9789012345

----------------------------------------------------------------------------------------------------------
Total Salary of all employees : 469500.0
Total number of employees     : 10
Average Salary per employee    : 46950.0
----------------------------------------------------------------------------------------------------------
Employee with highest salary:
Employee Name : Vikram Salary : 60000.0 Blood Grp : A -ve Contact No :9456789012
*/
