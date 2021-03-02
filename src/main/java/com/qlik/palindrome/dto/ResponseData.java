package com.qlik.palindrome.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/*********************************************8
 * ************ Author : Venkey Mee
 * ************ Desc: This is utility class for transforming res as specific format
 *
 *****************************************/
@Component
public class ResponseData implements Serializable {
    public String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public ResponseData() {

    }
    public ResponseData(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
