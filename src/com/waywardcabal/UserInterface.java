package com.waywardcabal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    public UIState askUser() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose one of the following:");
        System.out.println("1. Output one");
        System.out.println("2. Output two");
        System.out.println("0. Exit program");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch(input) {
            case "1": return this.one();
            case "2": return this.two();
            case "0": return null;
            default:
                System.out.println("Invalid input");
                return this.askUser();
        }
    }

    public UIState one() {
        System.out.println("1.");
        return this.askUser();
    }

    public UIState two() {
        System.out.println("two.");
        return this.askUser();
    }

}

