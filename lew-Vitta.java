package Palindrome;

import java.util.ArrayList;
import java.util.List;

public class palindrome {
    // Takes a list of words in, and returns a list of palindromes contained within the list of words.
    public List palindrome(List words){
        // create array list we will return
        List<String> palindromes = new ArrayList<>();

        // for each (words) in the list of words
        for (int i = 0; i < words.size(); i++) {
            // assign the word to temporary string, and specify it as a (String) not object
            String manipulator = (String) words.get(i);
            String backwards = "";

            // for each letter in the word i/manipulator (back-to-front), append the letter to String backwards
            for(int j = manipulator.length()-1; j>=0; j--){
                backwards += manipulator.charAt(j);
            }

            // if backwards == manipulator, we know it's a palindrome thus add it the palindrome list
            if(backwards.equals(manipulator)) {
                palindromes.add(backwards);
            }
        }
    return palindromes;
    }
}

