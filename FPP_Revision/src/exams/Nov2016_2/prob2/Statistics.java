package exams.Nov2016_2.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List <EmployeeData>/*<implement>*/ aList) {
		double sum=0.0;
		for(EmployeeData e:aList) {
			sum=sum+e.getSalary();
		}
		
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
