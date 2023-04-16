/**
 * Given an input string s, reverse the order of the words.
 * 
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * 
 * Return a string of the words in reverse order concatenated by a single space.
 * 
 * Note that s may contain leading or trailing spaces or multiple spaces between
 * two words.
 * The returned string should only have a single space separating the words.
 * Do not include any extra spaces.
 */
// public class smena_slov {
//     public static void main(String[] args) {
//         String[] arrStr = { "the", "sky", "is", "blue" };
//         for (int i = 0; i < arrStr.length; i++) {
//             System.out.print(arrStr[i] + ' ');
//         }
//         System.out.println();
//         for (int i = arrStr.length - 1; i >= 0; i--) {
//             System.out.print(arrStr[i] + ' ');
//         }
//     }
// }

/**
 * Your reversed string should not contain leading or trailing spaces.
 */

public class smena_slov {
    public static void main(String[] args) {
        String[] arrStr = { "   hello", "world" };

        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i] + ' ');
            arrStr = st.replaceAll("\\s+", "");
        }
        System.out.println();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.print(arrStr[i] + ' ');
        }
    }
}

/**
 * 
 * Input: s = "a good example"
 * Output: "example good a"
 * Explanation:
 * You need to reduce multiple spaces between two words
 * to a single space in the reversed string.
 */
