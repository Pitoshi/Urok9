package ru.innopolis;

import java.util.HashSet;
import java.util.Set;

    public class PlayerStorage {
        private static Set<Player> players;

        public PlayerStorage () {
            players = new HashSet<>();
        }

        public static boolean addPlayer(Player player) {
            return players.add(player); // Возвращает true, если игрок был добавлен, false - если дубликат
        }

        public static void showPlayers() {
            for (Player player : players) {
                System.out.println(player);
            }
        }

        public static void main(String[] args) {
            PlayerStorage PlayerStorage = new PlayerStorage();

            // Создание 10 игроков
            Player player1 = new Player(1, "PlayerOne", true);
            Player player2 = new Player(2, "PlayerTwo", false);
            Player player3 = new Player(3, "PlayerThree", true);
            Player player4 = new Player(4, "PlayerFour", false);
            Player player5 = new Player(5, "PlayerFive", true);
            Player player6 = new Player(6, "PlayerSix", false);
            Player player7 = new Player(7, "PlayerSeven", true);
            Player player8 = new Player(8, "PlayerEight", false);
            Player player9 = new Player(9, "PlayerNine", true);
            Player player10 = new Player(10, "PlayerTen", false);

            // Добавление игроков в турнир
            addPlayer(player1);
            addPlayer(player2);
            addPlayer(player3);
            addPlayer(player4);
            addPlayer(player5);
            addPlayer(player6);
            addPlayer(player7);
            addPlayer(player8);
            addPlayer(player9);
            addPlayer(player10);

            // Попытка добавить дубликаты
            boolean isAdded = addPlayer(player1); // Дубликат
            System.out.println("Добавление дубликата: " + isAdded); // Ожидается false

            // Вывод всех игроков в турнире
            System.out.println("Игроки в турнире:");
            showPlayers();
        }
    }
