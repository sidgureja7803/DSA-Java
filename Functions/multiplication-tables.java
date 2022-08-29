import java.util.Scanner;

public class First_prog {
    public static void printTable (int x) {
        for (int i = 1; i <= 10; i++) {
            int s = x * i;
            System.out.println(x + " * " + i + " = " + s);
        }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int j = 1; j <= 10; j++) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            printTable(a);
        }
    }

}
