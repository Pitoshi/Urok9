package ru.innopolis;

public class Movie {
    private String title;
    private double rating;
    private String genre;
    private String country;
    private boolean hasOscar;

    public Movie(String title, double rating, String genre, String country, boolean hasOscar) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть от 0 до 10");
        }
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    @Override
    public String toString() {
        return "Фильм: " + title +
                "\nРейтинг: " + rating +
                "\nЖанр: " + genre +
                "\nСтрана: " + country +
                "\nНаличие Оскара: " + (hasOscar ? "Да" : "Нет");
    }
}