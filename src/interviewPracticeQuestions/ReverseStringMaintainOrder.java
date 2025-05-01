package interviewPracticeQuestions;

public class ReverseStringMaintainOrder {
    public static void main(String[] args) {
        String st = "I had a cup of coffee";
        
        // Step 1: Convert string to character array
        char[] charArray = st.toCharArray();
        
        // Step 2: Extract characters without spaces
        StringBuilder sb = new StringBuilder();
        for (char e : charArray) {
            if (e != ' ') {
            	sb.append(e);
            }
        }
        
        // Step 3: Reverse the extracted characters
        sb.reverse();  // eeffocfopucadahI
        
        // Step 4: Insert reversed characters back, keeping spaces intact
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                charArray[i] = sb.charAt(index++);
                
            }
        }
        
        // Print the final string
        System.out.println(new String(charArray));
    }
}
