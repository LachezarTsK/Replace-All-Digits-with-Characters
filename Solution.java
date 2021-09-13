public class Solution {

    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i += 2) {
            charArray[i] = (char) ('a' + (charArray[i - 1] - 'a') + (charArray[i] - '0'));
        }
        return String.valueOf(charArray);
    }
}
