package com.qlik.palindrome.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This class is Persistence Object class
 *
 *****************************************/


@Component
public class Palindrome implements Serializable {

    private transient Map<String,Integer> palindromeMap =new HashMap<String,Integer>();

    private String word;

    private Integer level;


    public  Map<String, Integer> getPalindromeMap() {
        return this.palindromeMap;
    }

    public  void setPalindromeMap(Map<String, Integer> palindromeMap) {
        this.palindromeMap = palindromeMap;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
