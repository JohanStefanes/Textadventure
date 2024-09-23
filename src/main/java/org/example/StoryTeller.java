package org.example;

import java.util.Scanner;

public class StoryTeller {


    private String currentRoom;
    private String message;

    public void startGame() {
        System.out.println("Welcome to the tutorial! This is a simple text adventure (also called 'interactive fiction').\n" +
                "  You can: Explore different locations, pick up items (into your 'inventory') and interact with objects and the environment to solve puzzles.\n" +
                "  You interact with your environment by entering simple sentences, starting with a verb.\n" +
                "  For a list of possible verbs, enter 'help verbs'.\n" +
                "  Often it is useful to examine objects: 'examine table'.\n" +
                "  Some objects are portable, to pick up a book, enter 'take book'\n" +
                "  Start with exploring your enviromnent by visiting the other room. To do so, enter 'go east'.h");
        currentRoom = "room-one"; // Start in room-one
        play();
    }

    private void describeRoom(String room) {
        System.out.println("You are in " + room);
    }


    private void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            describeRoom(currentRoom);
            System.out.print("> ");
            String input = scanner.nextLine();
            handleCommand(input);
        }
    }

    private void handleCommand(String command) {
        if (command.equals("go east")) {
            currentRoom = "room-two";
        } else if (command.equals("go west")) {
            currentRoom = "room-one";
        } else if (command.equals("look table")) {
            System.out.println("This is a simple, wooden table. It has a small key lying on top.");
        } else {
            System.out.println("Unknown command.");
        }
    }
}
