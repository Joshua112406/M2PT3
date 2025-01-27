import java.util.Scanner;

public class Part3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();

        System.out.print("Enter your height in meters: "); 
        double height = scanner.nextDouble();

        int result = favoriteNumber * 2;

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Your favorite number multiplied by 2 is: " + result);
        System.out.println("Your height is " + height + " meters."); 
    }
}