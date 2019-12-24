package geekbrains.java1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean result = true;
        if (a < 0) System.out.println(result);
    }
}
