package practise_New;

public class Use_class extends Abstraction_class {

	Use_class(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Abstraction_class a=new Abstraction_class("Arjun", 15);
		System.out.println(a.getAge());
	}

}
