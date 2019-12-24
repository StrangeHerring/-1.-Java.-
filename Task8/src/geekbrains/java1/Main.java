package geekbrains.java1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scanner.nextInt();
            if (a % 100 == 0 && a % 400 == 0) {
                System.out.println("Год високосный");
            } else if (a % 100 == 0) {
                System.out.println("Год не високосный");
            } else if (a % 4 == 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
    }
}
