package ru.innopolis;

public class Movie {
    public String title;
    public final double rating;
    public final String genre;
    public String country;
    public boolean hasOscar;

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