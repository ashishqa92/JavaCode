package practiceQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Ashish Kumar";
		String reverseName = "";
		
		int lengthOfString = name.length(); //12, but index start from 0, so lower bound is 0 and upper is 11
		
		for (int i= lengthOfString-1; i>=0; i--) {
			reverseName = reverseName + name.charAt(i); //charAt(i), will give the current value of particular index
		}
			System.out.println(reverseName);

	}

}
