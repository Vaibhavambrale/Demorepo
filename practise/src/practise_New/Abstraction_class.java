package practise_New;

public class Abstraction_class {
	private int age;
	private String name;
	Abstraction_class(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("INSIDE");
			}
	public String getName(String name) {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
}
