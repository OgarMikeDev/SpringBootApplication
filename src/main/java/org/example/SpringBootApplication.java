package org.example;

import org.springframework.boot.SpringApplication;

/*
    TODO
     @org.example.SpringBootApplication для определения текущего класса
     как того, с кот-го
     начинается запуск программы
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    public static void main(String[] args) {
        /*
        TODO run() для запуска приложения.
         1 параметр - SpringApplication.class - определяет класс для запуска.
         2 параметр - args - входные данные, напр-р, логин и пароль
         */
        SpringApplication.run(SpringBootApplication.class, args);
    }
            }
/*
    TODO Модель MVC - Model View Controller.
     Она подразумевает и требует 3-ёх слоёв:
     1) контроллеры -
            для принятия и отправки данных пользователю,
            напр-р, для принятия логина и пароля интернет-магазина
            и отправки страницы пользователя ему в ответ
            на нажатие кнопку "Войти";
     2) сервисы -
            для реализации логики приложения,
            напр-р, создания пользователя, добавления ему id, login, pass,
            и сохранения его в БД;
     3) репозитории -
            для использования CRUD операций и
            работы уже с БД.
     Все слои работают с сущностями, напр-р, с пользователем(user).
     Сущности находятся с папке org.example.models.
 */
