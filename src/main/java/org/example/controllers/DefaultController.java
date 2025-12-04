package org.example.controllers;

import org.example.models.User;
import org.example.services.UserCRUDService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
    TODO DefaultController для перехода с одной страницы на другую.
     @Controller для определения данного класса как контроллера(это нужно spring boot)
 */
@Controller
public class DefaultController {
    private final UserCRUDService userCRUDService;

    public DefaultController(UserCRUDService userCRUDService) {
        this.userCRUDService = userCRUDService;
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/userPage/")
    public String getUserPage() {
        return "userPage";
    }
}
