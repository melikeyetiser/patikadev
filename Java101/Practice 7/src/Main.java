import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, resetChoice;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("You are logged in.");
        } else if (!password.equals("java123") && username.equals("patika")) {
            System.out.print("Do you want to reset your password? (yes/no) : ");
            resetChoice = input.nextLine();

            if (resetChoice.equals("yes")) {
                System.out.print("Enter a new password: ");
                String newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.err.println("Your new password cannot be the same as your " +
                            "original password!");
                } else {
                    System.out.println("Your password is updated successfully!");
                }
            }
        } else {
            System.err.println("Invalid username!");
        }
    }
}