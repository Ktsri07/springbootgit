package com.tejasri.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public static LocalDate readDate(String prompt) {
        System.out.print(prompt + " (yyyy-mm-dd): ");
        return LocalDate.parse(scanner.nextLine());
    }
}
