package javaPractice;

public class StringDivide {
	public static void main(String args[]) {
		String str = "eeaabbcc";
		int len = str.length();
		int n = 4;
		int temp = 0, chars = len/n;
		String[] equalStr = new String[n];
		if(len%n!=0) {
			System.out.println("Sorry string cannot be divided into "+n+"equal parts.");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String part=str.substring(i,i+chars);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n+ "equal parts of given string are ");
			for(int i=0;i<equalStr.length;i++) {
				System.out.println(equalStr[i]);
			}
		}
	}

}
