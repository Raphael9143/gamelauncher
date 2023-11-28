package com.example.gamelauncher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class getwordlist {
    public static void main(String[] args) {
        List<String> targets = new ArrayList<>();
        List<String> explains = new ArrayList<>();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("C:\\INT 2204 (OOP)\\java\\GameLauncher\\src\\main\\resources\\com\\example\\gamelauncher\\word.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] cur = line.split("-");
                targets.add(cur[0]);
                explains.add(cur[1]);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("C:\\INT 2204 (OOP)\\java\\GameLauncher\\src\\main\\resources\\com\\example\\gamelauncher\\data.txt");
            for (int i = 0; i < targets.size(); i++) {
                fw.write("INSERT INTO gameword(word_target, word_explain) VALUES ('" + targets.get(i) + "', '" + explains.get(i) + "');\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < targets.size(); i++) {
            System.out.println("INSERT INTO gameword(word_target, word_explain) VALUES ('" + targets.get(i) + "', '" + explains.get(i) + "');");
        }
    }
}
