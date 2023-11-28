package com.example.gamelauncher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BattleShip extends GameLauncher {
    DatabaseConnection
    public static final int WIDTH_MAP = 10;
    public static final int HEIGHT_MAP = 10;
    public static final int MAX_WORD_CHOSEN = 6;
    public static final int MAX_LENGTH = 7;
    private List<String> words = new ArrayList<>();
    private List<String> wordChosen = new ArrayList<>(MAX_WORD_CHOSEN);
    private List<List<String>> map = new ArrayList<>();
    private List<List<String>> currentMap = new ArrayList<>();
    private int sumLength = 0;

    public void getWordList() {
        //dataconnection
        String exec = "SELECT * FROM gameword;";
        words.clear();

        words.add("hello");
        words.add("bye");
        words.add("love");
        words.add("hate");
        words.add("red");
        words.add("green");
        words.add("blue");
        words.add("family");
        words.add("school");
        words.add("Vietnam");

        words.removeIf(word -> word.length() > MAX_LENGTH);
        words.removeIf(word -> word.contains(" "));
    }

    public void shuffle() {
        Collections.shuffle(words);
    }

    public void getWord() {
        getWordList();
        shuffle();
        wordChosen.clear();
        for (int i = 0; i < MAX_WORD_CHOSEN; i++) {
            wordChosen.add(words.get(i));
            sumLength += words.get(i).length();
        }
    }

    public void setDefaultMap() {
        map.clear();
        currentMap.clear();
        for (int i = 0; i < HEIGHT_MAP; i++) {
            List<String> tmp = new ArrayList<>();
            for (int j = 0; j < WIDTH_MAP; j++) {
                tmp.add("*");
            }
            map.add(tmp);
            currentMap.add(tmp);
        }
    }

    public void setRandomMap() {
        getWord();
        setDefaultMap();
        for (String word : wordChosen) {
            int length = word.length();
            boolean canSet = true;
            while (true) {
                int x = getRandomNumber();
                int y = getRandomNumber();
                for (int i = x; i < x + length; i++) {
                    if (i >= HEIGHT_MAP || !map.get(i).get(y).equals("*")) {
                        canSet = false;
                        break;
                    }
                }
                if (canSet) {
                    for (int i = x; i < x + length; i++) {
                        map.get(i).set(y, word.substring(i - x, i - x + 1));
                    }
                    break;
                }
                canSet = true;
                for (int j = y; j < y + length; j++) {
                    if (j >= WIDTH_MAP || !map.get(x).get(j).equals("*")) {
                        canSet = false;
                        break;
                    }
                }
                if (canSet) {
                    for (int i = y; i < y + length; i++) {
                        map.get(x).set(i, word.substring(i - y, i - y + 1));
                    }
                    break;
                }
            }
        }
    }

    public int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(0, HEIGHT_MAP);
    }

    public List<List<String>> getMap() {
        return this.map;
    }


    public List<String> getWords() {
        return words;
    }

    public List<List<String>> getCurrentMap() {
        return currentMap;
    }

    public List<String> getWordChosen() {
        return wordChosen;
    }

    public int getSumLength() {
        return sumLength;
    }

    public static void main(String[] args) {
        BattleShip b = new BattleShip();
        b.setRandomMap();
        List<List<String>> map;
        map = b.getMap();
        for(List<String> s : map) {
            for(String s2 : s) {
                System.out.print(s2 + " ");
            }
            System.out.println();
        }
    }
}
