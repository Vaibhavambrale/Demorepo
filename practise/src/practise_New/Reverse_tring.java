package practise_New;
public class Reverse_tring {

	public static void main(String[] args) {
		String str="dlroW olleH";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
