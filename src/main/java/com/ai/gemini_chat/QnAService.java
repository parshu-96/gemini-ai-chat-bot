package com.ai.gemini_chat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class QnAService {

    //Access to API key and URL (Gemini)
    @Value("${gemini.api.url}")
    private String geminiAPIUrl;
    @Value("${gemini.api.key}")
    private String geminiAPIKey;

    private final WebClient webClient;

    public QnAService(WebClient webClient) {
        this.webClient = WebClient.builder().build();
    }

    public String getAnswer(String question) {
        //Construct the Request Payload
        Map<String, Object> requestBody = Map.of("contents", new Object[]{
                Map.of("parts", new Object[]{
                        Map.of("text", question)
                })
        });

        //Make API call
        String response = webClient.post().uri(geminiAPIUrl + geminiAPIKey).
                header("Content-Type", "application/json").
                bodyValue(requestBody).
                retrieve().
                bodyToMono(String.class).
                block();

        //Return Response
        return response;
    }
}
