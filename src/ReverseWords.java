public class ReverseWords {

    public static String reverseWords(String word) {
        if(word.length() == 1){return word;}
        char firstLetter = word.charAt(0);
        String remaining = word.substring(1);
        return reverseWords(remaining) + firstLetter;
    }

    public static void main(String[] args) {
        System.out.print(reverseWords("bokinafaso"));
    }
}