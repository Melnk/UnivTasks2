package org.example.Tasks9.Tasks1;

public class Main {
    public static void main(String[] args) {
        Profession[] professions = {new Doctor(), new Teacher()};
        for (Profession profession : professions) {
            profession.work();
        }
    }
}