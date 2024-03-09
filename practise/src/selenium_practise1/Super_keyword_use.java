package selenium_practise1;



public class Super_keyword_use extends Superkeywordclass{
int age=26;
	Super_keyword_use() {
		super();
	System.out.println("I am in child constructor");
	}
	public void ss() {
		System.out.println("age of child:"+age);
		System.out.println("Parent age: "+super.super_parent_age);
	
	}
	public static void main(String[] args) {
		Super_keyword_use s=new Super_keyword_use();
		s.ss();
		
		
	}

}
