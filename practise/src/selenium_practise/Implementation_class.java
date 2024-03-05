package selenium_practise;

public class Implementation_class extends ScreenShot{
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("Method2");
	}
	public void method3() {
		System.out.println("Method3");
	}
	public static void main(String[] args) {
		ScreenShot s=new Implementation_class();
		s.method1();
		s.method2();
		s.method3();
	}


}