package interviewQuestions;

public class SwapFirstLastVowel {

	public static void main(String[] args) {
		// Write a program to swap the 1st and last vowel letter of a string.
		//Ex- str= "selenium",

		String str = "selenium";
        String swapped = swapFirstLastVowel(str);
        System.out.println("Original String: " + str);
        System.out.println("After Swapping: " + swapped);
    }

    static String swapFirstLastVowel(String input) {
        String vowels = "aeiouAEIOU";
        int firstVowelIndex = -1;
        int lastVowelIndex = -1;

        // Find the indices of the first and last vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                if (firstVowelIndex == -1) {
                    firstVowelIndex = i;
                }
                lastVowelIndex = i;
            }
        }

        // Swap the first and last vowels
        if (firstVowelIndex != -1 && lastVowelIndex != -1) {
            char[] charArray = input.toCharArray();
            char temp = charArray[firstVowelIndex];
            charArray[firstVowelIndex] = charArray[lastVowelIndex];
            charArray[lastVowelIndex] = temp;
            return new String(charArray);
        } else {
            return input; // No vowels found, return the original string
        }
	}

}
