package practise_New;

public class Super_Keyword_con_global_method extends Super_class{
	int height=6;
	Super_Keyword_con_global_method(){
		super();
		System.out.println("I am in child class constructor.");
	}
	public void height() {
		System.out.println(height);
		System.out.println(super.height);
	}
	public static void main(String[] args) {
		Super_Keyword_con_global_method obj=new Super_Keyword_con_global_method();
		obj.height();
		obj.displayHeight();

	}

}
