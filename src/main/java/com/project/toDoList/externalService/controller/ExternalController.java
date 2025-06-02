package com.project.toDoList.externalService.controller;

import com.project.toDoList.externalService.service.ExternalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.http.HttpResponse;

@RestController
public class ExternalController {

    private final ExternalService externalService;

    public ExternalController(ExternalService externalService) {
        this.externalService = externalService;
    }

    @GetMapping("helloVSCode")
    public String getResponseES() {
        return externalService.getResponse().body();
    }

}
