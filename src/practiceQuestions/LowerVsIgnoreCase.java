package practiceQuestions;

public class LowerVsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "eman";
		String s2 = "EMAn";
		
		System.out.println(s1.equals(s2)); // eman != EMAn
		
		System.out.println(s1.equalsIgnoreCase(s2)); // eman == EMAn
		
		
		String s3 = s2.toLowerCase(); // EMAn became eman here
		System.out.println(s1.equals(s3)); // eman == eman

	}

}
