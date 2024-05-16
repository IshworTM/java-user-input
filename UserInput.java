import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:\n>> ");
        String name = sc.nextLine();
        System.out.println("Hello! " + name + ", welcome to the server.");
        sc.close();
    }
}