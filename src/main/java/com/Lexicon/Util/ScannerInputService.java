package com.Lexicon.Util;

import java.util.Scanner;

public class ScannerInputService {
    private Scanner scanner;

    public ScannerInputService() {
        this.scanner = new Scanner(System.in);
    }
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNextLine() {
        System.out.println("Enter a name or an ID. ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        ScannerInputService inputService = new ScannerInputService();
        String input = inputService.getNextLine();
        System.out.println("You entered: " +input);
    }

}
