package tdd;

import java.util.Arrays;

import static java.lang.System.in;

public class WordFun {

    public static char[] reversedWord(String word) {

        char[] output = new char[word.length()];
        int index = 0;
        for (int count = word.length() - 1; count >= 0; count--) {
            output[index] = word.charAt(count);
            index++;}
        return output;

    }

    public static void main(String... args){
        String words = "semicolon";
       char[] result = reversedWord(words);
       System.out.println(Arrays.toString(result));
    }
}
