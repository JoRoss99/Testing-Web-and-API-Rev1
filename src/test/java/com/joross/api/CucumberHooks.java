package com.joross.api;

import com.joross.api.helper.Endpoint;
import com.joross.web.helper.Utility;
import io.cucumber.java.*;

import java.util.Objects;

public class   CucumberHooks {@BeforeAll
public static void setUp(){
    System.out.println("Before all test");
    new Endpoint(); //run api in the beginning testing
}

    @AfterAll
    public static void tearDown(){
        System.out.println("After all test");
    }
}
