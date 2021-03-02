package com.qlik.palindrome.serviceImpl;

import com.qlik.palindrome.util.PalindromeUtil;
import com.qlik.palindrome.model.Palindrome;
import com.qlik.palindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This class is used to implements business logics
 *
 *****************************************/


@Service
public class PalindromeServiceImpl implements PalindromeService {

    @Autowired
    Palindrome palindrome;

    @Override
    public boolean isPalindrome(String word) {

       boolean isPalindrome= (word!=null && !word.isEmpty() && word.length()>1)
               ?PalindromeUtil.isPalindromeCheck(word, 0, word.length() - 1)
               :false;

       if(isPalindrome){
           Map<String,Integer> palindromeMap=palindrome.getPalindromeMap();
           Integer isExist=(null!=palindromeMap.get(word))?palindromeMap.get(word):0;
           palindromeMap.put(word,++isExist);
           System.out.println(palindromeMap.toString());
       }

       return isPalindrome;

    }

    @Override
    public Map palindromeListCount() {
        return palindrome.getPalindromeMap();
    }
}
