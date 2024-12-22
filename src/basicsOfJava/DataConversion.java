package basicsOfJava;

public class DataConversion {

	public static void main(String[] args) {
		// For converting pure numeric string to numeric value
		// NumberFormatException if input string is like 100A

		String s = "100";
		System.out.println(s + 20);
		int i = Integer.parseInt(s);
		System.out.println(i + 20);

		// Converting string to int
		String orderId = "100A";
		String o = orderId.substring(0, (orderId.length() - 1));
		System.out.println(o);
		int j = Integer.parseInt(o);
		System.out.println(j + 10);

		// String to Double
		String s1 = "14.56";
		Double d = Double.parseDouble(s1);
		System.out.println(d + 4);

		// String to Boolean
		String g = "true";
		Boolean b = Boolean.parseBoolean(g);
		System.out.println(b);

		// int to String
		int k = 100;
		String str = String.valueOf(k);
		System.out.println(str+20);

	}

}
