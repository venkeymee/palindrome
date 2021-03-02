package com.qlik.palindrome.service;

import java.util.Map;

public interface PalindromeService {

    boolean isPalindrome(String word);

    Map<String,Integer> palindromeListCount();
}
