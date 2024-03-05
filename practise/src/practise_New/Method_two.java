package practise_New;

public class Method_two {
/*Two types of constructor
 * 1.Parameterized 
 * 2.Non-Parameterized 
 */
	int c;
	static int f;
	String b;
Method_two(String b,int a){
	this.c=a;
	System.out.println("Global variable "+c);
	
}
public void Non_static() {
	System.out.println("Vaibhav is in NON-STATIC METHOD");
	this.c=10;
	f=5;
	System.out.println("Updated value of Global variable "+c);
	System.out.print("Updated value of Static variable "+f);
}
public static void main(String[] args) {
	Method_two M=new Method_two("Vaibhav age is",24);
	M.Non_static();
	
	

}
}


