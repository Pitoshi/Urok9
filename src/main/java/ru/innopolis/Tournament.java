package ru.innopolis;

import java.util.*;

public class Tournament {
    private Map<Player, Integer> points;

    public Tournament() {
        points = new HashMap<>();
    }

    public void addPlayer(Player player) {
        points.put(player, 0); // Изначально у всех 0 очков
    }

    public void setPoints(int playerId, int score) {
        for (Player player : points.keySet()) {
            if (player.getId() == playerId) {
                points.put(player, score);
                break;
            }
        }
    }

    public List<Map.Entry<Player, Integer>> getTopPlayers(int topN) {
        List<Map.Entry<Player, Integer>> sortedPlayers = new ArrayList<>(points.entrySet());
        sortedPlayers.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Сортировка по очкам
        return sortedPlayers.subList(0, Math.min(topN, sortedPlayers.size())); // Возвращаем только топ N игроков
    }

    public static void main(String[] args) {
        Tournament tournament = new Tournament();

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
        tournament.addPlayer(player1);
        tournament.addPlayer(player2);
        tournament.addPlayer(player3);
        tournament.addPlayer(player4);
        tournament.addPlayer(player5);
        tournament.addPlayer(player6);
        tournament.addPlayer(player7);
        tournament.addPlayer(player8);
        tournament.addPlayer(player9);
        tournament.addPlayer(player10);

        // Установка очков игрокам
        tournament.setPoints(4, 10);
        tournament.setPoints(7, 12);
        tournament.setPoints(8, 11);
        tournament.setPoints(9, 13);
        tournament.setPoints(10, 5);

        // Получение и вывод 3 лучших игроков
        List<Map.Entry<Player, Integer>> topPlayers = tournament.getTopPlayers(3);

        System.out.println("Топ 3 игрока турнира:");
        for (Map.Entry<Player, Integer> entry : topPlayers) {
            System.out.println(entry.getKey() + " - Очки: " + entry.getValue());
        }
    }
}