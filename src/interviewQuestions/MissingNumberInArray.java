package interviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find the missing number from an array? Ex - Int[] array =
		 * {1, 2, 4, 6, 3, 7, 8, 10} Output : 5, 9
		 */
		int[] array = {1, 2, 4, 6, 3, 7, 8, 10};

        // Assuming the array elements are in a specific range (e.g., 1 to 10)
        int startRange = 1;
        int endRange = 10;

        // Find missing numbers
        findMissingNumbers(array, startRange, endRange);
    }

    static void findMissingNumbers(int[] array, int start, int end) {
        boolean[] present = new boolean[end - start + 1];

        // Mark numbers present in the array
        for (int num : array) {
            if (num >= start && num <= end) {
                present[num - start] = true;
            }
        }

        // Display missing numbers
        System.out.print("Missing numbers: ");
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                System.out.print((i + start) + " ");
            }
        }

	}

}
