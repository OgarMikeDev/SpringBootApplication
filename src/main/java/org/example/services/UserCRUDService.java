package org.example.services;

import org.example.models.User;
import org.example.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserCRUDService {
    private final UserRepository userRepository;

    public UserCRUDService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(User user) {
        String originPassword = "";
        secretPassword(originPassword);
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(User user) {
        String originPassword = "";
        secretPassword(originPassword);
        userRepository.delete(user);
    }

    //TODO Hello -> Brspj
    public String secretPassword(String originPassword) {
        String secretPassword = "";
        List<String> englishLetters = new ArrayList<>();

        
        /*
        TODO с 65 по 90 - большие английские буквы.
          с 97 по 122 - маленькие английские буквы
         */
        for (int i = 65; i <= 90; i++) {
            char ch = (char) i;
            String letter = String.valueOf(ch);
            englishLetters.add(letter);
        }
        
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            String letter = String.valueOf(ch);
            englishLetters.add(letter);
        }
        
        for (int i = 0; i < originPassword.length(); i++) {
            char letterChar = originPassword.charAt(i);
            String letter = String.valueOf(letterChar);
            for (int indexLetterAlphabet = 0; indexLetterAlphabet < englishLetters.size(); indexLetterAlphabet++) {
                String currentLetterAlphabet = englishLetters.get(indexLetterAlphabet);
                if (currentLetterAlphabet.contains(letter)) {
                    System.out.println(indexLetterAlphabet + " - " + currentLetterAlphabet);
                }
            }
        }
        return secretPassword;
    }
}
