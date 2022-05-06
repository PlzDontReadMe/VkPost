package ru.netology.manager;


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