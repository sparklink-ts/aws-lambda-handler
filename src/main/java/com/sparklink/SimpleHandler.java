package com.sparklink;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class SimpleHandler implements RequestHandler<String,String> {

    public String handleRequest(String input, Context context){
        LambdaLogger logger = context.getLogger();
        logger.log("Input string : " + input);
        return processRequest(input,context);
    }

    public String processRequest(String input, Context context){
        LambdaLogger logger = context.getLogger();
        logger.log("JDK Version: " + System.getProperty("java.version"));
        //return input.toUpperCase(); // Convert the input string to Upper Case
        //return input.toLowerCase(); // Convert the input string to Lower Case
        return "This is an example of AWS Lambda !!! " + input; // Concat the custom String with input string.
    }

}
