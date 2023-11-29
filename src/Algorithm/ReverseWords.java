package Algorithm;

public class ReverseWords {
    public static String reverseWords(String s){
        //Convert to charArray, Trims spaces and convert to string builder
        char [] s1 = s.toCharArray();
        String s2 = cleanSpaces(s1, s1.length);
        StringBuilder builder = new StringBuilder(s2);

        //reverse string
        reverseStr(builder, 0, builder.length() - 1);

        //reverse every word
        int start = 0;
        int end = 0;
        int n = builder.length();

        // Find the start index of each word by detecting spaces.
        while (start < n) {
            // Find the end index of the word.
            while (end < n && builder.charAt(end) != ' ')
                ++end;
            // Let's call our helper function to reverse the word in-place.
            reverseStr(builder, start, end - 1);
            // moving to the next word
            start = end + 1;
            ++end;
        }
        return builder.toString();
    }

   public static String cleanSpaces(char [] a, int n){
       // Convert character array to string
       String str = new String(a, 0, n);

       // Trim extra spaces at the beginning and end of the string
       // And replace multiple spaces with a single space
       str = str.replaceAll("\\s+", " ").trim();

       return str;
    }

    public static void reverseStr(StringBuilder sb, int start, int end){

        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }

    }

}
