import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = hello.nextLine();
        System.out.print("Hello " + name);

    }

}