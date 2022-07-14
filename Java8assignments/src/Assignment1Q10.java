import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
public class Assignment1Q10 {
	public static void main(String[] args) {
	
		ArrayList<Employee> empl=new ArrayList<Employee>();
		empl.add(new Employee("ajinkya",1));
		empl.add(new Employee("prakash",2));
		empl.add(new Employee("abhishek",3));
		empl.add(new Employee("anurag",4));
		empl.add(new Employee("sanjeevani",5));
		Map<Integer,String> empMap=empl.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
		System.out.println(empMap);

		Set<String> nameSet = empl.stream().map(e->e.name).collect(Collectors.toSet());

		System.out.println(nameSet);

		}
}
