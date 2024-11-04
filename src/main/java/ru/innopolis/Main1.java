package ru.innopolis;

public class Main1 {
    public static void main(String[] args) {

        // Создание двух игроков с одинаковыми значениями полей
        Player player1 = new Player(1, "Gamer1", true);
        Player player2 = new Player(1, "Gamer1", true);

        // Проверка идентичности ссылок
        System.out.println("player1 == player2: " + (player1.equals(player2))); // false

        // Проверка равенства объектов
        System.out.println("player1.equals(player2): " + player1.equals(player2)); // true

        // Вывод информации об игроках
        System.out.println(player1);
        System.out.println(player2);
    }
}


