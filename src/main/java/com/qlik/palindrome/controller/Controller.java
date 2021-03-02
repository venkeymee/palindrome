package com.qlik.palindrome.controller;

import com.qlik.palindrome.dto.ResponseData;
import com.qlik.palindrome.service.PalindromeService;
import com.qlik.palindrome.util.StatusCodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This class is controller class to handle the Api requests
 *
 *****************************************/


@RestController
@RequestMapping("/api/rest")
public class Controller {

    @Autowired
    PalindromeService palindromeService;


    @GetMapping(value = "/is_palindrome/{word}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseData> is_palindrome(@PathVariable String word)  {

            ResponseData responseData=new ResponseData(StatusCodes.IS_PALINDROME.getMessage().concat(word),
                    StatusCodes.IS_PALINDROME.getCode().concat(Boolean.toString(palindromeService.isPalindrome(word))));
        return new ResponseEntity (responseData, HttpStatus.OK);
    }


    @GetMapping(value = "/palindrome_counts",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity palindromeCount()  {
       Map data= palindromeService.palindromeListCount();
        return new ResponseEntity (data, HttpStatus.OK);
    }


}
