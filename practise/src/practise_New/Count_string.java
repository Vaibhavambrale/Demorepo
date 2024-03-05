package practise_New;

public class Count_string {

	public static void main(String[] args) {
		String str="G e t g o i n g b r o ";
		int count=0;
		int space=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				space++;
			}else {
			count++;
		}
		}
		System.out.println("Number of characters is "+count);
		System.out.println("Number of spaces is "+space);
	}

}
