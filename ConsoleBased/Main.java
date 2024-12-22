import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {
            System.out.println("Hello, " + name + "!");
        }
        scanner.close();
    }
}
