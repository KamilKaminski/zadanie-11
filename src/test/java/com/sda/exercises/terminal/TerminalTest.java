package com.sda.exercises.terminal;

import org.junit.Test;

import java.util.Scanner;

public class TerminalTest {

    @Test
    public void workTest(){
        Terminal terminal = new Terminal();
        terminal.scanner = new Scanner("5\n");
        terminal.work();

    }
}
