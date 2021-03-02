package com.qlik.palindrome.controller;


import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private static final String is_palindrome = "/api/rest/is_palindrome/level";
    private static final String palindromeList = "/api/rest/palindrome_counts";


    @Test
    public void is_palindromeTest() throws Exception {
        this.mockMvc.perform(get(is_palindrome))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void palindromeCountTest() throws Exception {
        this.mockMvc.perform(get(palindromeList))
                .andDo(print())
                .andExpect(status().isOk());

    }

}