package tdd;

import java.util.Arrays;
import java.util.Scanner;

public class PoliticalZoneApp {
    private static final MyStates zoneDetector = new MyStates();

    public static void main(String[] args) {
        myMenu();
    }

    private static void print(String input){
        System.out.println(input);
    }

    private static String input(String prompt){
        print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void myMenu() {
        print("""
                ::::::::::::::::::::::::::::::::::::::::
                :: WELCOME TO POLITICAL ZONE DETECTOR ::
                ::::::::::::::::::::::::::::::::::::::::
                Choose An Option From Below Options
                
                1. Check Your State Geopolitical Zone
                2. Check All The State In Your Geopolitical Zone
                0. Exit Program
                """);
        char navigator = input ("").charAt(0);
        switch (navigator) {
            case '1' -> checkMyZone();
            case '2' -> checkAllStates();
            case '0' -> exitProgram();
            default -> myMenu();
        }
    }

    private static void checkMyZone() {

        String myState = input("Enter your state");

        GeoPoliticalZone zone = zoneDetector.checkStateInZone(myState);
        System.out.println(zone);
        print("");

        myMenu();
    }
    private static void checkAllStates() {

       String myZone = input("Enter your Zone");

        String[] statesInZone  = zoneDetector.getAllStatesInZones(myZone);

        print(Arrays.toString(statesInZone));
        print("");

        myMenu();
    }

    private static void exitProgram() {
        System.exit(0);
    }
}
