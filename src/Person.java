import java.util.Scanner;

public class Person {
        public static void main(String[] args) {
        System.out.println("Hello Person");
        System.out.println("Hello World");
        System.out.println("You are great");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello " + name);
/*String name = "Joe";
int age = 89;
int height = 160;
int weight = 53;
        System.out.println(name + ", " + age + ", " + height + ", " + weight);*/
    }
}
