package practiceQuestions;

public class ArmstrongNumber {
	
	/* 
	 * Armstrong number is a number that is equal to the sum of cubes of its digits.
	 * 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153 ((1*1*1) + (5*5*5) + (3*3*3))
	 * 125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
	 *  */
	
	public static void isArmstrongNumner(int num) {
		
		int remainder = 0;
		int cube = 0;
		int temp;
		
		temp = num;
		while (num>0) {
			remainder = num%10;
			num = num/10;
			cube = cube + (remainder * remainder * remainder);
			
		}
		if (temp == cube) {
			System.out.println(temp+ " is an Armstrong Number");
		}
		else{
			System.out.println(temp+ " isn't an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		
		isArmstrongNumner(153);
		isArmstrongNumner(470);

	}

}
