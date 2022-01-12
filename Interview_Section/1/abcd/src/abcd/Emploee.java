package abcd;

import java.util.List;

public class Emploee {
	String name;
	int age;
	List<String> list;
	public Emploee(String name, int age, List<String> list) {
		super();
		this.name = name;
		this.age = age;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Emploee [name=" + name + ", age=" + age + ", list=" + list + "]";
	}
	
	
	
	
	

}
