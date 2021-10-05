import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class EmployeeMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1, "Yuta01");
		Employee employee2 = new Employee(2, "Yuta02");
		Employee employee3 = new Employee(3, "Yuta03");
		Employee employee4 = new Employee(4, "Yuta04");
		Employee employee5 = new Employee(5, "Yuta05");
		
		List<Employee> employees = Arrays.asList(employee, employee2, employee3, employee4, employee5);
		Employee employee6 = getEmployeeByName(employees, "Yuta01", 1);
		System.out.println(employee6);
		
		
	}

	public static Employee getEmployeeByName(List<Employee> employees, String name, int id) {
//		Optinoal :
		return employees.stream().filter(e -> e.getName().equals(name) && id == e.getEmpNo()) // predicate
				.findAny().orElse(null);
		
//		for (Employee employee : employees) {
//			if(employee.getName().equals(name)) {
//				return employee;
//			}
//		}
//		return null;
	}
	
	public static List<String> getEmployeeNames(List<Employee> employees) {
		return employees.stream().map(Employee::getName).collect(Collectors.toList());
	}
}
