package org.example.controllers;

import org.example.models.User;
import org.example.services.UserCRUDService;
import org.springframework.web.bind.annotation.PostMapping;

/*
    TODO RestController для работы с данными на одной страницы.
     @Controller для определения данного класса как rest-контроллера(это нужно spring boot)
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final UserCRUDService userCRUDService;

    public RestController(UserCRUDService userCRUDService) {
        this.userCRUDService = userCRUDService;
    }

    @PostMapping("/addUser/")
    public void createUser(User user) {
        userCRUDService.create(user);
    }

}
