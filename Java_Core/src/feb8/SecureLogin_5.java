package feb8;


import java.util.Scanner;

public class SecureLogin_5 {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            try {
                System.out.print("Username: ");
                String username = scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();

                authenticate(username, password);
                System.out.println("Login successful!");
                break; // Exit loop on successful login
            } catch (AuthenticationException e) {
                attempts++;
                System.out.println("Invalid credentials. " + (MAX_ATTEMPTS - attempts) + " attempts remaining.");
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Account locked due to multiple failed attempts.");
        }
    }

    private static void authenticate(String username, String password) throws AuthenticationException {
        if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
            throw new AuthenticationException("Incorrect username or password.");
        }
    }

    static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }
}
