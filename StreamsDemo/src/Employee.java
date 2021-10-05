import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	int empNo;
	String name;

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Employee [emp =" + empNo + ", name = " + name + "]";
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String Name) {
		this.name = name;
	}
	
}
