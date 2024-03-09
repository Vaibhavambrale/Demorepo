package selenium_practise1;

public class Character_count {

	public static void main(String[] args) {
			
		String str="Mississipi";
		char c='a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
	System.out.println(count);
	}

}
