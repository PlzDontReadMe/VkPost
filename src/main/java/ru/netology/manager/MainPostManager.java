package ru.netology.manager;

import ru.netology.domain.Content;
import ru.netology.domain.Header;

public class MainPostManager {
    public AllManager[] managers;


    public String generate() {
        for (AllManager manager : managers) {
            String Post = manager.generatePost();
        }
        //to do;
        return null;
    }
}