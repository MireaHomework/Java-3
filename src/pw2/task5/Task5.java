package pw2.task5;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    /*
    9. Напишите программу Poker.java, которая должна имитировать раздачу карт для игры в покер. Программа получает
    число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из перетасованной
    колоды. Разделяйте пять карт, выданных каждому игроку, пустой строкой
    */

    public static void main(String[] args) {
        // Создание колоды
        String[] cardValues = "2 3 4 5 6 7 8 9 10 J Q K A".split(" ");
        String[] cardSuits = "♣️ ♠️ ♦️ ♥️".split(" ");
        ArrayList<String> deck = new ArrayList<>() {{
            for (String cardSuit : cardSuits) {
                for (String cardValue : cardValues) {
                    add(cardValue + cardSuit);
                }
            }
        }};

        // Создание "рук" игроков
        int playersAmount = 3;
        ArrayList<ArrayList<String>> playersHands = new ArrayList<>();
        for (int i = 0; i < playersAmount; i++) {
            playersHands.add(new ArrayList<>());
        }

        // Раздача карт
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (ArrayList<String> playerHand : playersHands) {
                String card = deck.remove(random.nextInt(deck.size()));
                playerHand.add(card);
            }
        }

        // Вывод карт на руке
        int playerNumber = 0;
        for (ArrayList<String> playerHand : playersHands) {
            playerNumber++;
            System.out.print(playerNumber + "-й игрок: ");
            for (String card : playerHand) {
                System.out.print(card + " ");
            }
            System.out.print("\n");
        }
    }
}
