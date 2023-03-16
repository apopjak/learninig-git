package com.popjak.user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO {
    static String PATH = "src/main/resources/users.csv";

    static File accessToCSV() throws IOException {
        File file = new File(PATH);
        if (!file.exists()) {
            file.createNewFile();
            return file;
        }
        return file;
    }

    void addToCSV(User user) {
        try(
                // closable flushable
                FileWriter fileWriter = new FileWriter(accessToCSV(),true);
                PrintWriter writer = new PrintWriter(fileWriter);
        ){
            writer.print(user);
            System.out.println("CUSTOM");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    List<User> getList() {
        List<User> allUsers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(accessToCSV());
            while (scanner.hasNext()) {
                String a = scanner.nextLine();
                List<String> temporaryList = new ArrayList<>(new ArrayList<>(List.of(a.split(","))));
                User user = new User(temporaryList.get(0), temporaryList.get(1));
                allUsers.add(user);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return allUsers;
    }
}

