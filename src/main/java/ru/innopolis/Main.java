package ru.innopolis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> films = new ArrayList<>();

        // Добавляем три фильма в список
        films.add(new Movie("Побег из Шоушенка", 9.3, "Драма", "США", true));
        films.add(new Movie("Властелин колец: Братство кольца", 8.8, "Фэнтези", "Новая Зеландия", true));
        films.add(new Movie("Начало", 8.7, "Фантастика", "США", true));

        // Выводим информацию о фильме по индексу 1
        System.out.println("Информация о фильме с индексом 1:");
        System.out.println(films.get(1));
    }
}


