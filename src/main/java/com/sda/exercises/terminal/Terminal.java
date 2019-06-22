package com.sda.exercises.terminal;

import java.util.Scanner;

public class Terminal {

    private int number;
    private Scanner scanner;
    char character = "*";

    public Terminal(Scanner scanner) {
        this.scanner = new scanner(System.in);
    }

    public void work() {
        System.out.println("Podaj liczbę >");
        String input = scanner.next();
        try {
            this.number = parseInteger(input);
        }catch (NumberFormatException e)  {
            e.printStackTrace();
            work();
            return;
        }
        TerminalService terminalService = new TerminalService();
        System.out.println(terminalService.createLine(number));
    }

    private int parseInteger(String input){
        Integer integer = Integer.getInteger(input);
        return integer;
    }

    private String writeOnTerminal() {
        String line = "";
        for (int i = 0; i<number; i++) {
           StringBuilder.append(character);
        }
        return StringBuilder.toString();
    }
}
