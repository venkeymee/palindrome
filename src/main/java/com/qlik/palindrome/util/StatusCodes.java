package com.qlik.palindrome.util;

/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This is utility class defining any contents handling
 *
 *****************************************/

public enum StatusCodes {
    IS_PALINDROME("Given Word :","Palindrome:");





    private String message;
    private String code;
    StatusCodes(String message,String code){
        this.message=message;
        this.code=code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
