package com.qlik.palindrome.util;

import org.springframework.stereotype.Component;
/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This is utility class for checking Palindrome with multiple ways .
 *
 *****************************************/


@Component
public class PalindromeUtil {

    // here we are traversing from both sides  0 to n index and checking both chars are same or not

        public static  boolean isPalindromeCheck(String word, int first, int last){
            if (first == last)
                return true;
            if ((word.charAt(first)) != (word.charAt(last)))
                return false;
            if (first < last + 1)
                return isPalindromeCheck(word, first + 1, last - 1);
            return true;
        }

        // index increments checking
        public boolean checkPalindromeByIndex(String word){
                int i = 0, j = word.length() - 1;
                while (i < j) {
                    if (word.charAt(i) != word.charAt(j))
                        return false;
                    i++;
                    j--;
                }
                return true;
            }
        }


