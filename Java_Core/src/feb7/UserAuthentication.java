package feb7;

import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        final String correctUsername = "admin";
        final String correctPassword = "password";
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Authentication successful! Welcome, " + username + ".");
                break;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        } while (true);

        scanner.close();
    }
}
