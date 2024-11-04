package ru.innopolis;


import java.util.ArrayList;
import java.util.List;

public class DaylyPlanner {

    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        tasks.add("Сходить к врачу");
        tasks.add("Сделать зарядку");
        tasks.add("Съездить на работу в Иннополис");
        tasks.add("Сделать домашнюю работу по 9-му уроку");
        tasks.add("Покодить чуток");

        // Выводим список дел в заданном формате
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Задача " + (i + 1) + ": {" + tasks.get(i) + "}");
        }
    }
}

