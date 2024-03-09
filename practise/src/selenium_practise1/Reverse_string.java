package selenium_practise1;

public class Reverse_string {

	public static void main(String[] args) {
		String a="Vaibhav";
		String rev="";
		int strlen=a.length();
		System.out.println("Length of String is: "+strlen);
		try {
		for(int i=strlen-1;i>=0;i--) {
			rev=rev+a.charAt(i);			
			}
		}catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("OUt of bounds");
		}
		System.out.println("Reversed String is : "+rev);

	}

}
