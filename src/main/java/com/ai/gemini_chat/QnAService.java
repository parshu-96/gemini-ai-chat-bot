package com.ai.gemini_chat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QnAService {

    //Access to API key and URL (Gemini)
    @Value("${gemini.api.url}")
    private String geminiAPIUrl;
    @Value("${gemini.api.key}")
    private String geminiAPIKey;


    public String getAnswer(String question) {
        //Construct the Request Payload
        Map<String,Object> requestBody=Map.of("contents",new Object[]{
                Map.of("parts",new Object[]{
                        Map.of("text",question)
                })
        });

    //Make API call

    //Return Response
        return "";
    }
}
