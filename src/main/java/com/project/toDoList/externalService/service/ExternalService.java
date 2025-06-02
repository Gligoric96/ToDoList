package com.project.toDoList.externalService.service;

import com.project.toDoList.config.ExternalServiceConfig;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ExternalService {

    private ExternalServiceConfig externalServiceConfig;

    public ExternalService(ExternalServiceConfig externalServiceConfig) {
        this.externalServiceConfig = externalServiceConfig;
    }

    public HttpResponse<String> getResponse() {

        //creo l'endpoint
        String url = externalServiceConfig.getExternalService() + "/api/hello";

        //costruisco la richiesta
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).join();
    }
}
