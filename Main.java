package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;

class Utils{
    static public <T> void printValue(T val, boolean new_line){
        if (new_line){
            System.out.println(val);
        } else {
            System.out.print(val);
        }
    }

    static public String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

class ChattyBot{
    private String NAME;
    private String BIRTH_YEAR;
    private String USER_NAME;
    private int USER_AGE;

    public ChattyBot(){
        initVars();
        printGreetings();
        getUserName();
        guessAge();
        countNumbers();
        askSmth();
    }

    private void initVars(){
        GregorianCalendar calendar = new GregorianCalendar();

        NAME = "ChattyBoy";
        BIRTH_YEAR = Integer.toString(calendar.get(GregorianCalendar.YEAR));
    }

    private void printGreetings(){
        Utils.printValue("Hello! My name is ", false);
        Utils.printValue(NAME, true);
        Utils.printValue("I was created in ", false);
        Utils.printValue(BIRTH_YEAR, true);
    }

    private void getUserName(){
        Utils.printValue("Please, remind me your name.", true);
        USER_NAME = Utils.readString();
        Utils.printValue("What a great name you have, ", false);
        Utils.printValue(USER_NAME, true);
    }

    private void guessAge(){
        Utils.printValue("Let me guess your age.", true);
        Utils.printValue("Enter remainders of dividing your age by 3, 5 and 7.", true);

        int remainder3 = Integer.parseInt(Utils.readString());
        int remainder5 = Integer.parseInt(Utils.readString());
        int remainder7 = Integer.parseInt(Utils.readString());

        USER_AGE = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        Utils.printValue("Your age is ", false);
        Utils.printValue(USER_AGE, false);
        Utils.printValue("; that's a good time to start programming!", true);
    }

    private void countNumbers(){
        Utils.printValue("Now I will prove to you that I can count to any number you want.", true);
        int n = Integer.parseInt(Utils.readString());

        for (int i = 0; i <= n; ++i){
            Utils.printValue(i, false);
            Utils.printValue("!", true);
        }

        Utils.printValue("Completed, have a nice day!", true);
    }

    private void askSmth(){
        Utils.printValue("KFC or McDonald's", true);
        Utils.printValue("1. McDonald's", true);
        Utils.printValue("2. McDonald's", true);
        Utils.printValue("3. KFC", true);
        Utils.printValue("4. McDonald's", true);

        while (true){
            if (Integer.parseInt(Utils.readString()) == 3){
                Utils.printValue("Congratulations, have a nice day!", true);
                return;
            } else {
                Utils.printValue("Please, try again.", true);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        ChattyBot chattyBot = new ChattyBot();
    }
}
