package com.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkMail(String mail) {
        // Regular expression for validating an email address
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    public static void checkEmailList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of email addresses:");
        int numEmails = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        String[] emails = new String[numEmails];

        for (int i = 0; i < numEmails; i++) {
            System.out.println("Enter email address " + (i + 1) + ":");
            emails[i] = sc.nextLine();
        }

        System.out.println("\nVerifying Email List\n");

        for (String email : emails) {
            if (checkMail(email)) {
                System.out.println(email + " is a valid email");
            } else {
                System.out.println(email + " is NOT a valid email");
            }
        }
    }

    public static void main(String[] args) {
        checkEmailList();
    }
}
