package ru.innopolis;

public class Player {
    private final int id;
    private final String nickname;
    private final boolean isOnline;

    // Конструктор
    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на идентичность ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и совпадение классов

        Player player = (Player) obj; // Приведение типа
        return id == player.id &&
                isOnline == player.isOnline &&
                nickname.equals(player.nickname); // Сравнение значений полей
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + nickname.hashCode();
        result = 31 * result + Boolean.hashCode(isOnline);
        return result;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname;
    }
}