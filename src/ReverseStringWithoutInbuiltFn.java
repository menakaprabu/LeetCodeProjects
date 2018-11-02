/**
 * This class reverse the given string
 *
 Example 1:

 Input: "hello"
 Output: "olleh"
 Example 2:

 Input: "A man, a plan, a canal: Panama"
 Output: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseStringWithoutInbuiltFn {

        public String reverseString(String s) {
            String output;
            char[] outputChar = new char[s.length()];
            int j = 0;
            for(int i=s.length()-1; i >= 0; i--){
                outputChar[j] = s.charAt(i);
                j++;
            }
            output = String.valueOf(outputChar);
            return output;
        }

}
