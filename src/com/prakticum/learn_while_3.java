package com.prakticum;
import java.util.Scanner;

public class learn_while_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0; // Сумма
            int input = scanner.nextInt(); // Ввод пользователя

            while (input != 0) {
                sum = sum + input;
                input = scanner.nextInt();
            }
            System.out.println("Сумма введённых чисел: " + sum);
        }
}
